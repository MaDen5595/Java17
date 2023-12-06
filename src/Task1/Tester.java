package Task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Spisok spisok = new Spisok();
        int i = 891;
        System.out.println("Добро пожаловать!");
        while(i!=0){
            System.out.println("Для создания пустого списка напишите 1\n" +
                    "Для добавления элемента списка напишите 2\nДля удаления элемента из списка напишите 3\n" +
                    "Для вывода элемента списка на экран напишите 4\nДля очистки списка напишите 5\n" +
                    "Для проверки списка на пустоту напишите 6\nДля выхода напишите 0");
            while(!sc.hasNextInt()){
                System.out.println("Цифру введи:");
                sc.nextLine();
            }
            i = sc.nextInt();
            if(i>6){
                System.out.println("Не та цифра");
            }
            switch(i){
                case(1) -> spisok.voidSpisok();
                case (2) -> {
                    sc.nextLine();
                    System.out.println("Enter brand of element: ");
                    String brand = sc.nextLine();
                    System.out.println("Enter model of element: ");
                    String model = sc.nextLine();
                    System.out.println("Enter tyres of element: ");
                    String tyres = sc.nextLine();
                    System.out.println(spisok.addElem(new Element(brand,model,tyres)));
                }
                case(3) -> {
                    System.out.println("Enter index of element: ");
                    while(!sc.hasNextInt()){
                        System.out.println("Цифру введи:");
                        sc.nextLine();
                    }
                    int ind = sc.nextInt();
                    spisok.delElem(ind);
                }
                case(4) -> {
                    System.out.println("Enter index of element: ");
                    while(!sc.hasNextInt()){
                        System.out.println("Цифру введи:");
                        sc.nextLine();
                    }
                    int ind = sc.nextInt();
                    spisok.printElemByNum(ind);
                }
                case(5) -> spisok.clearSpisok();
                case(6) -> System.out.println(spisok.isEmpty());
            }
        }
    }
}
