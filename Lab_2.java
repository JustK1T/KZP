import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class kk {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Print a side length of a square: ");
        int sideLength = scanner.nextInt();
        scanner.nextLine();

        //Array initialization
        char[][] arr = new char[sideLength][];
        for(int i=1 ; i <= sideLength/2; i++ )
        {
            arr[i-1]=new char[i];
            arr[i-1+(sideLength/2)]= new char[i];
        }

        if(arr.length % 2 == 1)
            arr[arr.length - 1] = new char[sideLength / 2 + 1];


        System.out.print("Print a filler symbol: ");
        String symbol = scanner.next();

        //Fill in array by algorithm with picture
        for (int i = 0; i < sideLength; ++i)
            Arrays.fill(arr[i], symbol.charAt(0));

        //Print data in console
        for(int i=0; i< sideLength; i++)
        {
            if(i>=sideLength/2)
            {
                System.out.print(String.format("%0" + sideLength/2 + "d", 0).replace('0', ' '));
            }
            System.out.println( String.copyValueOf(arr[i]));

        }

        //Print data in file
        try(FileWriter fileWriter = new FileWriter("Result.txt")) {
            for(int i=0; i< sideLength; i++)
            {
                if(i>=sideLength/2)
                {
                    fileWriter.write(String.format("%0" + sideLength/2 + "d", 0).replace('0', ' '));
                }
                fileWriter.write( String.copyValueOf(arr[i]));
            }
            System.out.println("The data was successfully saved in file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
