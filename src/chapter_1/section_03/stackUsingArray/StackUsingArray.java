package chapter_1.section_03.stackUsingArray;

class StackUsingArray {
    private String[] items;
    private int stackIndex = 0;

    StackUsingArray(int stackSize) {
        this.items = new String[stackSize];
    }

    boolean isEmpty() {
        return stackIndex == 0;
    }

    void push(String item) {
        items[stackIndex++] = item;
    }

    String pop() {
        String item = items[--stackIndex];
        items[stackIndex] = null;
        return item;
    }
}
