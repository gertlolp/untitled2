import java.util.HashSet;
import java.util.Set;


public class HashSet1<I> extends HashSet<I>{

    public static <I> HashSet<I> intersection(HashSet<I> set1, HashSet<I> set2){
        HashSet<I> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static <I>HashSet<I> unionSet (HashSet<I> set1, HashSet<I> set2){
        HashSet<I> result = new HashSet<>(set1);
        result.addAll(set2);
        return  result;
    }

    public static <I>HashSet<I> differenceSet(HashSet<I> set1, HashSet<I> set2){
        HashSet<I> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }

}
