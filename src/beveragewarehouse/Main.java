
package beveragewarehouse;


public class Main {

    public static void main(String[] args) {
        
        Store store1 = new Store();
        Drink drink1;
        
        System.out.println("----- YOUR BEVERAGE WAREHOUSE -----");
        System.out.println("");
        
        for(int i=0; i<10; i++) {
            switch(i%2) { 
                case 0: //Pairs
                    drink1 = new Water("Birthplace 1", 1.5, 5, "Bezoya");
                    store1.addDrink(drink1);
                    break;
                case 1: ///Odd
                    drink1 = new Soda(20, true, 1.5, 10, "Bezoya");
                    store1.addDrink(drink1);
                    break;
            }
        }
        
        System.out.println("");
        System.out.println("Current Drink List: ");
        System.out.println("");
        
        store1.showDrink();
        
        
    }
    
}
