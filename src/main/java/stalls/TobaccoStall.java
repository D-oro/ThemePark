package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(int rating, String name, String ownerName, ParkingSpot parkingSpot) {
        super(rating, name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge()<18){
            return false;
        } else{
            return true;
        }
    }
}
