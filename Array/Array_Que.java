package Array;
class Que {
    void middle(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int diagonalsum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
        }
        return total;
    }

    public int[] findTopTwoScores(int[] array) {
        int max = Integer.MIN_VALUE, min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                min = max;
                max = array[i];
            } else if (array[i] > min && array[i] != max) {
                min = array[i];
            }
        }
        return new int[]{max, min};
    }
}

public class Array_Que {
    public static void main(String[] args) {
        int exa[] = {0, 1, 2, 3, 4};
        int two[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Que a = new Que();
        a.middle(exa);
        int[] topTwo = a.findTopTwoScores(exa);
        System.out.println("\nTop two scores: " + topTwo[0] + " and " + topTwo[1]);
        System.out.println("Diagonal sum: " + a.diagonalsum(two));
    }
}
