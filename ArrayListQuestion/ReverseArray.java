package ArrayListQuestion;

public class ReverseArray {
    public static void main(String[] args) {

        // we are use two pointer technique
        int[] arr = { -1, 2, 3, 4, 34, 23, 0 };
        // two poniter to pnt left ,right
        int lp = 0, rp = arr.length - 1;
        // int lp = 1, rp = arr.length - 2; // part of array reverse
        while (lp < rp) {
         
            swap(arr,lp,rp);
            lp++;
            rp--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr,int lp, int rp){
         int temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;
    }

}
