package Task2;

import java.util.Objects;

public class LinkedList {
    Node head;
    int length = 0;
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
        list.length++;
        return list;
    }
    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.print("Список: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static LinkedList sortList(LinkedList list){
        LinkedList ret = new LinkedList();
        String max = "";
        Node currNode = list.head;
        for(int i = 0;i< list.length;i++){
            while(currNode != null){
                if(currNode.data.length() > max.length()){
                    max = currNode.data;
                }
                currNode = currNode.next;
            }
            LinkedList.deleteByKey(list, max);
            LinkedList.insert(ret,max);
            max = "";
            currNode = list.head;
        }
        return ret;
    }
    public static LinkedList deleteByKey(LinkedList list,
                                               String key)
    {
        Node currNode = list.head, prev = null;
        if (currNode != null && Objects.equals(currNode.data, key)) {
            list.head = currNode.next; // Changed head
            return list;
        }
        while (currNode != null && !Objects.equals(currNode.data, key)) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
        }
        return list;
    }

}
