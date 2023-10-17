//Implementation of the Employee class which consists of two methods to insert and print the details of the employees

public class Employee {   
    int id;
    String name;
    int age;
    String MobNo;
    String address;
    void insertvalues(int i ,String n ,int a,String m,String ad){
        id = i;
        name = n;
        age = a;
        MobNo = m;
        address = ad;
    }
    void  printvalues(){
        System.out.print("id : "+id+
        "\nname : "+name+
        "\nage : "+age+
        "\nMobile No : "+MobNo+
        "\nAddress : "+address);
    }
}
