public class Day11WhileLoop01 {
    public static void main(String[] args) {
        //Type code to print the integers divisible by 4 and 6 from 13 to 211
        //1st Way: By using for-loop

        for(int i =13; i<212;i++){
            if(i%4==0 && i%6==0){
              System.out.print(i+" ");
            }
        }
        System.out.println("\n=================================");
        //2.Way: By using while-loop
        int i =13;
        while(i<212){
            if(i%4==0 && i%6==0){
            System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        //Type code to print integers from 3 to 5 by using while loop
        int j=3;
        while(j<6){

            System.out.print(j+" ");
           j++;
        }


    }
}
