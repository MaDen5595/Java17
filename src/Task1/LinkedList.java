package Task1;

import java.util.Objects;

public class LinkedList {
    Node head;
    public static LinkedList insert(LinkedList list, String data)
    {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("Список: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static LinkedList deleteByKey(LinkedList list,
                                         String key)
    {
        Node currNode = list.head, prev = null;
        if (currNode != null && Objects.equals(currNode.data, key)) {
            list.head = currNode.next;
            System.out.println(key + " Найден и удалён");
            return list;
        }
        while (currNode != null && !Objects.equals(currNode.data, key)) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;

            System.out.println(key + " Найден и удалён");
        }
        if (currNode == null) {
            System.out.println(key + " не найден");
        }
        return list;
    }
    public static void isEmpty(LinkedList list){
        if(list.head == null){
            System.out.println("Пуст");
        }
        else{
            System.out.println("Не пуст");
        }
    }
}
