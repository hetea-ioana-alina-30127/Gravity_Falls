package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class Product {
    private String productId;
    private Double price;
    private int quatity;


    public Product(String productId, Double price) {
        this.productId = productId;
        this.price = price;
        this.quatity = 0;
    }

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
    

    @Override
    public boolean equals(Object obj) {
        return ((Product)obj).getProductId().equals(this.productId); //To change body of generated methods, choose Tools | Templates.
    }
}
