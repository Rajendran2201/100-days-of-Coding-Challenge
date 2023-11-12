#include <stdio.h>

int main() {
    int numSubjects;

    // Input the number of subjects
    printf("Enter the number of subjects: ");
    scanf("%d", &numSubjects);

    if (numSubjects <= 0) {
        printf("Invalid number of subjects. Please enter a positive integer.\n");
        return 1; // Exit with an error code
    }

    int totalMarks = 0;

    // Input individual subject marks and calculate total
    for (int i = 1; i <= numSubjects; ++i) {
        int marks;
        printf("Enter marks for Subject %d: ", i);
        scanf("%d", &marks);

        if (marks < 0 || marks > 100) {
            printf("Invalid marks. Please enter a value between 0 and 100.\n");
            return 1; // Exit with an error code
        }

        totalMarks += marks;

        if (marks < 33) {
            printf("Sorry, you have failed in Subject %d. Minimum 33%% required.\n", i);
            return 0;
        }
    }

    // Calculate the overall percentage
    float overallPercentage = (float)totalMarks / numSubjects;

    // Check if the student has passed based on overall criteria
    if (overallPercentage >= 40) {
        printf("Congratulations! You have passed with an overall percentage of %.2f%%.\n", overallPercentage);
    } else {
        printf("Sorry, you have failed. Overall percentage is %.2f%%. Minimum 40%% required.\n", overallPercentage);
    }

    return 0;
}
