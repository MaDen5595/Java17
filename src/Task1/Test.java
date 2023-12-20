package Task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int i = 891;
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Добро пожаловать!");
        while(i!=0){
            System.out.println("Для создания списка напишите 1\n" +
                    "Для добавления элемента напишите 2\nДля удаления элемента напишите 3\n" +
                    "Для вывода списка напишите 4\nДля очистки списка напишите 5\n" +
                    "Для проверки на пустоту напишите 6\nДля выхода напишите 0");
            while(!sc.hasNextInt()){
                System.out.println("Цифру введи:");
                sc.nextLine();
            }
            i = sc.nextInt();
            if(i>6){
                System.out.println("Не та цифра");
            }
            switch(i){
                case(1) -> {
                    list = new LinkedList();
                    System.out.println("Список создан");
                }
                case (2) -> {
                    System.out.println("Абракадабра");
                    String vo = sc.nextLine();
                    System.out.println("Введите элемент: ");
                    String data = sc.nextLine();
                    LinkedList.insert(list, data);
                }
                case(4) -> {
                    LinkedList.printList(list);
                }
                case(3) -> {
                    System.out.println("Абракадабра");
                    String vo = sc.nextLine();
                    System.out.println("Введите элемент: ");
                    String data = sc.nextLine();
                    LinkedList.deleteByKey(list,data);
                }
                case(5) -> {
                    list = new LinkedList();
                    System.out.println("Список очищен");
                }
                case(6) -> {
                    LinkedList.isEmpty(list);
                }
            }
        }
    }
}
