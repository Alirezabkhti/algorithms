package chapter_1.section_05.quickUnionUF;

public class AL_02_QuickUnionUF {
    public static void main(String[] args) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(5);
        /*quickUnionUF.printIds();
        System.out.println();*/
        quickUnionUF.union(1,2);
       /* quickUnionUF.printIds();
        System.out.println();*/
        quickUnionUF.union(4,2);
       /* quickUnionUF.printIds();
        System.out.println();*/

        System.out.println(quickUnionUF.isConnected(4,1));
    }
}
