package Problem1B;

import java.util.Comparator;

public class WeightComparator implements Comparator<Vertex> {

	@Override
	public int compare(Vertex v1, Vertex v2) {
		if (v1.getWeight() < v2.getWeight())
        {
            return -1;
        }
        if (v1.getWeight() > v2.getWeight())
        {
            return 1;
        }
        return 0;
	}

}
