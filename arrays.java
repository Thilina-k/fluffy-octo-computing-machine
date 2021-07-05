import java.util.Arrays;

public class arrays {
    public static void main (String[]args) {

        int[][] arrays = {{34, 56, 78}, {23, 34, 54, 67, 34}, {23, 34, 56}};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
 }
