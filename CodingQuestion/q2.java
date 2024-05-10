package CodingQuestion;

public class q2 {
    public static void main(String[] args) {
        String s = "CD#34";
        int price = 0;
        for (int j = 0; j < s.length(); j++) {
            int tempforInt = (int) s.charAt(j);
            int maxAscii = 0;
            if (tempforInt >= 48 && tempforInt <= 57) {
                maxAscii = tempforInt-48;
            } else {
                String temp = "" + tempforInt;

                for (int i = 0; i < temp.length(); i++) {

                    int t = (int) temp.charAt(i) - 48;
                    
                    if (t > maxAscii) {
                        maxAscii = t;
                    }
                }
            }
            price += maxAscii;
        }
        System.out.println("" + price);

    }
}
