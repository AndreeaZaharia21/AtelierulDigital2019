package Lab3.Decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage; //il putem folosi in subclase (protected)
    public CondimentDecorator (String description, float cost, Beverage beverage) {
        super (description, cost);
        this.beverage = beverage;
    }
    public String getDescription () {
        return description + " " + beverage.getDescription();
    }
    public float getCost () {
        return cost + beverage.getCost();
    }

}