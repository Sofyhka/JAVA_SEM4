import java.util.LinkedList;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Введите элемент списка: ");
            int elem = sc.nextInt();
            list.add(elem);
        }
        System.out.println("Исходный список: " + list);
        System.out.println("Перевернутый список: " + reverseList(list));
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer element : list) {
            reversedList.addFirst(element);
        }
        return reversedList;
    }
}