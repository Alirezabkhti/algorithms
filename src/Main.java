
public class Main {
    public static void main(String[] args) {
        boolean[][] shape = {{false, false, true}, {true, true, false}, {false, true, false}, {true, true, true}};
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if(shape[i][j]){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
