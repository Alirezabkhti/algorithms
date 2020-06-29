package chapter_1.section_03.queueUsingArray;

public class AL_05_QueueUsingArray {
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(2);

        System.out.println(queueUsingArray.isEmpty());

        queueUsingArray.enqueue("Alireza");
        queueUsingArray.enqueue("Jack");
        System.out.println(queueUsingArray.dequeue());
        queueUsingArray.enqueue("Jane");

        System.out.println(queueUsingArray.isEmpty());

        System.out.println(queueUsingArray.dequeue());
        System.out.println(queueUsingArray.dequeue());

        System.out.println(queueUsingArray.isEmpty());
    }
}
