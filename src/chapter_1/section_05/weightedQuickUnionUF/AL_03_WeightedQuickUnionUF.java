package chapter_1.section_05.weightedQuickUnionUF;

public class AL_03_WeightedQuickUnionUF {
    public static void main(String[] args) {
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(5);
        /*quickUnionUF.printIds();
        System.out.println();*/
        weightedQuickUnionUF.union(1,2);
       /* quickUnionUF.printIds();
        System.out.println();*/
        weightedQuickUnionUF.union(4,2);
       /* quickUnionUF.printIds();
        System.out.println();*/

        System.out.println(weightedQuickUnionUF.isConnected(4,1));
    }
}
