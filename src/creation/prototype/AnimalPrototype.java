package creation.prototype;

public abstract class AnimalPrototype implements Cloneable {
    protected String name;
    protected double weight;

    public AnimalPrototype clone() throws CloneNotSupportedException {
        return (AnimalPrototype) super.clone();
    }
}
