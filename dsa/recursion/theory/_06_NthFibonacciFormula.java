package dsa.recursion.theory;

public class _06_NthFibonacciFormula {
    public static void main(String[] args) {
        System.out.println("Using formula-01");
        System.out.println(fibFormula1(4));
        System.out.println(fibFormula1(8));
        System.out.println(fibFormula1(50)); // 12,586,269,025 -> correct

        System.out.println("\nUsing formula-02");
        System.out.println(fibFormula2(4));
        System.out.println(fibFormula2(8));
        System.out.println(fibFormula2(50)); // 12,586,269,025 -> correct
    }
    // both formulas are derived from linear recurrence - T & S complexity
    static long fibFormula1(int n){
       return (long) (( Math.pow(((1+Math.sqrt(5))/2), n) -  Math.pow(((1-Math.sqrt(5))/2), n) ) / Math.sqrt(5) );
    }

    //we can ignore less dominating term. So new formula can be
    static long fibFormula2(int n){
        return (long) (( Math.pow(((1+Math.sqrt(5))/2), n) ) / Math.sqrt(5) );
    }
}
