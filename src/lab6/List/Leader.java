package lab6;

import java.util.*;

public class Leader {

    public static void DisplayLeader(List<Integer> list) {
        Collections.reverse(list);
        int max = list.get(0);
        System.out.print("Leaders: " + max);
        for (int current : list) {
            if (current > max) {
                System.out.println(" " + current);
                max = current;
            }
        }


    }

    public static List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        List<Integer> toReturn = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                toReturn.add(l1.get(i));
                i++;
            } else {
                toReturn.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()) {
            toReturn.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            toReturn.add(l2.get(j));
            j++;
        }
        return toReturn;
    }



    public static void main(String[] args){
       // List<Integer> list = Arrays.asList(1,5,2,5,9,0,8,1,7);
        //Leader.DisplayLeader(list);
        List<Integer> 11 = Arrays.asList(1,5,9,11,20,30);
        List<Integer> 12 = Arrays.asList(1,2,7,9);

        List<Integer> list = Leader.merge(11,12);
        System.out.println(list);
    }
}
