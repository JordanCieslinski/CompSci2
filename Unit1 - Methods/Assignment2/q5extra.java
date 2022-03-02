 

public class q5extra {
    public static void main(String [] args){
        System.out.println(lastChars("", ""));
        
    }
    public static String lastChars(String a, String b){
        int A = a.length();
        int B = b.length();
        if(A != 0 && B != 0){
            a = a.substring(0,1);
            b = b.substring(B-1);
        }
        else if(A == 0 && B != 0){
            a = "@";
            b = b.substring(B-1);
            }
        else if(A == 0 && B != 0){
            a = a.substring(0,1);
            b = "@";
        }
        else if(A == 0 && B == 0){
            a = "@";
            b = "@";
        }
        return a+""+b;
    }
}
