// amresh2004@Amresh:~$ sudo apt install openmpi-bin openmpi-common libopenmpi-dev
// amresh2004@Amresh:~$ sudo dnf install epel-release
// amresh2004@Amresh:~$ sudo dnf install openmpi openmpi-devel
// amresh2004@Amresh:~$ mpicc --version
// amresh2004@Amresh:~$ su -c 'dnf install sudo'
// amresh2004@Amresh:~$ module load mpi/openmpi-x86_64
// amresh2004@Amresh:~$ which mpicc
// amresh2004@Amresh:~$ vim Demo1.c
// amresh2004@Amresh:~$ mpicc Demo1.c
// amresh2004@Amresh:~$ ./a.out

#include<mpi.h>
#include<stdio.h>
int main(int argc, char** argv)
{
	MPI_Init(NULL,NULL);
	int world_size;
	MPI_Comm_size(MPI_COMM_WORLD,&world_size);
	int world_rank;
        MPI_Comm_rank(MPI_COMM_WORLD,&world_rank);
	char processor_name[MPI_MAX_PROCESSOR_NAME];
	int name_len;
	MPI_Get_processor_name(processor_name,&name_len);
	printf("Helo world from processor %s, rank %d out of %d processor\n",processor_name,world_rank,world_size);
	MPI_Finalize();
}

