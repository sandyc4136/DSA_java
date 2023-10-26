

public class Recursion10 {
    public static void main(String args[]){
        String s="ABC";
        display(s,"");  
    }
    static void display(String str,String res) {
        if(str.length()==0){   // base condition
            System.out.println(res+ "");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);           // fix the first position 
            String ros=str.substring(0, i) + str.substring(i+1);
            display(ros, res+ch);
        }
    }
}
