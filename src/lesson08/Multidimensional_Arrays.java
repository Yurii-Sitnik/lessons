package lesson08;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        //int[] number = {1, 2, 3};

        //int[][] matrice = {{1,2,3,4,5},
        //                   {4},
        //                   {7,8,9}};
        //System.out.println(matrice[2][2]);
        //System.out.println(matrice[1][0]);
        //System.out.println(matrice[0][4]);
        //int [] number1 = new int[5];
        //String[][] strings = new String[4][5];
        //strings [0][1] = "������";
        //System.out.println(strings[0][1]);
        int[][] matrice = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}

