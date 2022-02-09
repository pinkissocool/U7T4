import java.util.*;
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Jessica");
//        names.add("Emily");
//        names.add("Destiny");
//        names.add("Mateo");
//        names.add("Sofia");
//        names.add("Tim");
//        names.add("James");
//
//        // before:
//        System.out.println(names);
//
//        // complete code below to traverse the arraylist and insert "HELLO" after any
//        // name that contains the letter "i"
//        for (int i = 0; i < names.size()-1; i++)
//        {
//            if (names.get(i).contains("i")){
//                names.add(i+1, "hello");
//            }
//        }
//
//        // after:
//        System.out.println(names);
//        ArrayList<String> names2 = new ArrayList<String>();
//        names2.add("Jessica");
//        names2.add("Emily");
//        names2.add("Destiny");
//        names2.add("Mateo");
//        names2.add("Sofia");
//        names2.add("Tim");
//        names2.add("James");
//
//// before:
//        System.out.println(names2);

// complete code below to traverse the arraylist and remove all
// names that are exactly 5 letters long
//        for (int i = 0; i < names2.size(); i++)
//        {
//            if (names2.get(i).length() == 5){
//                names2.remove(i);
//                i--;
//            }
//        }
//
//// after:
//        System.out.println(names2);
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
        System.out.println(contains);

        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int count = ArrayListAlgorithms.belowAverage(intList);
        System.out.println(count);
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(6, 3, 8, 5, 6, 3));
        count = ArrayListAlgorithms.belowAverage(intList2);
        System.out.println(count);
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(10, 12, 9));
        count = ArrayListAlgorithms.belowAverage(intList3);
        System.out.println(count);

        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        ArrayListAlgorithms.replaceWithCaps(stringList2);
        System.out.println(stringList2);

        ArrayList<String> stringList12 = new ArrayList<String>(Arrays.asList("yes", "pass", "buts", "Mets", "Yankees"));
        ArrayListAlgorithms.replaceWithCaps(stringList12);
        System.out.println(stringList12);

        ArrayList<String> stringList13 = new ArrayList<String>(Arrays.asList("yeah", "pat", "but", "Met", "Yankee"));
        ArrayListAlgorithms.replaceWithCaps(stringList13);
        System.out.println(stringList13);

        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int index = ArrayListAlgorithms.indexOfMinimum(intList);
        System.out.println(index);
        ArrayList<Integer> intList5 = new ArrayList<Integer>(Arrays.asList(6, 8, 3, 5, 6, 3, 2, 3, 2));
        index = ArrayListAlgorithms.indexOfMinimum(intList5);
        System.out.println(index);
        ArrayList<Integer> intList6 = new ArrayList<Integer>(Arrays.asList(10, 12, 9, 9, 8));
        index = ArrayListAlgorithms.indexOfMinimum(intList6);
        System.out.println(index);





    }

}
