 

public class q2exta {
    
    public static void main(String [] args){
        System.out.println(makeBricks(3,1,9));
    }
    public static boolean makeBricks(int small, int big, int goal){
        big *= 5;
        if(big+small == goal){
            return true;
        }
        else
            return false;

    }
}