#include <stdio.h>

int main() {
    float length, width, area;

    // Input length and width from the user
    printf("Enter the length of the rectangle: ");
    scanf("%f", &length);

    printf("Enter the width of the rectangle: ");
    scanf("%f", &width);

    // Calculate the area of the rectangle
    area = length * width;

    // Display the result
    printf("The area of the rectangle is: %.2f square units\n", area);

    return 0;
}
