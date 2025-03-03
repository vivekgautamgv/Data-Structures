#include <stdio.h>
#include <string.h>

#define SIZE 3

typedef struct {
    char word[10];
    char english[10];
    char spanish[10];
} Dictionary;

int main() {
    Dictionary words[SIZE] = {
        {"Hello", "Hello", "Hola"},
        {"Thank", "Thank", "Gracias"},
        {"Goodbye", "Goodbye", "Adios"}
    };

    char input[10], lang[10];
    printf("Enter word (Hello/Thank/Goodbye) and language (English/Spanish): ");
    scanf("%s %s", input, lang);

    for (int i = 0; i < SIZE; i++) {
        if (strcmp(input, words[i].word) == 0) {
            if (strcmp(lang, "English") == 0)
                printf("Translation: %s\n", words[i].english);
            else if (strcmp(lang, "Spanish") == 0)
                printf("Translation: %s\n", words[i].spanish);
            else
                printf("Language not supported!\n");
            return 0;
        }
    }

    printf("Word not found!\n");
    return 0;
}
