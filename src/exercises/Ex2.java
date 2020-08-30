package exercises;

public class Ex2 {

    public static void main(String[] args) {

        int number = 41;
        int count = 0 ;

        for (int i = 1 ; i <= number ; i++) {
            if (number % i == 0) {
                count++ ;
            } else if (count > 2) {
                break;
            }
        }
        if (count == 2) {
            System.out.println(number + "  jest liczba pierwsza");
        }else {

        }

    }
    }
