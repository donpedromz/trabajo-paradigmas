package domain;

public class Product implements Comparable<Object>{
    private String name;
    private String category;
    private double price;
    private int stock;
    private int unitsSold;

    public Product(String name, String category, double price, int stock, int unitsSold) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.unitsSold = unitsSold;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        return this.name.compareTo(p.getName());
    }
}
