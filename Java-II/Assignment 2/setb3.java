import java.util.Random;

class NumberGenerator extends Thread {
    private SharedResource resource;

    public NumberGenerator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100); // Generate a random number between 0-99
            resource.setNumber(num);
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private SharedResource resource;

    public SquareCalculator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            int num = resource.getEvenNumber();
            if (num != -1) {
                System.out.println("Square of " + num + " is: " + (num * num));
            }
        }
    }
}

class CubeCalculator extends Thread {
    private SharedResource resource;

    public CubeCalculator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            int num = resource.getOddNumber();
            if (num != -1) {
                System.out.println("Cube of " + num + " is: " + (num * num * num));
            }
        }
    }
}

class SharedResource {
    private int number;
    private boolean isNewNumber = false;

    public synchronized void setNumber(int num) {
        while (isNewNumber) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number = num;
        isNewNumber = true;
        System.out.println("Generated Number: " + number);
        notifyAll();
    }

    public synchronized int getEvenNumber() {
        while (!isNewNumber || number % 2 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isNewNumber = false;
        notifyAll();
        return number;
    }

    public synchronized int getOddNumber() {
        while (!isNewNumber || number % 2 == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isNewNumber = false;
        notifyAll();
        return number;
    }
}

public class setb3 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        NumberGenerator generator = new NumberGenerator(resource);
        SquareCalculator squareCalculator = new SquareCalculator(resource);
        CubeCalculator cubeCalculator = new CubeCalculator(resource);
        
        generator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
