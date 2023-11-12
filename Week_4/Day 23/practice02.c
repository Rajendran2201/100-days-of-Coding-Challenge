#include <stdio.h>
#include <math.h>

#define PI 3.14159265

int main() {
    float radius, area, volume;

    // Input the radius from the user
    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    // Calculate the area of the circle
    area = PI * pow(radius, 2);

    // Calculate the volume of the sphere (assuming the circle represents a cross-section)
    volume = (4.0 / 3.0) * PI * pow(radius, 3);

    // Display the results
    printf("The area of the circle is: %.2f square units\n", area);
    printf("The volume of the sphere (assuming a circle cross-section) is: %.2f cubic units\n", volume);

    return 0;
}
