package structural.adapter;

public class GangOfFourBook implements AmazonItem {
    @Override
    public String getPrice() {
        return "10 euro";
    }
}
