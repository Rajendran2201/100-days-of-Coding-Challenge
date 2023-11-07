#include <stdio.h>

int main() {
    int num1, count = 0;
    printf("Enter the size of the array-1: ");
    scanf("%d", &num1);

    char arr1[num1], arr2[num1];

    for (int i = 0; i < num1; i++) {
        printf("Enter the element of arr1[%d]: ", i);
        scanf(" %c", &arr1[i]);
    }

    for (int i = 0; i < num1; i++) {
        printf("Enter the element of arr2[%d]: ", i);
        scanf(" %c", &arr2[i]);
    }

    // Sort the arrays
    for (int i = 0; i < num1 - 1; i++) {
        for (int j = 0; j < num1 - i - 1; j++) {
            if (arr1[j] > arr1[j + 1]) {
                char temp = arr1[j];
                arr1[j] = arr1[j + 1];
                arr1[j + 1] = temp;
            }
            if (arr2[j] > arr2[j + 1]) {
                char temp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = temp;
            }
        }
    }

    // Compare the sorted arrays
    for (int i = 0; i < num1; i++) {
        if (arr1[i] != arr2[i]) {
            printf("It is not an anagram\n");
            return 0;
        }
    }

    printf("It is an anagram\n");
    return 0;
}
