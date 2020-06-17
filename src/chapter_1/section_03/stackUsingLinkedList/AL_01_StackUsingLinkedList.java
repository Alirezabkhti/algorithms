package chapter_1.section_03.stackUsingLinkedList;

public class AL_01_StackUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();

        System.out.println(stackUsingLinkedList.isEmpty());

        stackUsingLinkedList.push("Alireza");
        stackUsingLinkedList.push("Jack");
        stackUsingLinkedList.push("Jane");

        System.out.println(stackUsingLinkedList.isEmpty());

        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());

        System.out.println(stackUsingLinkedList.isEmpty());
    }
}
