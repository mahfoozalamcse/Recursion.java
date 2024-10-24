public class Practice1 {

    public static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n+" ");
        fun(n-1);
    }

    public static void fun2(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n+" ");
        fun2(n-1);
        System.out.println(n+" ");
    }

    
    public static void main(String[] args) {
       fun(3);
       fun2(3);
    }
}