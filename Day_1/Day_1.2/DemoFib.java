class Fibonacci {
    public int fib(int n) {
       if(n==0)
            return 0;
        if(n==1)
            return 1;
        int f=fib(n-1)+fib(n-2);
      return f;
    }
}
class DemoFib{
    public static void main(String args[]){
        Fibonacci fi=new Fibonacci();
        System.out.println("Total of fibonacci till 4th number: " + fi.fib(4));
    }
}