
/**
 * Реализовать алгоритм сортировки слиянием
 */
public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[] {10, 0, 7, 11, 6, 12, 17, 2};
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        int[] res = sortArray(array);
        System.out.println("");
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < res.length ; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int [] sortArray(int[] arrayA){
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length < 2) {
            return arrayA; 
        }
        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        arrayB = sortArray(arrayB); 
        arrayC = sortArray(arrayC); 

        return mergeArrays(arrayB, arrayC);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] b = new int[a1.length + a2.length];
           int positionA1 = 0;
           int positionA2 = 0;
           
           for(int i = 0; i < b.length; i++) {
               if(positionA1 == a1.length){
                  b[i] = a2[positionA2];
                  positionA2++;
               } else if(positionA2 == a2.length){
                   b[i] = a1[positionA1];
                   positionA1++;
               } else if(a1[positionA1] < a2[positionA2]){
                   b[i] = a1[positionA1];
                   positionA1++;
               } else {
                   b[i] = a2[positionA2];
                   positionA2++;
               }
           }
           return b;
   }
    
}