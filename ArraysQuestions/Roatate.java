package ArraysQuestions;

public class Roatate {
    public static void transpose(int[][]  matrix){
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<n;i++){
           for(int j=i;j<m;j++){
            //swap
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
           }
        }

    }
    public static void reverseRow(int[][] matrix){
        int m=matrix[0].length;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int lo=0;
            int hi=m-1;
            while(lo<=hi){
                int temp=matrix[i][lo];
                matrix[i][lo]=matrix[i][hi];
                matrix[i][hi]=temp;
                lo++;
                hi--;
            }
           
         }

    }
    public static void rotate(int[][] matrix) {
        // Transpose
        transpose(matrix);
        // reverse every row
        reverseRow(matrix);
        

        
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] is : matrix) {
            for (int ele : is) {
                System.out.print(ele+" ");
                
            }
            System.out.println();
            
        }

        
    }
}
