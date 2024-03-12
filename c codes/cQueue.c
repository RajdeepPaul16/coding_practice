#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 5
int count = 0;

typedef struct {
    char info[MAX][25];
    int f,r;
} Queue;

int isEmpty(Queue q) {
    return (q.f == (q.r+1)%MAX);
}

int isFull(Queue q) {
    return (q.r == MAX - 1);
}

void Insert(Queue *q) {
    if (isFull(*q)) {
        printf("Queue Overflow\n");
        return;
    }
    char value[25];
    printf("Enter the value to be pushed: ");
    scanf("%s", value);
    strcpy(q->info[q->r = (q->r+1)%MAX],value);
    printf("Value %s has been inserted.\n", value);
    if(q->f == -1){
        q->f = 0;
    }
    count++;
}

void Delete(Queue *q) {
    if (isEmpty(*q)) {
        printf("Queue Underflow\n");
        return;
    }
    printf("%s is deleted\n", q->info[q->f]);
    if(q->f == q->r) {
        q->f = q->r = -1;
    }
    else{
        q->f = (q->f+1)%MAX;
    }
    count--;
}

void display(Queue q) {
    int i = 1;
    if (isEmpty(q)) {
        printf("Queue Empty\n");
        return;
    }
    printf("Queue Begin-> ");
    while (i <= count) {
        printf("%s-> ", q.info[q.f]);
        q.f=(q.f+i)%MAX;
        i++;
    }
    printf("End\n");
}

int main() {
    Queue q;
    q.r = q.f = -1;

    int choice;
    while (1) {
        printf("\n1: Insert\n2: Delete\n3: Display\n4: Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                Insert(&q);
                break;
            case 2:
                Delete(&q);
                break;
            case 3:
                display(q);
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid value\n");
        }
    }
    return 0;
}