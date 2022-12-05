import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

public class Task3 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0;i<8;i++){
            int temp = random.nextInt(20);
            list.add(temp);
        }
        for (int el : list) {
            System.out.print(el + " ");
        }
        System.out.println();
        int min = list.get(0);
        for(int i=1;i<list.size();i++){
            if (list.get(i) < min) min = list.get(i);
        }
        System.out.println("Минимальное число: " + min);
        int max = list.get(0);
        for(int i=1;i<list.size();i++){
            if (list.get(i) > max) max = list.get(i);
        }
        System.out.println("Максимальное число: " + max);
        double sum = list.get(0);
        for(int i=1;i<list.size();i++){
            sum += list.get(i);
        }
        double res = sum / list.size();
        System.out.println("Среднее: " + res);
    }
}
