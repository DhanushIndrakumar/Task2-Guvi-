import java.util.Scanner;
class Person{
    int age;
    String name;
    
    public Person(){
        age=18;//setting the default age as 18
    }
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void display(){ //Method to display the name and age of the person
        System.out.println("The age is:"+age);
        System.out.println("The name is :"+name);
    }
}

public class Question1{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Person p=new Person();//creating the object
        // System.out.println("Enter the age of the person:");
        // p.age=sc.nextInt();
        System.out.println("Enter the name of the person:");
        p.name=sc.next();
        p.display();
        

        

    }
}