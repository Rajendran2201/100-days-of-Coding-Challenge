#include <stdbool.h>
#include <stdio.h>

#define MAX_NAME_LENGTH 100
#define MAX_DEPT_LENGTH 100
#define MAX_DESIGNATION_LENGTH 100
#define MAX_PASSWORD_LENGTH 30
#define MAX_DATE 20

struct Employee {
  int ID;
  int Age;
  char Name[MAX_NAME_LENGTH];
  int Salary;
  char Department[MAX_DEPT_LENGTH];
  char Designation[MAX_DESIGNATION_LENGTH];
  char dateOfJoining[MAX_DATE];
  bool Attendance;
  char Password[MAX_PASSWORD_LENGTH];
};

/******************** FUNCTIONS DECLARATION ********************/

void addEmployee();
void deleteEmployee();
void updateEmployee();
void displayAllEmployees();
void displayEmployeeByDept();
void searchEmployeeByID();
void searchEmployeeByName();
void sortEmployeeBySalary();
void sortEmployeeByAge();
void sortEmployeeByID();
void login();
void calculateLeave();
void fetchSalaryByName();
void fetchSalaryByID();
void deduceSalary();
void displayPayroll();
void groupEmployeesByDesignation();
void groupEmployeesByGender();

// Functions By RAJ
void mainOperations();
void updateDetailsBasedOnCondition(int);
void askDetailsToAddEmployee();
void askUserToUpdateDetails();
void askUserToDisplayEmployeeDetails();
void checkConditionForDisplayDetails(int);
void searchEmployeeDetailsBasedOnCondition();

/******************** OPERATIONS INVOLVED ********************/

/*

  ************ TITLE : EMPLOYEE MANAGEMENT SYSTEM ******************

-> A software facilitating efficient employee record management.
-> It allows the user to do the following operations :

            Basic Operations :
              # Add an employee
              # Delete an employee
              # Update an Emplyee details
              # Display all employees

            Searching :
              # Search by name
              # Search by ID

            Sorting :

              # Display an employee details based on their salary range
              # Display an employee details based on their age
              # Display an employee details based on their ID

            Grouping:

              # Display an employee details based on their designation


            Calculation :
              # calculate login count
              # Deduce the salary of an employee based on their login count
              # Display the payroll of all employee's salary of a month

            Other Operations :
              # Fetch salary of an Employee using name
              # Fetch Salary of an Employee using ID



*/

    /*******************  PROJECT PROTOTYPE  *************************/
    
    /*
    
    PROTOTYPE :
    
    WELCOME TO EMPLOYEE MANAGEMENT SYSTEM
    
    Please select your desired operation :
    
    1 - Add an employee
    2 - Delete an employee
    3 - Update an Employee details
    4 - Display employees
    5 - Search Employee Details
    6 - Login
    
    **** When the user selects the operation, the system will call the respective
    function ****
    
    When operation = 1 :
    
            Please Enter the Employee Details
        
            Employee ID :
            Employee Password :
            Employee Name :
            Employee Age :
            Employee's Date of joining :
            Employee's Department :
            Employee's Designation :
            Employee's Salary :
        
            The Employee has been added successfully.
    
    When Operation = 2 :
    
            Please Enter the Employee ID to be deleted :
        
            The Employee details has been deleted successfully.
    
    When Operation = 3 :
    
            Please select the attribute to be updated !
        
            1 - Employee ID
            2 - Employee Name
            3 - Employee Age
            4 - Employee's Department
            5 - Employee's Designation
            6 - Employee's Salary
    
    When Operation = 4 :
    
            Please choose your desired type of display :
        
            1 - Display all employees
            2 - Display an employee details based on their salary range
            3 - Display an employee details based on their age
            4 - Display an employee details based on their ID
            5 - Display an employee details based on their designation
            6 - Display the payroll of all employee's salary of a month
    
    When Operation = 5 :
    
            Please select your desired type of search :
        
            1 - Search by name
            2 - Search by ID
            3 - Search an Employee's Salary based on their name
            4 - Search an Employees's Salary based on their ID
        
    When Operation = 6:
    
            Please Enter your ID :
        
            You have been successfully logged in !
        
    */
/********************  GLOBAL DECLARATIONS  ********************/

// Declare the global variables here !

/********************** FUNCTION DEFINITIONS  ***********************/

// WRITE YOUR FUNCTIONS HERE

// ------------------------------------------------------------------------------------------------------

void mainOperations() {

  /*         *************** mainOperations()****************

          ---> Function to ask the user what operation to be performed
          ---> This function will be called in the main function
          ---> It had no input arguments and no return type
  */

  printf("\n\n**** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM ****\n\n");
  printf("Please select your desired operation:\n\n\n");
  printf("1 - Add an employee\n");
  printf("2 - Delete an employee\n");
  printf("3 - Update an Employee details\n");
  printf("4 - Display employees\n");
  printf("5 - Search Employee Details\n");
  printf("6 - Login\n");
  printf("7 - Exit\n");
}

// ------------------------------------------------------------------------------------------------------

void updateDetailsBasedOnCondition(int condition) {

  /*         *************** updateDetailsBasedOnConditions()****************

          ---> Function to ask the user what attribut to be updated
          ---> This function calls other functions which changes / updates the
     values stored in the structure
          ---> This function will be called in the main function
          ---> It had an input argument which defines the option chosed by the
     user and no return type
  */

  switch (condition) {
  case 1:
    printf("Enter the new Employee ID: ");
    // Add code here to read and update Employee ID
    break;
  case 2:
    printf("Enter the new Employee Name: ");
    // Add code here to read and update Employee Name
    break;
  case 3:
    printf("Enter the new Employee Age: ");
    // Add code here to read and update Employee Age
    break;
  case 4:
    printf("Enter the new Employee's Department: ");
    // Add code here to read and update Employee's Department
    break;
  case 5:
    printf("Enter the new Employee's Designation: ");
    // Add code here to read and update Employee's Designation
    break;
  case 6:
    printf("Enter the new Employee's Salary: ");
    // Add code here to read and update Employee's Salary
    break;
  default:
    printf("Invalid option. Please select a valid option (1-6).\n");
    break;
  }
}

// ------------------------------------------------------------------------------------------------------

void askDetailsToAddEmployee() {
  /*         *************** askDetailsToAddEmployee()****************

          ---> Function to ask a new user details to add them into the structure
          ---> This function will be called in the main function
          ---> It had no input arguments and no return type
  */
  printf("Adding an employee...\n");

  printf("Please Enter the Employee Details\n\n\n");
  printf("Employee ID : \n");
  printf("Enter Password : \n");
  printf("Employee Name : \n");
  printf("Employee Age : \n");
  printf("Employee's Date of Joining : \n");
  printf("Employee's Department : \n");
  printf("Employee's Designation : \n");
  printf("Employee's Salary : \n");
}

// ------------------------------------------------------------------------------------------------------

void askUserToUpdateDetails() {
  /*         *************** askUserToUpdateDetails()****************

          ---> Function to ask the user what detail to be updated
          ---> This function will be called in the main function
          ---> It had no input arguments and no return type
  */
  printf("Please select the attribute to be updated!\n\n\n");
  printf("1 - Employee ID\n");
  printf("2 - Employee Name\n");
  printf("3 - Employee Age\n");
  printf("4 - Employee's Department\n");
  printf("5 - Employee's Designation\n");
  printf("6 - Employee's Salary\n");
}

// ------------------------------------------------------------------------------------------------------

void askUserToDisplayEmployeeDetails() {
  /*         *************** askUserToDisplayEmployeeDetails()****************

          ---> Function to ask the user what detail to be displayed
          ---> This function will be called in the main function
          ---> It had no input arguments and no return type
  */
  printf("Please choose your desired type of display:\n\n\n");
  printf("1 - Display all employees\n");
  printf("2 - Display employee details based on their salary range\n");
  printf("3 - Display employee details based on their age\n");
  printf("4 - Display employee details based on their ID\n");
  printf("5 - Display employee details based on their designation\n");
  printf("6 - Display the payroll of all employees' salary of a month\n");
}

// ------------------------------------------------------------------------------------------------------

void checkConditionForDisplayDetails(int displayOption) {
  /*         *************** checkConditionForDisplayDetails()****************

          ---> Function to evaluate the input given by the use and display the
     desired employee details
          ---> This function will be called in the main function
          ---> It had an input arguments called "displayOption" which is the
     option chosed by the user and no return type
  */
  switch (displayOption) {
  case 1:
    printf("Displaying all employees...\n");
    // Code to display all employees
    break;
  case 2:
    printf("Displaying employee details based on salary range...\n");
    // Code to display employee details based on salary range
    break;
  case 3:
    printf("Displaying employee details based on age...\n");
    // Code to display employee details based on age
    break;
  case 4:
    printf("Displaying employee details based on ID...\n");
    // Code to display employee details based on ID
    break;
  case 5:
    printf("Displaying employee details based on designation...\n");
    // Code to display employee details based on designation
    break;
  case 6:
    printf("Displaying the payroll of all employees' salary of a month...\n");
    // Code to display the payroll of all employees' salary of a month
    break;
  default:
    printf("Invalid option. Please select a valid option (1-6).\n");
    break;
  }
}

// ------------------------------------------------------------------------------------------------------

void searchEmployeeDetailsBasedOnCondition() {
  printf("Searching employee details...\n");
  int searchOption;

  printf("\nPlease select your desired type of search:\n\n\n");
  printf("1 - Search by name\n");
  printf("2 - Search by ID\n");
  printf("3 - Search an Employee's Salary based on their name\n");
  printf("4 - Search an Employee's Salary based on their ID\n\n");
  printf("Enter your choice (1-4): ");
  scanf("%d", &searchOption);

  switch (searchOption) {
  case 1:
    printf("Searching by name...\n");
    // Code for searching by name
    break;
  case 2:
    printf("Searching by ID...\n");
    // Code for searching by ID
    break;
  case 3:
    printf("Searching an Employee's Salary based on their name...\n");
    // Code for searching an Employee's Salary based on their name
    break;
  case 4:
    printf("Searching an Employee's Salary based on their ID...\n");
    // Code for searching an Employee's Salary based on their ID
    break;
  default:
    printf("Invalid option. Please select a valid option (1-4).\n");
    break;
  }
}

// ------------------------------------------------------------------------------------------------------

int main() {
  int option, userID, current_option, displayOption;
  do {

    mainOperations();

    printf("\n\nEnter your choice: ");
    scanf("%d", &option);

    switch (option) {

      // Adding an Employee
    case 1:
      askDetailsToAddEmployee();

      printf("The Employee has been added successfully.\n\n");
      break;

      // Deleting an Employee
    case 2:
      printf("Deleting an employee...\n");
      printf("Please Enter the Employee ID to be deleted : \n");

      // deleteEmployee();

      printf("The Employee details has been deleted successfully.\n");
      break;

      // Updating Employee Details
    case 3:
      printf("Updating an employee's details...\n");

      askUserToUpdateDetails();

      printf("\nEnter your choice (1-6): ");
      scanf("%d", &current_option);

      updateDetailsBasedOnCondition(current_option);

      break;

      // Displaying Employee's details
    case 4:
      printf("Displaying employees...\n");

      askUserToDisplayEmployeeDetails();
      printf("Enter your choice (1-6): ");
      scanf("%d", &displayOption);

      checkConditionForDisplayDetails(displayOption);

      break;

    // Searching Employee details
    case 5:
      searchEmployeeDetailsBasedOnCondition();
      break;

    // To Login into the Company
    case 6:

      printf("Logging in...\n");

      printf("Please Enter your ID: ");
      scanf("%d", &userID);

      // bool isValidUser = checkLogin(userID);
      bool isValidUser = true;
      if (isValidUser) {
        printf("You have been successfully logged in!\n");
      } else {
        printf("Invalid User ID. Please try again.\n");
      }

      break;

    case 7:
      printf("\n\nThank You for using our Employee Management System!\n");
      return 0;

    default:
      printf("Invalid option. Please enter a valid option.\n");
      break;
    }

  } while (option != 0); // The condition to terminate the infinite loop

  return 0;
}
