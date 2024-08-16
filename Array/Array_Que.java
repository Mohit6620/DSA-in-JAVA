
class Que {
    void middle (int [] arr){
        for (int i = 1 ; i <arr.length-1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    int diagonalsum (int [][] arr){
        int total = 0;
        for (int i = 0 ; i <  arr.length ; i++){
            for (int j = 0 ; j < arr.length ; j++){
                if (arr[i] == arr [j]){
                    total += arr[i][j];
                }
            }
        } return total;
    }
}

public class Array_Que {
    public static void main(String[] args) {
        int exa []= {0,1,2,3,4};
        int two [][] = {{1,2,3},{4,5,6},{7,8,9}};
        Que a = new Que();
        a.middle(exa);
        System.out.println(" ");
        System.out.println(a.diagonalsum(two));
    }
}