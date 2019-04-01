package Lab3.Decorator;

public abstract class Beverage {
    protected String description;
    protected float cost;

    public String getDescription() {
        return description;
    }

    public float getCost() {
        return cost;
    }

    public Beverage (String description, float cost) {
        this.description = description;
        this.cost = cost;
    }

}
