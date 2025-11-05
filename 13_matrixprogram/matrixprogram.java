// this is customize matrix program any type matrix like 2x2 and 3x3 etc

import java.util.*;
public class matrixprogram{
    public static void main(String[] args){
      Scanner r = new Scanner(System.in);
      try{
    // first matrix input logic
      int row1,col1;
      System.out.println("enter the row of first matrix");
      row1 = r.nextInt();

      System.out.println("enter the column of first matrix");
      col1 = r.nextInt();
      
      int[][] a = new int[row1][col1];
     // enter the value in  first matrix
     System.out.println("Enter the value of first matrix");
     for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
          a[i][j] = r.nextInt();    
     }

     }

    //  print the first matrix
     System.out.println("Print the value of first matrix");

     for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
          System.out.print(a[i][j] + " ");    
     }
          System.out.println();    
     }


    //  second matrix input logic
    System.out.println("**************************");
        int row2,col2;
      System.out.println("enter the row of second matrix");
      row2 = r.nextInt();

      System.out.println("enter the column of second matrix");
      col2 = r.nextInt();
      
      int[][] b = new int[row2][col2];
     // enter the value in  second matrix
     System.out.println("Enter the value of second matrix");
     for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
          b[i][j] = r.nextInt();    
     }

     }

    //  print the second matrix
     System.out.println("Print the value of second matrix");

     for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
          System.out.print(b[i][j] + " ");    
     }
          System.out.println();    
     }
    

    // multiplication of two matrix logic
    int[][] c = new int[row1][col2];
    System.out.println("multiplication of two matrix");
      for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
              c[i][j] = 0;
            //   k<col1 ya k<row2 because col1 == row2 jabhi multiplication possible hai
              for(int k=0; k<col1; k++){
                c[i][j] += a[i][k] * b[k][j];
              }
     }

     }

    //  print the multiplication matrix
    System.out.println("mutrix multiplication is");
     for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
          System.out.print(c[i][j] + " ");    
     }
          System.out.println();    
     }
      }catch(Exception e){
        System.out.println("matrix not found");
      }


    }
}