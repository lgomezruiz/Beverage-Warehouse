
package beveragewarehouse;


public class Water extends Drink {
    
    //Attributes
    private String birthplace;

    //Builder
    public Water(String birthplace, double quantity, double price, String mark) {
        super(quantity, price, mark);
        this.birthplace = birthplace;
    }
    
    //Getters & Setters
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    //toString method +super
    @Override
    public String toString() {
        return super.toString() + " birthplace=" + birthplace;
    }  
}
