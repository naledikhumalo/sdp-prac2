package sdp.prac2;

import java.util.List;



public class SimpleFunctions {
    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
    if (a.size() != b.size()) {
        return null;
    }
    List<Integer> result = new ArrayList<Integer>();
    int size = a.size();
    for (int i = 0; i < size; i++) {
        result.add(a.get(i) * b.get(size - i - 1));
    }
    return result;
}
    public static boolean task3(String s) {
        int count = 0; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;    //increment counter for an opening parentheses
            } else if (c == ')') {
                count--;    // decrement counter for a matching closing parentheses 
                if (count < 0) {
                    return false;   // extra closing parentheses
                }
            }
        }
        return count == 0;
    }
    public SimpleFunctions() {}

    private static int Compare(Integer x, Integer y){
        // helper function for Task 5
        // 
        if (x > y){
            return 1;
        }
        else if (x < y){
            return -1;
        }
        return 0;
    }


    public static Boolean Task5(List<Integer> list){

        for (int i = 0; i < list.size()-1; i++){
            if (Compare(list.get(i), list.get(i + 1)) >= 0 ) {
                return false;
            }
        }
        return true;
    }
   
}
