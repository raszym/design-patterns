package structural.decorator;

public class Character {
    private String name;
    private String type;
    private Integer strength;
    private Integer speed;

    public Character(String name, String type, Integer strength, Integer speed) {
        this.name = name;
        this.type = type;
        this.strength = strength;
        this.speed = speed;
    }

    public void printCharacterSummary() {
        System.out.println("Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                '}');
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getSpeed() {
        return speed;
    }
}
