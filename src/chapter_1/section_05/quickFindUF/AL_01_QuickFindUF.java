package chapter_1.section_05.quickFindUF;

public class AL_01_QuickFindUF {
    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(5);
        /*quickFindUF.printIds();
        System.out.println();*/
        quickFindUF.union(1,2);
       /* quickFindUF.printIds();
        System.out.println();*/
        quickFindUF.union(4,2);
       /* quickFindUF.printIds();
        System.out.println();*/

        System.out.println(quickFindUF.isConnected(4,1));
    }
}
