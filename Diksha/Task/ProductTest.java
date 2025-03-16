package Diksha;

import java.util.ArrayList;
import java.util.Arrays;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId,String productName,double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductTest{

    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();
                Product p1=new Product(100,"amul",50);
                Product p2=  new Product(101,"parle",20);
                Product p3=new Product(102,"tiger",300);

                list.add(p1);list.add(p2);list.add(p3);

                for(Product p: list)
                {
                    if(p.getPrice() > 50)
                    {
                        System.out.println(p);
                    }
                }
    }

}
