
#include<stdio.h>

int n = 5, m = 3, j, i, cnt;
int work[] = {3, 3, 2};
int max[7][7];
int allo[7][7];
int need[7][7];
int ss[5];
int finish[5];

void print(int x[7][7]) {
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++)
            printf("%d\t", x[i][j]);
        printf("\n");
    }
}

void acceptdata(int x[7][7]) {
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++)
            scanf("%d", &x[i][j]);
    }
}

void computeneed() {
    int i, j;
    for (i = 0; i < n; i++)
        for (j = 0; j < m; j++)
            need[i][j] = max[i][j] - allo[i][j];
}

int checkneed(int i) {
    int j;
    cnt = 0;
    for (j = 0; j < m; j++)
        if (need[i][j] <= work[j])
            cnt++;
    if (cnt == m)
        return 1;
    else
        return 0;
}

void checkstate() {
    int flag = 0;
    int k = 0, cnt = 0;
    for (i = 0; i < n; i++)
        finish[i] = 0;
    while (1) {
        flag = 0;
        for (i = 0; i < n; i++) {
            if (finish[i] == 0)
                if (checkneed(i) == 1) {
                    for (j = 0; j < m; j++)
                        work[j] = work[j] + allo[i][j];
                    finish[i] = 1;
                    flag = 1;
                    ss[k++] = i;
                }
        }
        if (n == k) {
            cnt = 1;
            break;
        }
        if (flag == 0) {
            printf("Not in safe state\n");
            break;
        }
    }
    if (cnt == 1) {
        printf("Safe sequence is\n");
        for (i = 0; i < n; i++)
            printf("P%d\t", ss[i]);
        printf("\n");
    }
}

int requestresource(int process, int request[]) {
    int j;
    for (j = 0; j < m; j++) {
        if (request[j] > need[process][j]) {
            printf("Error: Request exceeds maximum need\n");
            return 0;
        }
        if (request[j] > work[j]) {
            printf("Error: Resources not available\n");
            return 0;
        }
    }
    // Temporarily allocate resources
    for (j = 0; j < m; j++) {
        work[j] -= request[j];
        allo[process][j] += request[j];
        need[process][j] -= request[j];
    }

    // Check if the system remains in a safe state
    int original_work[m];
    for (j = 0; j < m; j++)
        original_work[j] = work[j];

    checkstate();

    // Restore original state if unsafe
    for (j = 0; j < m; j++) {
        work[j] = original_work[j];
        allo[process][j] -= request[j];
        need[process][j] += request[j];
    }

    return 1;
}

int main() {
    int choice, process, request[7];

    printf("Allocation matrix\n");
    acceptdata(allo);
    print(allo);
    printf("\n\n");
    printf("Max matrix\n");
    acceptdata(max);
    print(max);
    printf("Need matrix\n");
    computeneed();
    print(need);
    printf("Work is\n");
    for (i = 0; i < m; i++)
        printf("%d\t", work[i]);

    while (1) {
        printf("\n\nChoose an option:\n");
        printf("1. Check safe state\n");
        printf("2. Request resources\n");
        printf("3. Exit\n");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            checkstate();
            break;
        case 2:
            printf("Enter process number: ");
            scanf("%d", &process);
            printf("Enter resource request for process P%d:\n", process);
            for (i = 0; i < m; i++)
                scanf("%d", &request[i]);
            if (requestresource(process, request))
                printf("Request granted\n");
            break;
        case 3:
            return 0;
        default:
            printf("Invalid choice!\n");
        }
    }
}
