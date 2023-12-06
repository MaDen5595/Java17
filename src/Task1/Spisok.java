package Task1;

import java.util.LinkedList;

public class Spisok {
    private LinkedList<Element> elements;
    public void voidSpisok(){
        this.elements = new LinkedList<>();
        System.out.println("Список создан");
    }
    public boolean addElem(Element elem){
        return this.elements.add(elem);
    }
    public void delElem(int index){
        this.elements.remove(index);
    }
    public void printElem(Element elem){
        System.out.println(this.elements.get(this.elements.indexOf(elem)));
    }
    public void printElemByNum(int num){
        System.out.println(this.elements.get(num));
    }
    public void clearSpisok(){
        this.elements.clear();
        System.out.println("Список очищен");
    }
    public boolean isEmpty(){
        return this.elements.isEmpty();
    }

}
