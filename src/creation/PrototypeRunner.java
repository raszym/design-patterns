package creation;

import creation.prototype.Rabbit;
import creation.prototype.Sheep;

public class PrototypeRunner {

    public void run() {
        Sheep doly = new Sheep("Doly", 10.5);
        Rabbit roger = new Rabbit("Roger", 1.5);

        try {
            Sheep clonedSheep = (Sheep) doly.clone();
            clonedSheep.say();
            System.out.println(doly == clonedSheep);
            Rabbit clonedRabbit = (Rabbit) roger.clone();
            clonedRabbit.say();
            System.out.println(roger == clonedRabbit);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
