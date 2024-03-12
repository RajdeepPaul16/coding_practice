#include <stdio.h>
#include <string.h>
#include <math.h>
#include <ctype.h>
#define MAX 25

typedef struct{
    char items[MAX];
    int top;
}Stack;
void push(Stack *s, char item){
    s->items[++s->top] = item;
}
char pop(Stack *s){
    return s->items[s->top--];
}
char peek(Stack s){
    return s.items[s.top];
}
int preced(char c){
    switch(c){
        case '#':
        case '(':return 0;
        case '+':
        case '-':return 1;
        case '*':
        case '/':
        case '%':return 2;
        case '^':
        case '$':return 3;
    }
}
int main (){
    Stack s;
    s.top = -1;
    char in[30], post[30], ch, symb;
    int i, j;
    printf("Enter a valid infix expression: ");
    scanf("%s",in);
    push(&s, '#');
    for(i=0; in[i]!='\0'; i++){
        symb = in[i];
        if(isalnum(symb))
            post[j++] = symb;
        else{
            switch(symb){
                case '(': push(&s, '('); break;
                case ')': while((ch=pop(&s))!='(');
                    post[j++] = ch;
                    break;
                default: while(preced(symb)<=preced(peek(s))){
                    if(symb == peek(s)&&preced(symb)==3)
                        break;
                    post[j++] = pop(&s);
                }
                push(&s, symb);
            }
        }
    }
    while(peek(s)!='#')
        post[j++] = pop(&s);
    post[j] = '\0';
    printf("The resultant postfix expression: \n");
    printf("%s", post);
    return 0;
}