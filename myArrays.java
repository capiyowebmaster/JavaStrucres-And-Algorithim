import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class myArrays {
    public  static  void printAll( int [] array){

        for (int i=0;i<array.length;i++){
            System.out.println( array[i] +"   is the value at position: "+ i);
        }
    }
    public  static  void sumAll(int [] array2){
        int sum=0;
        int i=0;
        // iterate over the array and everytime returns the value at each index
        while (i<array2.length){
            sum +=array2[i];
            i++;
        }
        System.out.println("The total sum of all arrays is: " +sum );


    }
    static int binarySearch(int[] array) {
        System.out.println("Please enter the number to be searched");
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();

        int lowestPossibleLoc = 0;
        int highestPossibleLoc = array.length - 1;
        while (highestPossibleLoc >= lowestPossibleLoc) {
            int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
            if (array[middle] == N) {
// N has been found at this index!
                System.out.println("The number was found at index: "+middle);
                break;
            }
            else if (array[middle] > N) {
// eliminate locations >= middle
                highestPossibleLoc = middle - 1;
            }
            else {
// eliminate locations <= middle
                lowestPossibleLoc = middle + 1;
            }
        }
// At this point, highestPossibleLoc < LowestPossibleLoc,
// which means that N is known to be not in the array. Return
// a -1 to indicate that N could not be found in the array.
        return -1;
    }

    public  static  void printLargest(int [] array4){
        int max =array4[0];
        int i=0;
        while (i<array4.length){
            if (array4[i]>max){
                max=array4[i];
            }
            i++;


        }
        System.out.println("The largest number is: " +max);

    }
    public  static  void printSmallest(int [] array4){
        int min =array4[0];
        int i=0;
        while (i<array4.length){
            if (array4[i]<min){
                min=array4[i];
            }
            i++;


        }
        System.out.println("The largest number is: " +min);

    }
    public  static  void lookForNumber(int [] array4){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please print number to be searched");
        int number=scanner.nextInt();
        int i=0;
        while (i<array4.length){
            if (array4[i]==number){
                System.out.println("That number exist at position: " + i );
            }
            else {
                System.out.println("That number does not exist here plz");
            }
            i++;


        }


    }
    public  static  void printAllEach(int [] arra5){
        for (int item: arra5 ) {
            System.out.println(item);
            
        }
        
    }
    public  static  void addPositive(int[] array6){
        int sum=0;
        for (int item: array6) {
            if (item>0){
                sum= sum+item;

            }


        }
        System.out.println("The total sum is: " +sum);

    }
    public  static  void findlargest(int [] array8){
        int largest=0;
        for (int item:array8) {
            if (item<largest);
            largest=item;

        }
        System.out.println("the largest is: "+largest);
    }
    public static void dynamicArray() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] numbers; // An array for storing the input values.
        int numCount; // The number of numbers saved in the array.
        int num; // One of the numbers input by the user.
         // Space for 100 ints.
        numCount = 0; // No numbers have been saved yet.
        System.out.println("Enter up to 100 positive integers; enter 0 to end.");
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String str= reader.readLine();
        String [] input ;
        input =str.split("  ");
        num=scanner.nextInt();
        numbers=new int[10];
       while (true) { // Get the numbers and put them in the array.



           // num= scanner.nextInt();
            if (num <= 0) {
                break;

            }
            else {
                numCount++;
                numbers[numCount] = Integer.parseInt(input[numCount]);


            }

        }


        for (int i = 0; i<num; i++) {
            numbers[i]=Integer.parseInt(input[i]);


        }




        System.out.println("\nYour numbers in reverse order are:\n");
        for (int i = numCount - 1; i >= 0; i--) {
            System.out.print("{"+" " +numbers[i]+" " +"}");
        }
        reader.close();


    }




    public static  void main(String[] args) throws IOException {
        int [] array1= {29,400,50,100,62,70,100,300};
        //printAll(array1);
        //sumAll(array1);
        //addPositive(array1);
       // printLargest(array1);
        //printSmallest(array1);
       // lookForNumber(array1);
        //printAllEach(array1);
        //findlargest(array1);
       // binarySearch(array1);
        dynamicArray();
    }
}

