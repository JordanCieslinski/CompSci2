 

public class q4extra {
    public static void main(String [] args){
        System.out.println(comboString("Hello", "Hi"));
        
    }
    public static String comboString(String a, String b){
        int A = a.length();
        int B = b.length();
        String shortStr = "";
        String longStr = "";
        if (A > B){
            longStr = a;
            shortStr = b;
        }
        else if(B > A){
            longStr = b;
            shortStr = a;
        }
        return shortStr+""+longStr+""+shortStr;


    }
}
