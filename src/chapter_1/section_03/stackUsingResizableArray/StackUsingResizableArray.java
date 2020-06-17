package chapter_1.section_03.stackUsingResizableArray;

class StackUsingResizableArray {
    private String[] items;
    private int stackIndex = 0;

    StackUsingResizableArray() {
        this.items = new String[1];
    }

    boolean isEmpty() {
        return stackIndex == 0;
    }

    void push(String item) {
        if (stackIndex == items.length)
            resize(2 * items.length);
        items[stackIndex++] = item;
    }

    String pop() {
        String item = items[--stackIndex];
        items[stackIndex] = null;
        if (stackIndex > 0 && stackIndex == items.length / 4)
            resize(items.length / 2);
        return item;
    }

    private void resize(int stackNewSize) {
        String[] newItems = new String[stackNewSize];
        for (int i = 0; i < stackIndex; i++)
            newItems[i] = items[i];
        items = newItems;
    }
}
