package chapter_1.section_05.quickFindUF;

class QuickFindUF {
    private int[] ids;

    QuickFindUF(int numberOfObjects) {
        ids = new int[numberOfObjects];
        for (int i = 0; i < numberOfObjects; i++) {
            ids[i] = i;
        }
    }

    void union(int firstObject, int secondObject) {
        int firstObjectId = ids[firstObject];
        int secondObjectId = ids[secondObject];
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == firstObjectId)
                ids[i] = secondObjectId;
        }
    }

    boolean isConnected(int firstObject, int secondObject) {
        return ids[firstObject] == ids[secondObject];
    }

    /*public void printIds() {
        for (int i = 0; i < ids.length; i++) {
            System.out.println("value of " + i + " is " + ids[i]);
        }
    }*/
}
