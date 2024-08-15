class array {

    int arr [];
    public array (int size ){
         arr = new int[size];
        for (int i = 0; i<arr.length ;i++){
            arr[i]= Integer.MIN_VALUE;
        }
    }

    public void insert (int idx , int data ){
        try{
            if (arr[idx]==Integer.MIN_VALUE){
                arr[idx]=data ;
                //System.err.println("sucessfully inserted ");
            } else {
                //System.out.println("overriding the second value to the first value  ");
                for (int i = arr.length ; i > arr[idx] ; i++ ){
                    arr[i] =arr[i-1];
                } arr[idx] = data ;
            }
        }catch(ArrayIndexOutOfBoundsException e){
           // System.out.println(e.getMessage());
        }
    }

    public void delete (int idx){
        if (idx > arr.length){
            System.out.println("please  enter valid index");
        } else {
            for ( int i = idx ; i <arr.length-1 ; i++){
                arr[i]=arr[i+1];
            }
        }
        
    }

    void display (){
        for (int i =0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }


    void search (int search_value){
        for (int i =0 ; i<arr.length ; i++){
            if (arr[i] == search_value){
                System.out.println("value found");
                return;
            }
        } System.out.println("given value is not present");
    }


}

public class Array_operations {
    public static void main(String[] args) {
        array a1 =new array(2);
        a1.insert(0,11);
       a1.insert (1,12);
       a1.insert(1,13);
       a1.display();
       a1.search(13 );
       a1.delete(1);
       a1.display();
    }
}
