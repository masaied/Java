package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("FOR Loop:");
        Loop_1();
        System.out.println("\n NESTED Loop:");
        Loop_2();
        System.out.println("\n Do-While Loop:");
        Loop_3();

        System.out.println("If else statement output:");
        fun1();
        System.out.println("\n If else if statement output:");
        fun2();
        System.out.println("\n switch statement output:");
        fun3();
    }

    public static void Loop_1() {
        //Code of Java for loop
        for(int i=1;i<=10;i++){
            System.out.println("This is First loop Result is:"+i);
        }
    }

    //Nested Loops
    public static void Loop_2() {
        //loop of i
        for(int i=1;i<=3;i++){
            //loop of j
            for(int j=1;j<=3;j++){
                System.out.println("This is outer loop Value: "+i);
                System.out.println("This is Inner loop Value: "+i);
                System.out.println(i+" "+j);
            }//end of i
        }//end of j
    }

    //Do-While Loop
    public static void Loop_3() {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }

    public static void fun1() {
        int number = 10;

        // checks if number is less than 0
        if (number < 0) {
            System.out.println("Statement within the if block");
        } else
            System.out.println("Statement outside if block");
    }

    //if else if statement
    public static void fun2()
    {
        int number = 10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // execute this block if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");
    }

    //switch statement
    public static void fun3()
    {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}


