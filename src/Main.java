public class Main {
    public static void main(String[] A) {
//        System.out.printf("dsaproject");
//        System.out.printf("Amitabh Sarkar");


//        int[][] arr = new int[5][];
        int[][] arr = {
                {1, 2, 3, 4, 6},
                {5, 6, 7, 8},
                {10, 20, 30, 40},

        };
        int[] id = {1, 2, 3, 4, 5};

        System.out.println("arr2D " + (arr[2][3]));

        for (int row = 0; row < arr.length; row++) {
            System.out.println("-----row-----" + row);
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("col " + col);
                System.out.println(arr[row][col]);
            }
        }


    }
}
