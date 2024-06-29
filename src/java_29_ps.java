import java.util.Scanner;
public class java_29_ps {
    public static void main(String[] args) {


//        question1

//        float [] arr = {12.3f,23.4f,45.6f,56.7f,78.9f};
//        float sum=0;
//        for (float i:arr){
//            sum+=i;
//        }
//        System.out.println(sum);



//        question2

//        float [] arr = {12.3f,23.4f,45.6f,56.7f,78.9f};
//        float num=12.3f;
//        boolean isInArray = false;
//        for (float i:arr){
//            if(num==i){
//                isInArray =true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("present");
//        }
//        else {
//            System.out.println("not present");
//        }



//        question3

//        float [] arr = {12.3f,23.4f,45.6f,56.7f,78.9f};
//        float sum=0;
//        for (float i:arr){
//            sum+=i;
//        }
//        System.out.println(sum);
//        System.out.println((sum/arr.length));



//        question4

//        int [][] mat1 = {{1,2,3},
//                         {4,5,6}};
//        int [][] mat2 = {{2,6,13},
//                         {3,7,1}};
//
//        int [][] result = {{0,0,0},{0,0,0}};
//
//        for (int i=0;i< mat1.length;i++){
//            for (int j=0;j<mat1[i].length;j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for (int i=0;i<mat1.length;i++){
//            for (int j=0;j<mat1[i].length;j++){
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }



//        question5

//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int temp;
//        int n = Math.floorDiv(l, 2);
//        for (int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//
//        for(int i:arr){
//            System.out.print(i+" ");
//        }



//        question6

//        int [] arr = {1,2,312,4,5};
//        int max=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);


//        question7
//        int [] arr = {1,2,3,4,-50000};
//        int min = Integer.MAX_VALUE;
//        for (int e:arr){
//            if (e<min){
//                min = e;
//            }
//        }
//        System.out.println(min);


//        question8
        int [] arr = {1,5,6,7,87,9};
        boolean isSorted = true;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
