public class TailRecursion {
   public static void printToN(int n)
	{
		if(n == 0)
			return;
		
		printToN(n - 1);

		System.out.print(n+" ");

	}

    // convert in tail recursion which faster

    public static void tail(int n, int k){ // extra k = 1
      if(n == 0){
        return;
      }
      System.out.print(k+ " ");
      tail(n-1, k+1);
    }

    // print factorial using tail recursion
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    // convert into tail recursion 
    public static int tailFact(int n, int k){
        if(n == 0 || n == 1){
            return k;
        }
        return tailFact(n-1, k*n);

    }
    /*
     *   Tail call optamization
     * interpreter to optimize the recursion by reusing the current function's stack frame,
     *  thus avoiding the overhead of creating new stack frames for each recursive call. 
     * This optimization is called tail call optimization (TCO), and it can make recursion
     *  faster and more memory-efficient.

           Here’s a breakdown of why tail recursion can lead to faster execution:

        No extra stack frame: Tail recursion doesn't need to maintain separate stack frames 
                      for each call. Instead, it reuses the current one, thus saving space.
        Reduced memory overhead: Because the function doesn't need to keep 
                       track of intermediate results, there’s less memory overhead, reducing
                       the chances of a stack overflow in languages that support tail call optimization.
        Linear execution: Since the recursive call is the last thing the function does,
                       the compiler can turn the recursion into an iterative process behind the scenes.
     */
    public static void main(String[] args) {
        // printToN(4);
        // tail(4, 1);  // this faster code which have modern compiler
        System.out.println(fact(5));
        System.out.println(tailFact(5, 1));

    }
}
