package structural.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmedPlayer extends PlayerDecorator {

    private List<String> weapons = new ArrayList<>();

    public ArmedPlayer(List<String> weapons, Character character) {
        this.weapons = weapons;
        this.character = character;
    }

    @Override
    public void printPlayerSummary() {
        character.printCharacterSummary();
        System.out.println("ArmedPlayer{" + "weapons=" + weapons.stream().collect(Collectors.joining(" ,")) + '}');
    }


}
