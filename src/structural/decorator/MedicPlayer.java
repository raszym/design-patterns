package structural.decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicPlayer extends PlayerDecorator {

    private List<String> equipments = new ArrayList<>();

    public MedicPlayer(List<String> equipments, Character character) {
        this.equipments = equipments;
        this.character = character;
    }

    @Override
    public void printPlayerSummary() {
        character.printCharacterSummary();
        System.out.println("ArmedPlayer{" + "equipments=" + equipments.stream().collect(Collectors.joining(" ,")) + '}');
    }


}
