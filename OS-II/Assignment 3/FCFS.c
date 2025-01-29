#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int current, req[20], i, n, mov = 0;

    printf("Enter Total Number of Requests: ");
    scanf("%d", &n);

    printf("Enter the Current Position of the Disk Head: ");
    scanf("%d", &current);

    printf("Enter the Requests:\n");
    for (i = 0; i < n; i++) 
    {
        scanf("%d", &req[i]);
    }

    printf("Disk Head Movement: ");
    for (i = 0; i < n; i++) 
    {
        printf("%d", current);
        if (i < n - 1) 
	{
            printf(" -> ");
        }
        mov += abs(current - req[i]);
        current = req[i];
    }
    printf("\n");
    printf("Final Position of the Disk Head: %d\n", current);
    printf("Total Seek Time: %d\n", mov);

    return 0;
}

