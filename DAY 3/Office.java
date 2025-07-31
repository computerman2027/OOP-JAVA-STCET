import java.util.Scanner;

class Employee {
    int emptype;
    double salary;
    public Employee(int emptype) {
        this.emptype = emptype;

        if(emptype==1)
        {
            this.salary = 10000;
        }
        else if(emptype==2)
        {
            this.salary = 7000;
        }
        else if(emptype==3)
        {
            this.salary = 6000;
        }
        else if(emptype==4)
        {
            this.salary = 6500;
        }
    }
    
    double GrossSalary()
    {
        return salary+(0.9*salary)+(0.15*salary)+1000;
    }

    double GrossSalary(Employee obj)
    {
        return obj.GrossSalary();
    }
}

public class Office {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1. Manager\n2. Clerk\n3. Account\n4. salesman");
        System.out.println("Enter type for Employee 1");
        int t = sc.nextInt();
        
        Employee obj1 = new Employee(t);
        System.out.println("Enter type for Employee 1");
        t = sc.nextInt();
        Employee obj2 = new Employee(t);


        System.out.println("Salary of Employee 1 : "+obj1.GrossSalary());
        System.out.println("Salary of Employee 2 : "+obj1.GrossSalary(obj2));
    }
}
