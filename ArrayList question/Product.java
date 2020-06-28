import java.util.*;

public class Product {
    private int productId;
    private String productName;
    private float price;

    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public float getPrice(){
        return price;
    }

    
}