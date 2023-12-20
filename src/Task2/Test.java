package Task2;

public class Test {
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    LinkedList.insert(list,"a");
    LinkedList.insert(list,"ab");
    LinkedList.insert(list,"acd");
    LinkedList.insert(list,"abcd");
    LinkedList.insert(list,"ac");
    LinkedList.insert(list,"abc");
    LinkedList.printList(list);
    list = LinkedList.sortList(list);
    LinkedList.printList(list);
    }
}
