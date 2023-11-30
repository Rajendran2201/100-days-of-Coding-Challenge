#include <stdio.h>

int main() {
    int day, month, year, flag = 0;
    char *months[] = {"January", "February", "March", "April", "May", "June", "July", 
                      "August", "September", "October", "November", "December"};

    printf("Enter the date in the format mm dd yyyy: ");
    scanf("%d%d%d", &month, &day, &year);

    // printing the day 
    if (day >= 11 && day <= 13) {
        printf("%dth", day);
        flag = 1;
    } else {
        int ans = day % 10;
        switch (ans) {
            case 1:
                printf("%dst", day);
                break;
            case 2:
                printf("%dnd", day);
                break;
            case 3:
                printf("%drd", day);
                break;
            default:
                printf("%dth", day);
        }
    }

      //printing the month
    for(int i=0;i<12;i++){
        if(month==i+1){
            printf(" %s",months[i]);
        }
    }
    // printing the year
    printf(" %d\n", year);

    return 0;
}
