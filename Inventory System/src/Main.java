import business.StoreManager;
import domain.Product;
import ui.StoreUI;

import java.util.Arrays;
import java.util.List;

/**
 * @author donpedromz
 * @version 1.0
 * Application entry point
 */
public class Main {
    public static List<Product> generateDefaultProducts(){
        return Arrays.asList(
                new Product("Sofa Comfort", "Home", 499.99, 10, 25),
                new Product("Mesa de comedor", "Home", 499.99, 15, 40),
                new Product("Lámpara de pie LED", "Home", 89.99, 30, 55),
                new Product("Juego de sábanas", "Home", 59.90, 50, 120),
                new Product("Alfombra persa", "Home", 249.99, 4, 12),
                new Product("Cafetera de cápsulas", "Home", 79.99, 3, 60),
                new Product("Horno eléctrico", "Home", 179.99, 1, 35),
                new Product("Set de cuchillos de cocina", "Home", 49.99, 25, 80),
                new Product("Aspiradora sin cable", "Home", 199.99, 18, 70),
                new Product("Ventilador de torre", "Home", 69.90, 22, 50),
                new Product("Smartphone Galaxy X", "Electronics", 899.99, 15, 150),
                new Product("Televisor 55\" 4K", "Electronics", 1199.99, 8, 90),
                new Product("Auriculares Bluetooth Pro", "Electronics", 129.99, 40, 200),
                new Product("Smartwatch Fit", "Electronics", 199.90, 25, 180),
                new Product("Portátil Ultrabook", "Electronics", 1399.00, 12, 75),
                new Product("Cámara DSLR Pro", "Electronics", 799.50, 10, 45),
                new Product("Tablet 10 pulgadas", "Electronics", 349.99, 20, 95),
                new Product("Altavoz inteligente", "Electronics", 89.99, 35, 210),
                new Product("Consola de videojuegos", "Electronics", 499.00, 14, 130),
                new Product("Router Wi-Fi 6", "Electronics", 159.99, 18, 85)
        );
    }
    public static void main(String[] args) {
        StoreManager manager = new StoreManager(generateDefaultProducts());
        StoreUI ui = new StoreUI(manager);
    }
}
