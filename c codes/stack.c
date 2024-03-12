#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 5

typedef struct {
    char info[MAX][25];
    int top;
} Stack;

int isEmpty(Stack stack) {
    return (stack.top == -1);
}

int isFull(Stack stack) {
    return (stack.top == MAX - 1);
}

void push(Stack *stack) {
    if (isFull(*stack)) {
        printf("Stack Overflow\n");
        return;
    }
    char value[25];
    printf("Enter the value to be pushed: ");
    scanf("%s", value);
    strcpy(stack->info[++stack->top],value);
    printf("Value %s has been pushed.\n", value);
}

void pop(Stack *stack) {
    if (isEmpty(*stack)) {
        printf("Stack Underflow\n");
        return;
    }
    printf("%s is deleted\n", stack->info[stack->top--]);
    
}

void display(Stack stack) {
    int i = 0;
    if (isEmpty(stack)) {
        printf("Stack Empty\n");
    } else {
        printf("Stack Begin-> ");
        while (i <= stack.top) {
            printf("%s-> ", stack.info[i]);
            i++;
        }
        printf("End\n");
    }
}

int main() {
    Stack s;
    s.top = -1; // Initialize the top of the stack

    int choice;
    while (1) {
        printf("\n1: Push\n2: Pop\n3: Display\n4: Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                push(&s);
                break;
            case 2:
                pop(&s);
                break;
            case 3:
                display(s);
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid value\n");
        }
    }

    return 0;
}