package chapter_1.section_05.weightedQuickUnionPathComparisonUF;

public class AL_05_WeightedQuickUnionPathComparisonUF {
    public static void main(String[] args) {
        WeightedQuickUnionPathComparisonUF weightedQuickUnionPathComparisonUF =
                new WeightedQuickUnionPathComparisonUF(5);
        /*quickUnionUF.printIds();
        System.out.println();*/
        weightedQuickUnionPathComparisonUF.union(1,2);
       /* quickUnionUF.printIds();
        System.out.println();*/
        weightedQuickUnionPathComparisonUF.union(4,2);
       /* quickUnionUF.printIds();
        System.out.println();*/

        System.out.println(weightedQuickUnionPathComparisonUF.isConnected(4,1));
    }
}
