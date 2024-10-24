public class Practice2 {
    public static int fun(int n){
        if(n==0){
            return 0;
        }else{
            return 1 + fun(n/2);
        }

    }

    public static void fun2(int n){
        if(n==0){
            return;
        }
        fun(n/2);
        System.out.println(n%2);

    }

    public static void printNto1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
    }

    public static void print1toN(int n){
        if(n == 0){
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }
    
    public static boolean prime(int n){
        
        if(n <= 1){  // 0 and 1 is not prime 
            return false;
        }
        
        for(int i=2; i<n; i++){
           if (n % i == 0){
                return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
      // printNto1(100); 
      //print1toN(100);
      System.out.println(prime(11));

    }
}
