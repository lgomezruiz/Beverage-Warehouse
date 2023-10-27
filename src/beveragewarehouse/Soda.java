
package beveragewarehouse;


public class Soda extends Drink {
    
    //Attributes
    private double sugarPercentage;
    private boolean promotion;
    
    //Builder
    public Soda(double sugarPercentage, boolean promotion, double quantity, double price, String mark) {
        super(quantity, price, mark);
        this.sugarPercentage = sugarPercentage;
        this.promotion = promotion;
    }
    
    //Getters & Setters
    public double getSugarPercentage() {
        return sugarPercentage;
    }

    public void setSugarPercentage(double sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
    
    @Override //We override getPrice() method for Soda
    public double getPrice() {
        if(isPromotion()==true) {
            return super.getPrice()*0.9; //We apply a 10% discount at Soda's price
        }
        else {
            return super.getPrice();
        }
    }
    
    //toString method +super
    @Override
    public String toString() {
        return super.toString() + " sugarPercentage=" + sugarPercentage + ", promotion=" + promotion;
    }
    
    
}
