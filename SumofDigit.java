public class SumofDigit {
    
    public static int sumofdigit(int n){
        if(n == 0){
            return 0;
        }
        return sumofdigit(n/10)+n%10;
    }

    // sum of digit iterative 
    public static int sumofdigit2(int n){
        int sum = 0;

        while(n > 0){
        sum  += n % 10;
        n = n / 10;
        
      }
     return sum;
    }

    // 

    public static void main(String[] args) {
        System.out.println(sumofdigit(1367));
        System.out.println(sumofdigit2(1367));
    }
}