
package beveragewarehouse;


public class Drink {
    
    //Attributes
    
    private static int currentId = 1; //Static value for ID. This helps to give automatically ID's.
    
    private int id;
    private double quantity; //Liters
    private double price; //€
    private String mark;
    
    //Builder
    public Drink(double quantity, double price, String mark) {
        this.id = currentId++;
        this.quantity = quantity;
        this.price = price;
        this.mark = mark;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    //toString method
    @Override
    public String toString() {
        return "Drink{" + "id=" + id + ", quantity=" + quantity + ", price=" + price + ", mark=" + mark;
    }
}
