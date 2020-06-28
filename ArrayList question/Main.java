import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Shop shop = new Shop();
        
        while(true){
            int choice = 0;
            System.out.println("1.Add a Product");
            System.out.println("2.view Products by price");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            if(choice == 1){
                
                Product product = new Product();
                System.out.println("Enter the product Id");
                product.setProductId(sc.nextInt());
                System.out.println("Enter the product name");
                product.setProductName(sc.next());
                System.out.println("Enter the price");
                product.setPrice(sc.nextFloat());
                shop.addProduct(product);
                System.out.println("Product added successfully");
                continue;

            }
            else if(choice == 2){
                System.out.println("Enter the price");
                ArrayList<Product> ProductList = shop.viewProductByPrice(sc.nextFloat());

                if(ProductList == null){
                    System.out.println("No products available");
                }
                else{
                    for(Product p : ProductList){
                        System.out.println("Product Id "+p.getProductId());
                        System.out.println("Product Name "+p.getProductName());
                        System.out.println("Price "+p.getPrice());
                    }
                    

                }
                
            }
            else if(choice==3){
                System.out.println("Thanks for using the application");
                break;
            }

        }
        
    }
}