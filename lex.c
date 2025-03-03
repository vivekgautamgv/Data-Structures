#include <stdio.h>
#include <string.h>

#define SIZE 5

typedef struct {
    char code[4];
    char name[50];
} Airport;

int main() {
    Airport airports[SIZE] = {
        {"LAX", "Los Angeles International Airport"},
        {"JFK", "John F. Kennedy International Airport"},
        {"ORD", "O'Hare International Airport"},
        {"DXB", "Dubai International Airport"},
        {"SIN", "Singapore Changi Airport"}
    };

    char input[4];
    printf("Enter airport code: ");
    scanf("%s", input);

    for (int i = 0; i < SIZE; i++) {
        if (strcmp(input, airports[i].code) == 0) {
            printf("Airport Name: %s\n", airports[i].name);
            return 0;
        }
    }

    printf("Airport code not found!\n");
    return 0;
}
