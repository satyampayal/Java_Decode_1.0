package TwoDArrayQuestion;

class Transport{
    public static void main(String[] args) {
        int[][] arr={{1,2},{4,5},{7,8}};
        int[][] ans=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                 ans[j][i]=arr[i][j];
            }
        }
        for (int[] is : ans) {
            for (int is2 : is) {
                System.out.print(is2+" ");
                
            }
            System.out.println();
            
        }
    }
}