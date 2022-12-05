import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task2 {
    
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int temp = random.nextInt(20);
            list.add(temp);
        }
        for (int el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
        List <Integer> list2 = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            if (list.get(i) % 2 == 1) list2.add(list.get(i));
        }
        for (int el : list2) {
            System.out.print(el + " ");
        }
    }

}
