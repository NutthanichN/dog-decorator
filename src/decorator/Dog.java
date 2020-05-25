package decorator;

public abstract class Dog {
    private String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract void activeAllBehaviours();
}
