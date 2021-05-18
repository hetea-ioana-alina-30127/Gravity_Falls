package aut.utcluj.isp.ex3;

import java.util.*;
/**
 * @author stefan
 */
public class StockController {
    static int numberProducts=0;
    private List<Product> listProducts= new ArrayList<Product>();
    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    public void addProductToCatalogue(final Product product,final int quantity) {
        this.numberProducts=numberProducts+quantity;
        for(int i=1;i<=quantity;i++)
        this.listProducts.add(Product);
    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */
    public Map<String, List<Product>> getCatalogue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {
        List<Product> newListProducts= new Array List<Product>();
        for(List<Product> ss: listProducts){
            if(ss.getId.equals(productId))
                newListProducts.add(ss);
        }
        return newListProducts;
    }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {
        return numberProducts;
    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWitProductId(final String productId) {
        boolean ok=false;
        Product ss1;
        int i=0;
        for(List<Product> ss: listProducts){
            if(ss.getId.equals(productId)){
                ss1=ss;

                ok=true;
            }
        i++;
        }
            return ok;
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        boolean ok=false;
        for(List<Product> ss: listProducts){
            if(ss.getId.equals(productId)){
                ss.setPriece(priece);
                ok=true;
            }
            return ok;
    }
}
