package chapter_1.section_03.stackUsingLinkedList;

class StackUsingLinkedList {
    private Node first = null;

    private class Node {
        String item;
        Node next;
    }

    boolean isEmpty() {
        return first == null;
    }

    void push(String item){
        Node oldFirst = first;
        first = new Node();
        first.next = oldFirst;
        first.item = item;
    }

    String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}
