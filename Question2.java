import java.util.Scanner;
class Product{
    int pid;
    int price;
    int quantity;
    public Product(){

    }

    public Product(int pid,int price,int quantity){//parameterized constructor
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    public void display(Product products[]){ //method to display the product details
        int count=1;
        for(Product p:products){
            System.out.println("The details are product "+count+" are as follows:");
            System.out.println("The pid of the product "+count+" is: "+p.pid);
            System.out.println("The price of the product "+count+" is: "+p.price);
            System.out.println("The quantity of the product "+count+" is: "+p.quantity);
            count++;
        }
        
    }

    public int maxOfProducts(Product products[]){ //method to find the maximum price of all products
        int max=0;
        
        for(int i=1;i<products.length;i++){
            int j=i-1;
            max=products[j].price;
            if(products[i].price>max){
                max=products[i].price;
            }
        }

        return max;
    }
}


public class Question2 {
    public static int sumOfPrice(Product products[]){ //function to return the total amount
        int amount=0;
        for(int i=0;i<products.length;i++){
            amount=amount+(products[i].price*products[i].quantity);
        }
        return amount;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        Product products[]=new Product[5];//creating an array of 5 products
        for(int i=0;i<products.length;i++){
            products[i]=new Product();//creating a new product
            int j=i+1;
            System.out.println("Enter the details of product "+j+":"); //getting user input
            System.out.println("Enter the pid of product "+j+" :");
            products[i].pid=sc.nextInt();
            System.out.println("Enter the price of product "+j+" :");
            products[i].price=sc.nextInt();
            System.out.println("Enter the quantity of product "+j+" :");
            products[i].quantity=sc.nextInt();
           
        }
        Product p1=new Product();//creating a dummy object just to pass the array of objects
        p1.display(products);
        System.out.println("The highest price of all the products is:"+p1.maxOfProducts(products));//prints the highest price among the products
        System.out.println("The total amount spent on all the products is:"+sumOfPrice(products));//total amount spent on all the products




    }
    
}
