import java.util.Scanner;
import java.util.*;

interface IPrinter {
    void displayPersonalDetails();

    void displayJobDetails();
}

interface IScanner {
    void getPersonalDetails();

    void getJobDetails();
}

class Details implements IPrinter, IScanner {
    String name;
    String address;
    String city;
    String companyName;
    double salary;
    // creating object of scanner class
    Scanner object = new Scanner(System.in);

    public void getPersonalDetails() {
        System.out.print("Enter Name : ");
        name = object.nextLine();
        System.out.print("Enter Address : ");
        address = object.nextLine();
    }

    public void getJobDetails() {
        System.out.print("Enter Company Name : ");
        companyName = object.nextLine();
        System.out.print("Enter Salary : ");
        salary = object.nextInt();
    }

    public void displayPersonalDetails() {
        System.out.println("Your Name : " + name);
        System.out.println("Your Address : " + address);
    }

    public void displayJobDetails() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Salary : " + salary);
    }
}
