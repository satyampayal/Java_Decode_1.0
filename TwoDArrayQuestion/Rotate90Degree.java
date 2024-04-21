package TwoDArrayQuestion;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        // Transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<=i-1;j++){
              swap(arr, i, j);
            }
        }
        // reverse 
       for(int i=0;i<arr.length;i++){
            reverse(arr, i, 0, arr.length-1);
        }
         
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2+" ");
                
            }
            System.out.println();
            
        }   
    }
    public static void swap(int[][] arr,int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
  
    public static void reverse(int[][] arr,int i,int lp,int rp){
        while(lp<rp){
            int temp=arr[i][lp];
            arr[i][lp]=arr[i][rp];
            arr[i][rp]=temp;
            lp++;
            rp--;
        }
    }
}
