package ArrayListQuestion;

class DoubletSum{
    public static void main(String[] args) {
        
        int [] arr={-1,2,3,4,0};
        int targetSum=3;
      
        for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targetSum){
                    System.out.println(arr[i]+"and "+arr[j]);
                }
              }
        }
    }
}
