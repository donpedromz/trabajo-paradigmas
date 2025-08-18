package ui;
import java.util.Scanner;
import business.StoreManager;

/**
 * @author donpedromz
 * @version 1.0
 * This class shows a user interface for the store management.
 */
public class StoreUI {
    private StoreManager manager;
    private Scanner input;
    public StoreUI(){
        this.manager = new StoreManager();
        this.input = new Scanner(System.in);
        this.uiLoop();
    }
    public StoreUI(StoreManager manager){
        this.manager =  manager;
        this.input = new Scanner(System.in);
        this.uiLoop();
    }
    public void uiLoop(){
        System.out.println("Store Inventory APP");
        boolean exec = true;
        while (exec){
            System.out.println("------------Menu------------");
            System.out.println("1. Print Electronics Products");
            System.out.println("2. Increase Home Category Products Price");
            System.out.println("3. Calculate Total Revenue");
            System.out.println("4. Print Highest Revenue Category");
            System.out.println("5. Sort products");
            System.out.println("6. Exit");
            try{
                int opc = Integer.parseInt(input.nextLine());
                switch (opc){
                    case 1:
                        manager.getElectronicProducts().forEach((System.out::println));
                        break;
                    case 2:
                        manager.increaseHomeProductsPrice();
                        System.out.println("Price increased!!!");
                        break;
                    case 3:
                        manager.totalRevenue();
                        break;
                    case 4:
                        System.out.println(manager.highestRevenueCategory());
                        break;
                    case 5:
                        manager.sortProducts().forEach(System.out::println);
                        break;
                    case 6:
                        exec = false;
                        System.out.println("Thank you!!!! :D");
                        break;
                    default:
                        System.out.println("Incorrect Option");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Incorrect input");
            }
        }
    }
}
