package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class MusicPlayer implements Player {

    private List<String> samples = List.of("Utwor 1", "Utwor 2", "Utwor 3");

    @Override
    public Iterator<SampleIterator> getIterator() {
        return new SampleIterator(samples);
    }
}
