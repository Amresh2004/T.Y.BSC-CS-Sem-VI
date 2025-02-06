#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int current, req[20], i, n, mov = 0, completed[20] = {0};

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
    for (int count = 0; count < n; count++) 
    {
        int min_distance = 1e9, next_index = -1;
        for (i = 0; i < n; i++) 
	{
            if (!completed[i]) 
	    {
                int distance = abs(current - req[i]);
                if (distance < min_distance) 
		{
                    min_distance = distance;
                    next_index = i;
                }
            }
        }

        if (next_index != -1) 
	{
            printf("%d", current);
            if (count < n - 1) 
	    {
                printf(" -> ");
            }

            mov += min_distance;
            current = req[next_index];
            completed[next_index] = 1;
        }
    }
    printf("%d\n", current);

    printf("Final Position of the Disk Head: %d\n", current);
    printf("Total Seek Time: %d\n", mov);

    return 0;
}

/*#include<stdio.h>
#include<stdlib.h>
int main()
{
int readyq[100],i,n,totalhead=0,initial,count=0;
printf("Enter no of requests");
scanf("%d",&n);
printf("Enter no of request sequence");
for(i=0;i<n;i++)
{
scanf("%d",&readyq[i]);
}
printf("Enter initial head position");
scanf("%d",&initial);
while(count!=n)
{
int min=1000,diff,index;
for(i=0;i<n;i++)
{
diff=abs(readyq[i]-initial);
if(min>diff)
{
min=diff;
index=i;
}
}
totalhead=totalhead+min;
initial=readyq[index];
readyq[index]=1000;
count++;
}
printf("total head movements is %d",totalhead);
}*/
