package structural.adapter;

import java.math.BigDecimal;

public class DollarAdapter implements Adapter {

    private static final BigDecimal RATE = BigDecimal.valueOf(1.1);

    private final AmazonItem amazonItem;

    public DollarAdapter(AmazonItem amazonItem) {
        this.amazonItem = amazonItem;
    }

    @Override
    public String convert() {
        String[] splitPrice =  this.amazonItem.getPrice().split(" ");
        BigDecimal price = new BigDecimal(splitPrice[0]);

        if("euro".equalsIgnoreCase(splitPrice[1])) {
            return price.multiply(RATE).toString() + " $";
        }
        return price.toString();
    }
}
