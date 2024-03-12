#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Library {
    char book_name[20];
    char author[20];
    float price;
    int count_same_books;
    struct Library* left;
    struct Library* right;
} Library;

Library* root = NULL;

Library* createBookNode(const char* book_name, const char* author, float price) {
    Library* newNode = (Library*)malloc(sizeof(Library));
    if (newNode == NULL) {
        fprintf(stderr, "Memory allocation error.\n");
        exit(1);
    }

    strcpy(newNode->book_name, book_name);
    strcpy(newNode->author, author);
    newNode->price = price;
    newNode->count_same_books = 1;
    newNode->left = newNode->right = NULL;

    return newNode;
}

Library* insertBook(Library* node, const char* book_name, const char* author, float price) {
    if (node == NULL) {
        return createBookNode(book_name, author, price);
    }

    while (1) {
        int compareResult = strcmp(book_name, node->book_name);

        if (compareResult < 0) {
            if (node->left == NULL) {
                node->left = createBookNode(book_name, author, price);
                return node->left;
            }
            node = node->left;
        } else if (compareResult > 0) {
            if (node->right == NULL) {
                node->right = createBookNode(book_name, author, price);
                return node->right;
            }
            node = node->right;
        } else {
            // Same book found, increment count
            node->count_same_books++;
            return node;
        }
    }
}

Library* findBook(Library* node, const char* book_name) {
    while (node != NULL && strcmp(book_name, node->book_name) != 0) {
        if (strcmp(book_name, node->book_name) < 0) {
            node = node->left;
        } else {
            node = node->right;
        }
    }

    return node;
}

void displayBook(Library* book) {
    printf("Book Name: %s\n", book->book_name);
    printf("Author: %s\n", book->author);
    printf("Price: %.2f\n", book->price);
    printf("Count of Same Books: %d\n", book->count_same_books);
    printf("-----------------------\n");
}

void inorderTraversal(Library* node) {
    Library* stack[100]; // Assuming a maximum of 100 nodes in the tree
    int top = -1;

    while (node != NULL || top != -1) {
        while (node != NULL) {
            stack[++top] = node;
            node = node->left;
        }

        node = stack[top--];
        displayBook(node);
        node = node->right;
    }
}

void displayBooksByAuthor(Library* node, const char* author) {
    if (node != NULL) {
        displayBooksByAuthor(node->left, author);

        if (strcmp(author, node->author) == 0) {
            displayBook(node);
        }

        displayBooksByAuthor(node->right, author);
    }
}

void addBookToLibrary(const char* book_name, const char* author, float price) {
    if (root == NULL) {
        root = createBookNode(book_name, author, price);
    } else {
        insertBook(root, book_name, author, price);
    }
}

void borrowBook(const char* book_name) {
    Library* book = findBook(root, book_name);

    if (book != NULL && book->count_same_books > 0) {
        printf("Book borrowed successfully:\n");
        displayBook(book);
        book->count_same_books--;
    } else {
        printf("Book not available for borrowing.\n");
    }
}

int main() {
    char role;
    char ar_nm[30], book_name[20];
    int input;

    while (1) {
        printf("Are you the library owner (O) or a student (S)? (Enter 'E' to exit) ");
        scanf(" %c", &role);

        if (role == 'E' || role == 'e') {
            exit(0);
        } else if (role == 'O' || role == 'o') {
            printf("\n\n**###### WELCOME TO E-LIBRARY (Owner) #####\n");
            printf("1. Add book information\n2. Display book information\n");
            printf("3. List all books of given author\n");
            printf("4. List the count of books in the library\n");
            printf("5. Exit\n\nEnter one of the above: ");
            scanf("%d", &input);

            switch (input) {
                case 1:
                    printf("Enter book name: ");
                    scanf("%s", book_name);
                    printf("Enter author name: ");
                    scanf("%s", ar_nm);
                    printf("Enter price: ");
                    float price;
                    scanf("%f", &price);
                    addBookToLibrary(book_name, ar_nm, price);
                    break;

                case 2:
                    printf("You have entered the following information:\n");
                    inorderTraversal(root);
                    break;

                case 3:
                    printf("Enter author name: ");
                    scanf("%s", ar_nm);
                    printf("Books by %s:\n", ar_nm);
                    displayBooksByAuthor(root, ar_nm);
                    break;

                case 4:
                    printf("\nNumber of books in the library: %d\n", root != NULL ? root->count_same_books : 0);
                    break;

                case 5:
                    exit(0);
            }
        } else if (role == 'S' || role == 's') {
            printf("\n\n**###### WELCOME TO E-LIBRARY (Student) #####\n");
            printf("1. Borrow a book\n2. Display book information\n");
            printf("3. List all books of given author\n");
            printf("4. Exit\n\nEnter one of the above: ");
            scanf("%d", &input);

            switch (input) {
                case 1:
                    printf("Enter the name of the book to borrow: ");
                    scanf("%s", book_name);
                    borrowBook(book_name);
                    break;

                case 2:
                    printf("You have entered the following information:\n");
                    inorderTraversal(root);
                    break;

                case 3:
                    printf("Enter author name: ");
                    scanf("%s", ar_nm);
                    printf("Books by %s:\n", ar_nm);
                    displayBooksByAuthor(root, ar_nm);
                    break;

                case 4:
                    exit(0);
            }
        } else {
            printf("Invalid role. Please enter 'O' for owner or 'S' for student.\n");
        }
    }

    return 0;
}
