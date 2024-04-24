package TwoDArrayQuestion;

import java.util.ArrayList;
import java.util.List;

public class PascalTringle {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int n = 2;
        result= generatePascal(n);

        for (int i = 0; i < n; i++) {
            List<Integer> x = result.get(i);

            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> generatePascal(int n) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> x = new ArrayList<>(i + 1);
       
            for (int j = 0; j < x.size() ; j++) {
                x.add(1);
               
            }
            arr.add(x);
        }

    


        
        for (int i = 2; i < n; i++) {
            List<Integer> x = arr.get(i);
            for(int j=1;j<x.size()-1;j++){
                x.set(j,arr.get(i-1).get(j-1)+arr.get(i-1).get(j+1));
            }
         
        }

        return arr;
    }
}