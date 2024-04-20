package ArrayListQuestion;

public class NextGretestElement {

  public static void main(String[] args) {
    
    int a[]={12,8,60,37,2,49,16,28,21};
    int ans[]=new int[a.length];
    ans[ans.length-1]=-1;
    // method 1: Brute Force ... Bina Soche Jamne sarri jaan laga do 
    // int j=0,max=a[0];
    // while(j<a.length-1){
    //     max=Integer.MIN_VALUE;
    //     for(int i=j+1;i<a.length;i++){
    //         if(a[i]>max){
    //             max=a[i];
    //         }
    //     }
    //     ans[j]=max;
    //     j++;
    // }

    // Method:2 
    int max=ans[a.length-1];
    for(int i=a.length-2;i>=0;i--){
        if(max<=a[i+1]){
            max=a[i+1];

        }
        ans[i]=max;
    }

    for (int i : ans) {
        System.out.print(i+" ");
    }

  
  }

    
}
