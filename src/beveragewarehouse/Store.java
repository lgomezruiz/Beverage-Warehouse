
package beveragewarehouse;


public class Store {
    
    //Matrix
    private Drink store [][];
    
    //Builder
    public Store(int row, int column) {
        store = new Drink [row][column];
    }
    
    //Another builder
    public Store() {
        store = new Drink [5][5];
    }
    
    //Add Drink
    public void addDrink(Drink drink1){
        
        boolean emptyPlace = false;
        for (int i=0; i<store.length && !emptyPlace; i++) {
            for (int j=0; j<store[0].length && !emptyPlace; j++) {
                if (store[i][j]==null) {
                    store[i][j] = drink1;
                    emptyPlace = true;
                }
            }
        }
        if (emptyPlace) {
            System.out.println("Added drink");
        }
        else {
            System.out.println("It cannot be added the drink");
        }
    }
    
    //Delete Drink
    public void deleteDrink(int id){
        boolean emptyPlace = false;
        for (int i=0; i<store.length && !emptyPlace; i++) {
            for (int j=0; j<store[0].length && !emptyPlace; j++) {
                if (store[i][j]!=null && store[i][j].getId()==id) {
                    store[i][j]=null;
                    emptyPlace = true;
                }       
            }
        }
        if (emptyPlace) {
            System.out.println("Deleted drink");
        }
        else {
            System.out.println("The drink doesn't exits");
        }
    }
    
    //Show all Drinks
    public void showDrink(){
        for (int i=0; i<store.length; i++) {
            for (int j=0; j<store[0].length; j++) {
                if (store[i][j]!=null) {
                    System.out.println("Fila: " + i + ", Columna: " + j + " " + store[i][j].toString());
                }
            }       
        }
    }
    
    //Calculate the price of all drinks (water & soda)
    public double totalPrice(){
        double totalPrice=0;
        for (int i=0; i<store.length; i++) {
            for (int j=0; j<store[0].length; j++) {
                if(store[i][j]!=null) {
                    totalPrice += store[i][j].getPrice();
                }
            }       
        }
        return totalPrice;
    }
    
    //Calculate the price of all drinks with the same mark
    public double totalPriceMark(String mark){
        double totalPrice=0;
        for (int i=0; i<store.length; i++) {
            for (int j=0; j<store[0].length; j++) {
                if (store[i][j]!=null && store[i][j].getMark().equalsIgnoreCase(mark)) {
                    totalPrice += store[i][j].getPrice();
                }
            }       
        }
        return totalPrice;
    }
    
    //Calculate the price of all drinks at the same store (column)
    public double totalPriceColumn(int column){
        double totalPrice=0;
        if (column>=0 && column<store[0].length) {
            for (int i=0; i<store.length; i++) {
                if (store[i][column]!=null) {
                    totalPrice += store[i][column].getPrice();
                }         
            }
        }
        else  {
            System.out.println("The column must be between 0 and " + store[0].length);
        }
        return totalPrice;
    }
    
}
