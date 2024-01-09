import java.util.HashSet;

public class TestHashSet<I extends Number> {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);

        HashSet<Integer> intersection = HashSet1.intersection(set1,set2);
        System.out.println("Intersection: " + intersection);

        HashSet<Integer> union = HashSet1.unionSet(set1,set2);
        System.out.println("Union: " + union);

        HashSet<Integer> difference = HashSet1.differenceSet(set1,set2);
       System.out.println("Difference: " + difference);
    }
}

