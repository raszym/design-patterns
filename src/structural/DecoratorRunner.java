package structural;

import structural.decorator.ArmedPlayer;
import structural.decorator.Character;
import structural.decorator.PlayerDecorator;

import java.util.List;

public class DecoratorRunner {

    public void run() {
        Character character = new Character("Bradley", "soldier", 75, 25);
        PlayerDecorator player = new ArmedPlayer(List.of("Rifle", "Shotgun", "Grenade"), character);
        player.printPlayerSummary();
    }
}
