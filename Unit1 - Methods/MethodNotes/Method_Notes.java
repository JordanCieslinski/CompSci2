public class Method_Notes {

    public static void main(String[] args) {

        System.out.println(area(4, 5));
        numOfStars(5); // you dont need s.o.pl bc method is void
        System.out.println(g(5));

    }

    public static double area(double length, double width) {

        return length * width;

    }

    public static void numOfStars(int k) {
        for (int i = 1; i <= k; i++) {
            System.out.println("*****");
        }

    }

    public static int g(int x) {
        if(x>5){
            return 3*x -1;
        }
        else if(2 <= x && x <= 5){
            return 4;
        }
        else{
            return 2*x + 2;
        }
    }
}