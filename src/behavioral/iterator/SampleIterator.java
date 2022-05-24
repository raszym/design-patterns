package behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class SampleIterator implements Iterator {

    private List<String> samples;

    private int index;

    public SampleIterator(List<String> samples) {
        this.samples = samples;
    }

    @Override
    public boolean hasNext() {
        return index < samples.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return samples.get(index++);
        }
        return null;
    }
}
