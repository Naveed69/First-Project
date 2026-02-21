import java.util.*;

class Comparables implements Comparable<Comparables> {

    int id;

    Comparables(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Comparables other) {
        return this.id - other.id;
    }

    public static void main(String[] args) {

        List<Comparables> list = new ArrayList<>();

        list.add(new Comparables(3));
        list.add(new Comparables(1));
        list.add(new Comparables(2));

        Collections.sort(list);

        for (Comparables c : list) {
            System.out.println(c.id);
        }
    }
}
