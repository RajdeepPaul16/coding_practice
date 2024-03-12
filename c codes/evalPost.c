#include <stdio.h>
#include <string.h>
#include <math.h>
#include <ctype.h>
#define MAX 25
typedef struct{
    float items[MAX];
    int top;
}Stack;
void push(Stack *s, float item){
    s->items[++s->top] = item;
}
float pop(Stack *s){
    return s->items[s->top--];
}
float compute(float op1, char ch, float op2){
    switch(ch){
        case '+':return op1 + op2;
        case '-':return op1 - op2;
        case '*':return op1 * op2;
        case '/':return op1 / op2;
        case '^':
        case '$':return pow(op1, op2);
    }
}
int main(){
    Stack s;
    char post[30], symb;
    float n1, n2, res, data;
    int i;
    s.top=-1;
    printf("Enter a valid postfix expression: ");
    scanf("%s", post);
    for(i=0; post[i]!='\0'; i++){
        symb = post[i];
        if(isdigit(symb))
            push(&s, symb-'0');
        else if(isalpha(symb)){
            printf("\n%c=", symb);
            scanf("%f", data);
            push(&s, data);
        }
        else {
            n2 = pop(&s);
            n1 = pop(&s);
            res = compute(n1, symb, n2);
            push(&s, res);
        }
    }
    printf("\nResult: %f\n", pop(&s));
    return 0;
}