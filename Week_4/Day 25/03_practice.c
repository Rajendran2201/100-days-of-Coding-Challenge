#include <stdio.h>

int main() {
    char character;

    // Input from the user
    printf("Enter a character: ");
    scanf("%c", &character);

    // Check if the character is a lowercase letter
    if (character >= 'a' && character <= 'z') {
        printf("%c is a lowercase letter.\n", character);
    } else {
        printf("%c is not a lowercase letter.\n", character);
    }

    return 0;
}
