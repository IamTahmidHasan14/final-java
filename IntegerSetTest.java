public class IntegerSetTest{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Testing IntegerSet");
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();
        IntegerSet unionOfAB = new IntegerSet();
        IntegerSet intersectionOfAB = new IntegerSet();
        IntegerSet differenceOfAB = new IntegerSet();
        int[] x = {1,0,1,0,1};
        int[] y = {1,1,0,1,0};
        a.insertElementFromArray(x);
        b.insertElementFromArray(y);
        unionOfAB = IntegerSet.union(a, b);
        intersectionOfAB = IntegerSet.intersection(a, b);
        differenceOfAB = IntegerSet.difference(a, b);
        System.out.println("Union of a and b: " + unionOfAB);
        System.out.println("Intersection of a and b: " + intersectionOfAB);
        System.out.println("Difference (a-b): " + differenceOfAB);
    }
}
