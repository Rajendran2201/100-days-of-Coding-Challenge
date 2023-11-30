#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

//function declaration 
int findNextElement(int *size);
void smartMoveByComputer(int *size, int *numberOfMarbles);
void getFromUser(int *size, int *numberOfMarbles);
void generateByComputer(int *size, int *numberOfMarbles);


int flag;   // global variable 

// function to find the power of two minus 1 element for smart mode 
int findNextElement(int *size) {
    int nextElement = 1;
    while (pow(nextElement,2)-1 <= *size / 2) {
        nextElement = nextElement * 2 + 1;
    }
    return nextElement;
}

// function to generate the number of marbles by the compiter in smart mode 
void smartMoveByComputer(int *size, int *numberOfMarbles) {
    *numberOfMarbles = findNextElement(size);
    printf("\nThe marbles taken by computer: %d", *numberOfMarbles);
    *size -= *numberOfMarbles;
    flag = 1;
}


//function to get the number of marbles from the user 
void getFromUser(int *size, int *numberOfMarbles) {
    int userInput;
    while (1) {
        printf("\nEnter the number of marbles to be removed (range: 1-%d) : ", (*size / 2));
        scanf("%d", &userInput);

        if (userInput >= 1 && userInput <= (*size / 2)) {
            *numberOfMarbles = userInput;
            *size -= *numberOfMarbles;
            flag = 0;
            break; 
        } else {
            printf("Invalid input! Please enter a value within the specified range.\n");
        }
    }
}

//function to generate the number of marbles  by the computer in stupid mode 
void generateByComputer(int *size, int *numberOfMarbles) {  
    *numberOfMarbles = rand() % (*size / 2) + 1;
    printf("\nThe marbles taken by computer: %d", *numberOfMarbles);
    *size -= *numberOfMarbles;
    flag = 1;
}

int main() {

    int size, mode, firstMove, numberOfMarbles;
    srand(time(NULL)); // seeding of time 

    // generating the size of the pile
    size = rand() % 89;

    // generating the mode of the computer
    mode = (rand() % 2);
    if (mode == 0) {
        printf("\nStupid Mode ON");
    } else {
        printf("\nSmart Mode ON");
    }

    // generating random number to determine who plays first
    firstMove = rand() % 2;

   
    if (mode == 0) { // Stupid Mode
        if (firstMove == 0) {
            getFromUser(&size, &numberOfMarbles);
        } else {
            generateByComputer(&size, &numberOfMarbles);
        }

        while (size > 1) {
            if (flag == 0) {
                generateByComputer(&size, &numberOfMarbles);
            } else {
                getFromUser(&size, &numberOfMarbles);
            }
        }

        if (flag == 0) {
            printf("\nComputer Wins!");
        } else {
            printf("\nHuman Wins!");
        }
    } 
    
    else { // Smart Mode
        if (firstMove == 0) {
            getFromUser(&size, &numberOfMarbles);
        } else {
            smartMoveByComputer(&size, &numberOfMarbles);
        }

        while (size > 1) {
            if (flag == 0) {
                smartMoveByComputer(&size, &numberOfMarbles);
            } else {
                getFromUser(&size, &numberOfMarbles);
            }
        }

        // Winning Conditions 

        if (flag == 0 && mode == 1) {
            printf("\nComputer Wins!");
        } else if (flag == 1 && mode == 1) {
            printf("\nHuman Wins!");
        } else if (flag == 0 && mode == 0) {
            printf("\nHuman Wins!");
        } else {
            printf("\nComputer Wins!");
        }
    }
    return 0;

}
