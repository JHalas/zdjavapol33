package exercises;

public class Ex4 {

     public static void switchArray(int[] array) {
         if (array.length >= 3) {
             System.out.println("Before");
             arrayPrint(array) ;
             int positionZeroOrginalValue = array[0] ;
             array[0] = array[2] ;
             array[2] = positionZeroOrginalValue ;
             System.out.println("after");
             arrayPrint(array) ;

         }else {
             System.out.println(" too small table");
         }
     }

     public static void arrayPrint (int[] table)
}
