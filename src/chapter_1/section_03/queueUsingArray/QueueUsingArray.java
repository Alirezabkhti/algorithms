package chapter_1.section_03.queueUsingArray;

class QueueUsingArray {
    private int first;
    private int last;
    private int queueElementCounts;
    private String[] queue;

    QueueUsingArray(int queueSize) {
        queue = new String[queueSize];
    }

    boolean isEmpty() {
        return queueElementCounts == 0;
    }

    void enqueue(String item) {
        if (queueElementCounts == queue.length)
            try {
                throw new Exception("Queue is full");
            } catch (Exception e) {
                e.printStackTrace();
            }
        queue[last++] = item;
        if (last == queue.length)
            last = 0;
        queueElementCounts++;
    }

    String dequeue() {
        if (isEmpty())
            throw new NullPointerException("Queue is empty");
        String item = queue[first];
        queue[first] = null;
        queueElementCounts--;
        first++;
        if (first == queue.length)
            first = 0;
        return item;
    }
}
