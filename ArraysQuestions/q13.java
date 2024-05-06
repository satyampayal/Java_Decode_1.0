package ArraysQuestions;

import java.util.ArrayList;
//import java.util.Arrays;

public class q13 {
    public static int[][] overlappedInterval(int[][] arr) {
        // Code here // Code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        //  Arrays.sort(arr);
      ArrayList<Integer> temp=new ArrayList<>();
      temp.add(arr[0][0]);
      temp.add(arr[0][1]);
        ans.add(temp);
        
       int j=1;// for point arrayList 
        for (int i = 1; i < arr.length; i++) {
            if(ans.get(j-1).get(1)>=arr[i][0]){
                if(ans.get(j-1).get(1)<arr[i][1]){
                    ans.get(j-1).set(1, arr[i][1]);
                }
            }
            else{
                ArrayList<Integer> t=new ArrayList<>();
                t.add(arr[i][0]);
                t.add(arr[i][1]);
                ans.add(t);
                j=ans.size();
            }
           
        }
        int n = ans.size();
        int[][] res = new int[n][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }

        return res;

    }

    public static void main(String[] args) {
        // int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 9 }, { 9, 11 }, { 8, 10 }, { 2, 4 }, { 15, 18 }, { 16, 17 } };
        // int[][] arr = { { 1, 3 }, { 2, 4 }, { 2,6 }, { 8,9},  { 8, 10 },{ 9, 11 }, { 15, 18 }, { 16, 17 } };
        int[][] arr = { { 1, 3 }, { 2, 4 }, { 6,8 }, { 9,10} };

        int[][] ans = overlappedInterval(arr);
        for (int[] is : ans) {
            for (int el : is) {
                System.out.print(el+" ");

            }
            System.out.println();

        }

    }
}
