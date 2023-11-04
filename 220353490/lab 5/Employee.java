import java.util.Scanner;

public class Employee 
{
    private String employeeName;
    private String city;
    private double basicSalary;
    private double daPercentage;
    private double hraPercentage;

    public Employee() 
    {
        employeeName = "";
        city = "";
        basicSalary = 0.0;
        daPercentage = 0.0;
        hraPercentage = 0.0;
    }

    public void getData() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        employeeName = scanner.nextLine();
        System.out.println("Enter City: ");
        city = scanner.nextLine();
        System.out.println("Enter Basic Salary: ");
        basicSalary = scanner.nextDouble();
        System.out.println("Enter DA Percentage: ");
        daPercentage = scanner.nextDouble();
        System.out.println("Enter HRA Percentage: ");
        hraPercentage = scanner.nextDouble();
    }

    public double calculateTotalSalary() 
    {
        return basicSalary + (basicSalary * daPercentage / 100) + (basicSalary * hraPercentage / 100);
    }

    public void display() 
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("City: " + city);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA Percentage: " + daPercentage);
        System.out.println("HRA Percentage: " + hraPercentage);
        double totalSalary = calculateTotalSalary();
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) 
    {
        Employee employee = new Employee();
        employee.getData();
        employee.display();
    }
}
