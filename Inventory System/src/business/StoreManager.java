package business;

import domain.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author donpedromz
 * @version 1.0
 * This class manages the store's product management logic.
 */
public class StoreManager {
    private List<Product> storeProducts;

    public StoreManager(List<Product> storeProducts) {
        this.storeProducts = storeProducts;
    }
    public StoreManager(){
        this.storeProducts = new ArrayList<>();
    }
    public List<Product>  getElectronicProducts(){
        List<Product> stockedElectronicProducts = new ArrayList<Product>();
        for(Product p : this.storeProducts){
            if(p.getCategory().equalsIgnoreCase("Electronics")) {
                stockedElectronicProducts.add(p);
            }
        }
        stockedElectronicProducts.sort(Comparator.comparing(Product::getName));
        return stockedElectronicProducts;
        }

    public void increaseHomeProductsPrice(){
        for(Product p : this.storeProducts){
            if(p.getStock() < 5 && p.getCategory().equalsIgnoreCase("Home")){
                double newPrice = p.getPrice() + (p.getPrice() * 0.1);
                p.setPrice(newPrice);
            }
        }
    }
    public void totalRevenue(){
        List<String> categories = new ArrayList<>();
        storeProducts.forEach((p)->{
            if(!categories.contains(p.getCategory())){
                categories.add(p.getCategory());
            }
        });
        for(String cat: categories){
            double catRevenue = 0;
            List<Product> filteredProducts = new ArrayList<>(this.storeProducts.stream()
                    .filter((product -> product.getCategory().equalsIgnoreCase(cat)))
                    .toList());
            for(Product p: filteredProducts){
                catRevenue += (p.getPrice() * p.getStock());
            }
            System.out.println("Category: " + cat + " Revenue: $"+catRevenue);
        }
    }
    public String highestRevenueCategory(){
        double revenue = 0;
        String category = "";
        List<String> categories = new ArrayList<>();
        storeProducts.forEach((p) ->{
            if(!categories.contains(p.getCategory())){
                categories.add(p.getCategory());
            }
        });
        for(String cat: categories){
            double catRevenue = 0;
            List<Product> filteredProducts = new ArrayList<>(storeProducts.stream().filter(
                    (p) -> p.getCategory().equalsIgnoreCase(cat)).toList());
            for (Product p: filteredProducts){
                catRevenue += (p.getPrice()*p.getStock());
                if(catRevenue > revenue){
                    revenue = catRevenue;
                    category = cat;
                }
            }
        };
        return category.concat(" with a revenue of $").concat(Double.toString(revenue));
    }
    public List<Product> sortProducts(){
        List<Product> sortedProducts = new ArrayList<>(this.storeProducts);
        sortedProducts.sort(Comparator.comparing(Product::getPrice)
                .reversed()
                .thenComparing(Product::getStock));
        return sortedProducts;
    }
}
