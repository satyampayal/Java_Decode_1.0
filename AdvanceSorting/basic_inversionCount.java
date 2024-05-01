package AdvanceSorting;

public class basic_inversionCount {

    public static void countInversion(int[] input){
        int count=0;
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]>input[j]) count++;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int[] input={80,70,60,50,40,30,20,10};
        countInversion(input);
        
    }
}
