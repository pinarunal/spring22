package day28;

public class E02 {

    public static void main(String[] args) {

        String[] arr={"A","B","C"};

        getElementsFromArray(arr,1);//B
        getElementsFromArray(arr,0);//A
        getElementsFromArray(arr,5);//ArrayIndexOutOfBoundsException
        System.out.println("Hello");


    }

    public static void getElementsFromArray(String[] arr, int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){

            System.err.println(e.getMessage()+" ==> Non-existing index was used");

        }

    }
}
