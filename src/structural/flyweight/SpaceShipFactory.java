package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SpaceShipFactory {

    private Map<String, SpaceShip> spaceShipCache = new WeakHashMap<>();

    public SpaceShip getSpaceShip(String type) {
        return spaceShipCache.computeIfAbsent(type, SpaceShip::new);
    }

    public int getCacheSize() {
        return spaceShipCache.size();
    }
}
