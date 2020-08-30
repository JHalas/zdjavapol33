package exercises ;

public class Ex1 {


    public static void printMultiplyTableForN(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
        }
        System.out.println("------");
    }

    public static void main(String[] args) {


        Ex1.printMultiplyTableForN(2);
        Ex1.printMultiplyTableForN(7);
        Ex1.printMultiplyTableForN(11);
        Ex1.printMultiplyTableForN(24 );
        Ex1.printMultiplyTableForN(33 );
    }
}