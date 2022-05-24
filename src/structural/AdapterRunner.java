package structural;

import structural.adapter.Adapter;
import structural.adapter.AmazonItem;
import structural.adapter.DollarAdapter;
import structural.adapter.GangOfFourBook;

public class AdapterRunner {

    public void run() {
        AmazonItem gangOfFourBook = new GangOfFourBook();
        Adapter dollarAdapter = new DollarAdapter(gangOfFourBook);

        System.out.println(dollarAdapter.convert());
    }
}
