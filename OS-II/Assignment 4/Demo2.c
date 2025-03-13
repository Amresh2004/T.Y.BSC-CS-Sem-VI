#include<stdio.h>
#include<mpi.h>
#include<string.h>
const int MAX_STRING=100;
int main(void)
{
	char g[MAX_STRING];
	int comm_sz;
	int my_rank;
	int i;
	MPI_Init(NULL,NULL);
	MPI_Comm_size(MPI_COMM_WORLD,&comm_sz);
	MPI_Comm_rank(MPI_COMM_WORLD,&my_rank);
	if(my_rank!=0)
	{
		sprintf(g,"Greetings from Process %d of %d!",my_rank,comm_sz);
		MPI_Send(g,strlen(g)+1,MPI_CHAR,0,0,MPI_COMM_WORLD);
	}
	else
	{
		printf("Greeting from process %d of %d!\n",my_rank,comm_sz);
		for(i=1;i<comm_sz;i++)
		{
			MPI_Recv(g,MAX_STRING,MPI_CHAR,i,0,MPI_COMM_WORLD,MPI_STATUS_IGNORE);
			printf("%s\n",g);
		}
	}
	MPI_Finalize();
	return 0;
}

