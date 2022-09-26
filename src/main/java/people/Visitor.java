package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;

    private ArrayList<Attraction> visitedAttractions;
//Add an empty visitedAttractions ArrayList to Visitor which stores a
// list of Attractions and a method to add an attraction to the list.
    public Visitor(int age, double height, double money) {
        this.visitedAttractions = new ArrayList<Attraction>();
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public void addAttractionToVisitedAttractions(Attraction attraction){
        visitedAttractions.add(attraction);
    }

    public ArrayList<Attraction> getVisitedAttractions() {
        return visitedAttractions;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
}
