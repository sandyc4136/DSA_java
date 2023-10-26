

public class RecursionSeries {
    public static void main(String args[]){
        int n=3;
        double result=1.0;
         double recursion9(int num){
            if(num>=n){
                return result;
            }
            else{
                if(num%2==0){
                    result=result-(1/n);
                }
                else
                    result=result+(1/n);
            recursion9(result);
            }
        }
    }
}
