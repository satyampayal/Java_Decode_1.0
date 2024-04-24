package PlacementQuestion;
public class SwapLast {
public static void main(String[] args) {
    int num=7893;
    int swappedNum;
    int lastDigit,firstDigit,digits;

    lastDigit=num%10;
    digits=(int) Math.log10(num);
    System.out.println(digits);
    firstDigit=(int) (num/Math.pow(10,digits));

    swappedNum=lastDigit;
    swappedNum*=(int) Math.round(Math.pow(10, digits));
    swappedNum+=num%Math.pow(10, digits);
    swappedNum-=lastDigit;
    swappedNum+=firstDigit;

    System.out.println(swappedNum);
  System.out.println(1995/10);
}
}

// pyschoMetrix
// Logical

// Technical
