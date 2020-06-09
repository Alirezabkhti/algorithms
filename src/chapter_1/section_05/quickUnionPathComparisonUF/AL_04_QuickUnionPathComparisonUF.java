package chapter_1.section_05.quickUnionPathComparisonUF;

public class AL_04_QuickUnionPathComparisonUF {
    public static void main(String[] args) {
        QuickUnionPathComparisonUF quickUnionPathComparisonUF =
                new QuickUnionPathComparisonUF(5);
        /*quickUnionUF.printIds();
        System.out.println();*/
        quickUnionPathComparisonUF.union(1, 2);
       /* quickUnionUF.printIds();
        System.out.println();*/
        quickUnionPathComparisonUF.union(4, 2);
       /* quickUnionUF.printIds();
        System.out.println();*/

        System.out.println(quickUnionPathComparisonUF.isConnected(4, 1));
    }
}
