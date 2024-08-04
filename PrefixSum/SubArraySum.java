package PrefixSum;

import java.util.HashMap;

public class SubArraySum {

    public static int countSubArraySum(int[] arr, int k) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                if (map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i]) + 1);
                else {
                    map.put(arr[i], 1);
                }
            } else {
                if (arr[i] == k) {
                    count++;
                    if (map.containsKey(k))
                        map.put(k, map.get(k) + 1);
                    else
                        map.put(arr[i], 1);

                }
                else{
                    int rem = arr[i] - k;
                    if (map.containsKey(rem)) {
                        count += map.get(rem);
                    }
                    if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]+1));
                    else map.put(arr[i], 1);
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, -3, 0, 7, 8, -1 };
        int k = 7;
        System.out.println(countSubArraySum(arr, k));
    }
}
