public class fibbonacci {
    public static int fibonacci(int n){
      if(n == 0  || n == 1){
        return n;
      }
      int fib = fibonacci(n-1)+fibonacci(n-2);
      return fib;
    }

    // sum of n natural number
    public static int naturalSum(int n){
        if(n == 0){
            return 0;
        }
        return n+naturalSum(n-1);
    }

    // check pallindrom using recursion
    public static boolean pallindrom(String str){
      int start = 0;
      int end = str.length()-1;
      while (start <= end) {
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        start++;
        end--;
      }
      return true;
    }

    // convert in recursion
    public static boolean pallindromRecursion(String str, int start, int end){
        if (start >= end) {
            return true;
        }
        return ((str.charAt(start) == str.charAt(end))
            &&  (pallindromRecursion(str, start+1, end-1)));
      }

    public static void main(String[] args) {
      //  System.out.println(fibonacci(25));
      //  System.out.println(naturalSum(10));
      String str = "madama";
      //System.out.println(pallindrom(str));
      int start = 0;
      int end = str.length()-1;
      System.out.println(pallindromRecursion(str, start, end));
    }
}
