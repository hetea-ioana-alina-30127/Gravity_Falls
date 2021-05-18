package aut.utcluj.isp.ex4;

import java.util.List;

public class UserCart implements ICartDetails{
    private List<Product> cardProducts;
    private double totalPrice;
   
    
    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getCardProducts() {
        return cardProducts;
    }

    /**
     * Add new product to user cart
     *
     * @param product  - product to be added
     * @param quantity - number of products of the same type to be added
     */
    public void addProductToCart(final Product product, int quantity) {
           
           product.setQuatity(quantity);
           cardProducts.add(product);
           totalPrice += product.getPrice();

    }

    /**
     * Remove one product with product id from cart
     * If the product with desired id not found in the card, an {@link ProductNotFoundException} exception will be thrown
     *
     * @param productId - unique product id
     */
    public void removeProductFromCart(final String productId) {
        for(Product i: cardProducts) {
            if(i.getProductId().equals(productId)){
                totalPrice -= i.getPrice();
                cardProducts.remove(i);
            }
        }
    }

    /**
     * Reset user cart
     * Reset products and total price to default values
     */
    public void resetCart() {
        cardProducts.removeAll(cardProducts);
        totalPrice = 0;
    }

    @Override
    public String getCartDetails() {
        String cartDetails = null;
        for(Product i: cardProducts) {
            cartDetails = "Product Id: " + i.getProductId() + " Items: " + i.getQuatity() + "\n";
        }
        return cartDetails;
    }
}
