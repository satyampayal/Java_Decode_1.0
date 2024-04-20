package ArrayListQuestion;
class MergeTwoSorted{
    public static void main(String[] args) {
        
        int arr1[]={11,33,42,71};
        int arr2[]={26,54,69,81,110};
        int size=arr1.length+ arr2.length;
        int c[]=new int[size];

        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                c[k]=arr1[i];
                i++;
            }
            else{
                c[k]=arr2[j];
                j++;
            }
            k++;

        }
        // i index out of array length
        if(i==arr1.length){
            while(j<arr2.length){
                c[k]=arr2[j];
                j++;
                k++;
            }
        }
        // j index out of array length
        if(j==arr2.length){
            while(i<arr1.length){
                c[k]=arr1[i];
                i++;
                k++;
            }
        }
        for (int ele : c) {
            System.out.print(ele+" ");
            
        }
    }
}