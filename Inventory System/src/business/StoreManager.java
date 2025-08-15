package business;

import domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StoreManager {
    private List<Product> storeProducts;
    public List<Product>  getElectronicProducts(){
        List<Product> stockedElectronicProducts = new ArrayList<Product>();
        for(Product p : this.storeProducts){
            if(p.getName().equals("Electronics")) {
                stockedElectronicProducts.add(p);
            }
        }
        return stockedElectronicProducts;
        }

    public void increaseHomeProductsPirce(){
        for(Product p : this.storeProducts){
            if(p.getStock() < 5 && p.getName().equals("Home")){
                p.setPrice(p.getPrice() + (p.getPrice()*0.1));
            }
        }
    }
    public double totalRevenue(){
        double revenue = 0;
        for(Product p : this.storeProducts){
            revenue += (p.getPrice()*p.getStock());
        }
        return revenue;
    }
    public List<Product> sortProducts(){
    }
}
