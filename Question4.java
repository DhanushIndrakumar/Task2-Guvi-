class Person{
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee extends Person{
    String empId;
    int salary;
    public Employee(){
        super("Dhanush", 22);//initialising the parent class attributes
    }
    public Employee(String empId,int salary){
        super("Dhanush",22);//initialising the parent class attributes  in both the constructors
        this.empId=empId;
        this.salary=salary;
    }
    public void display(){
        //method to display the details of both Person and Employee class
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Employee Id:"+empId);
        System.out.println("Salary:"+salary);

    }
}




public class Question4 {
    public static void main(String args[]){
        //If we just create an object of child class we will be able to print all the details
        Employee emp=new Employee("Emp123",40000);
        emp.display();

    }
    
}
