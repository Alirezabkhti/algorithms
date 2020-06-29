package chapter_1.section_03.queueUsingLinkedList;

public class AL_04_QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();

        System.out.println(queueUsingLinkedList.isEmpty());

        queueUsingLinkedList.enqueue("Alireza");
        queueUsingLinkedList.enqueue("Jack");
        queueUsingLinkedList.enqueue("Jane");

        System.out.println(queueUsingLinkedList.isEmpty());

        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());
        System.out.println(queueUsingLinkedList.dequeue());

        System.out.println(queueUsingLinkedList.isEmpty());
    }
}
