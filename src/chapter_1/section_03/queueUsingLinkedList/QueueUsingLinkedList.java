package chapter_1.section_03.queueUsingLinkedList;

class QueueUsingLinkedList {
    private Node first = null;
    private Node last = null;

    private class Node {
        String item;
        Node next;
    }

    boolean isEmpty(){
        return first == null;
    }

    void enqueue(String item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    String dequeue(){
        String item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }

}
