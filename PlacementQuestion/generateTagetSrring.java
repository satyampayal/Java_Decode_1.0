package PlacementQuestion;

import java.util.ArrayList;

public class generateTagetSrring {
         public static ArrayList<String> getExpressions(String digits, int target) {
        ArrayList<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        generateExpressions(digits, target, "", 0, 0, 0, result);
        return result;
    }
    private static void generateExpressions(String digits, int target, String expression, int index, long currentEval, long prevOperand, ArrayList<String> result) {
        if (index == digits.length()) {
            if (currentEval == target) {
                result.add(expression);
            }
            return;
        }
        
        for (int i = index; i < digits.length(); i++) {
            if (i != index && digits.charAt(index) == '0') break; // avoid leading zero number
            long currOperand = Long.parseLong(digits.substring(index, i + 1));
            if (index == 0) {
                generateExpressions(digits, target, expression + currOperand, i + 1, currOperand, currOperand, result);
            } else {
                generateExpressions(digits, target, expression + "+" + currOperand, i + 1, currentEval + currOperand, currOperand, result);
                generateExpressions(digits, target, expression + "-" + currOperand, i + 1, currentEval - currOperand, -currOperand, result);
                generateExpressions(digits, target, expression + "*" + currOperand, i + 1, (currentEval - prevOperand) + (prevOperand * currOperand), prevOperand * currOperand, result);
            }
        }
    }
    public static void main(String[] args) {
      ArrayList<String> result=  getExpressions("125", 17);
      if(result.size()==0) System.out.println("Thear is no such Expression exists ");
       else for (String string : result) {
        System.out.println(string);;
        
      }
    }
}
