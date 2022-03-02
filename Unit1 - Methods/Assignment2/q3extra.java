 

public class q3extra {
    public static void main(String [] args){
        System.out.println(withoutEnd2("Hello"));
    }
    public static String withoutEnd2(String  str){
        int length = str.length();
        if(length >= 1){
            str = str.substring(1 , length-1);
            return str;
        }
        if(length == 0){
            
            return "";
        }
        else
            return "";

    }
}
