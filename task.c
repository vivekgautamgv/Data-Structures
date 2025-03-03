#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_ITINERARY 100

typedef struct {
    char destination[50];
    char date[15];
    char activity[100];
} Itinerary;

Itinerary itinerary[MAX_ITINERARY];
int itineraryCount = 0;

void addItinerary() {
    if (itineraryCount >= MAX_ITINERARY) {
        printf("Itinerary is full!\n");
        return;
    }

    printf("Enter destination: ");
    scanf(" %[^\n]", itinerary[itineraryCount].destination);
    printf("Enter date (DD/MM/YYYY): ");
    scanf("%s", itinerary[itineraryCount].date);
    printf("Enter activity: ");
    scanf(" %[^\n]", itinerary[itineraryCount].activity);

    itineraryCount++;
    printf("Itinerary added successfully!\n");
}

void modifyItinerary() {
    int index;
    printf("Enter the itinerary number to modify (1 to %d): ", itineraryCount);
    scanf("%d", &index);

    if (index < 1 || index > itineraryCount) {
        printf("Invalid index!\n");
        return;
    }

    index--; // Convert to zero-based index
    printf("Enter new destination: ");
    scanf(" %[^\n]", itinerary[index].destination);
    printf("Enter new date (DD/MM/YYYY): ");
    scanf("%s", itinerary[index].date);
    printf("Enter new activity: ");
    scanf(" %[^\n]", itinerary[index].activity);

    printf("Itinerary updated successfully!\n");
}

void deleteItinerary() {
    int index;
    printf("Enter the itinerary number to delete (1 to %d): ", itineraryCount);
    scanf("%d", &index);

    if (index < 1 || index > itineraryCount) {
        printf("Invalid index!\n");
        return;
    }

    index--; // Convert to zero-based index
    for (int i = index; i < itineraryCount - 1; i++) {
        itinerary[i] = itinerary[i + 1];
    }
    itineraryCount--;

    printf("Itinerary deleted successfully!\n");
}

void displayItinerary() {
    if (itineraryCount == 0) {
        printf("No itinerary recorded.\n");
        return;
    }

    printf("\nTravel Itinerary:\n");
    printf("----------------------------------------------------------\n");
    for (int i = 0; i < itineraryCount; i++) {
        printf("%d. Destination: %s | Date: %s | Activity: %s\n", 
               i + 1, itinerary[i].destination, itinerary[i].date, itinerary[i].activity);
    }
    printf("----------------------------------------------------------\n");
}

int main() {
    int choice;

    while (1) {
        printf("\nTravel Itinerary Planner\n");
        printf("1. Add Itinerary\n");
        printf("2. Modify Itinerary\n");
        printf("3. Delete Itinerary\n");
        printf("4. Display Itinerary\n");
        printf("5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1: addItinerary(); break;
            case 2: modifyItinerary(); break;
            case 3: deleteItinerary(); break;
            case 4: displayItinerary(); break;
            case 5: exit(0);
            default: printf("Invalid choice! Try again.\n");
        }
    }

    return 0;
}
