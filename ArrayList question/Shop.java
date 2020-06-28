import java.util.ArrayList;

import javax.xml.namespace.QName;

public class Shop{

    private ArrayList<Product> productList = new ArrayList<Product>();

    public void setProductList(ArrayList<Product> productList){
        this.productList = productList;
    }

    public ArrayList<Product> getProductList(){
        return productList;
    }

    public void addProduct(Product productObj){
        productList.add(productObj);
    }

    public ArrayList<Product> viewProductByPrice(float price){
        
        ArrayList<Product> newProductList = new ArrayList<Product>();

        if(productList.isEmpty()){
            return null;
        }
        for(Product p : productList){

            if(p.getPrice()>=price){
                newProductList.add(p);
            }
        }
        if(newProductList.isEmpty()){
            return null;
        }
        else{
            return newProductList;
        }
    }


}