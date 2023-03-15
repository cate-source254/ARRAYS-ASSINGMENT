import java.util.Scanner;
public class CheckArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        {
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of elements you want to store: ");
            num=sc.nextInt();
            int[] array = new int[15];
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<num; i++)
            {

                array[i]=input.nextInt();
            }
            System.out.println("Array elements are: ");
//
            for (int i=0; i<num; i++)
            {
                System.out.println(array[i]);
            }
        }
    }


}

