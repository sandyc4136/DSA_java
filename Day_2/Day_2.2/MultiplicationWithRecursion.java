

public class MultiplicationWithRecursion {
   static int num=1;
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=10;i++){
            System.out.println(n+ " * " + i + "= " + i*MultipliRecursion(n));
        }
        
    }
    static int MultipliRecursion(int n){
        
        if(num>=n){
            return n;
        }
        else{
            return n*MultipliRecursion(num);
        }
    }
}
