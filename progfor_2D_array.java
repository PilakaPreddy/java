//Program for a 2D array
package final_practiceexamcodes;
import java.util.Scanner;
public class progfor_2D_array {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a[][]=new int[3][3];
    int i,j;
    System.out.println("Enter values into 2d array of 3 x 3");
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
       a[i][j]=s.nextInt();
    
    System.out.println("Array values are\n");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
         System.out.print(a[i][j]+"\t");
        System.out.println();  
      }
  }
}