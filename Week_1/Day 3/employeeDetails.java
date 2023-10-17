/*
    Create a class Employee to store the details of the employees and methods to insert and print the data 
    The data/details to be fetched are id,name,age,mobile-no,address
*/

public class employeeDetails {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.insertvalues(1,"Raj",18,"9876543210","Coimbatore");
        e.printvalues();
    }
}
