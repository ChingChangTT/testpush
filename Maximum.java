package Review;

import java.util.Scanner;

//First way
//public class Maximum {
//    public static void main(String[] args) {
//        String[] txt={"Fisrt number :","Second number :","Third number :"};
//        int[] num=new int[3];
//        for (int i=0;i<txt.length;i++){
//            System.out.print("Input "+txt[i]);
//             num[i]=new Scanner(System.in).nextInt();
//        }
//        if ((num[0]<num[1])&&(num[2]<num[1])){
//            System.out.println("The Maxitmum number is "+txt[1]+num[1]);
//        }
//        else if((num[0]>num[1])&&(num[0]>num[2])){
//            System.out.println("Maximum nuber is "+txt[0]+num[0]);
//        }
//        else {
//            System.out.println("Maximum number is "+txt[2]+num[2]);
//        }
//    }
//}
//second way
//import java.util.Scanner;
//class Maximum{
//    public static void main(String[] args){
//        System.out.print("Input first number :");
//        int num1=new Scanner(System.in).nextInt();
//        System.out.print("Input Second number :");
//        int num2=new Scanner(System.in).nextInt();
//        System.out.print("Input Third number :");
//        int num3=new Scanner(System.in).nextInt();
//        if((num1>num2)&&(num1>num3)){
//            System.out.println("Maximum is "+num1);
//        }
//        else if((num2>num1)&&(num2>num3)){
//            System.out.println("Maximum is "+num2);
//        }
//        else{
//            System.out.println("Maximum is "+num3);
//        }
//    }
//}
//Third way
//import java.util.Scanner;
//
//public class Maximum {
//    public static void main(String[] args) {
//        String[] txt = {"First number: ", "Second number: ", "Third number: "};
//        int[] num = new int[3]; // Array to store three numbers
//
//        Scanner = new Scanner(System.in); // Scanner object for user input
//
//        for (int i = 0; i < txt.length; i++) {
//            System.out.print("Input " + txt[i]);
//            num[i] = scanner.nextInt(); // Take input and store in the array
//        }
//
//
//        int max = num[0]; // Assume the first number is the maximum
//
//        for (int i = 1; i < num.length; i++) {
//            max = Math.max(max, num[i]); // Use Math.max() to find maximum
//        }
//
//        System.out.println("The maximum number is: " + max);
//
//        scanner.close(); // Close the scanner to release resources
//    }
//}
class Maximum{
    public static void main(String[] args) {
        System.out.print("Input first number :");
        int num1=new Scanner(System.in).nextInt();
        System.out.print("Input Second number :");
        int num2=new Scanner(System.in).nextInt();
        System.out.print("Input Third number :");
        int num3=new Scanner(System.in).nextInt();
        System.out.print("Input Forth number :");
        int num4=new Scanner(System.in).nextInt();
        if(num1>num2){
            if(num1>num3){
                if(num1>num4){
                    System.out.println("Maximum is "+num4);
                }
                else {
                    System.out.println("Maximum is "+num1);
                }
            }
            else {
                if(num3>num4){
                    System.out.println("Maximum is "+num3);
                }
                else {
                    System.out.println("Maximum is "+num4);
                }
            }
        }
        else {
            if(num2>num3){

                    if(num2>num4){
                        System.out.println("Maximum is "+num2);
                    }
                    else {
                        System.out.println("Maximum is "+num4);
                    }


            }
            else {

                    if(num3>num4){
                        System.out.println("Maximum is "+num3);
                    }
                    else {
                        System.out.println("Maximum is "+num4);
                    }

            }
        }
    }
}

