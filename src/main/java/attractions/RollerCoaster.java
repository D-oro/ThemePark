package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 8.50;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.0) {
            return defaultPrice() * 2;
        } else{
            return defaultPrice();
        }
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight()>1.45 && visitor.getAge()>13){
            return true;
        } else{
            return false;
        }
    }


}
