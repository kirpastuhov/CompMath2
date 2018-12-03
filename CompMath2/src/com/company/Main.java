package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        while (true)
        {
            System.out.print("\nChoose function\n\n\t1 - x \n\t2 - sin(x)\n\t3 - cos(x)\n\t4 - (x)^2\n\tOther symbol == exit\n\n>>>  ");

            try
            {
                Scanner in = new Scanner(System.in);
                int choice = in.nextInt();

                SimpsonMethod sm = new SimpsonMethod();

                if (choice == 1)
                {
                    System.out.print("Input top: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input top: ");
                        in.next();
                    }
                    double top = in.nextDouble();

                    System.out.print("Input bottom: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input bottom: ");
                        in.next();
                    }
                    double bottom = in.nextDouble();

                    System.out.print("Input parts: ");
                    while (!in.hasNextInt())
                    {
                        System.out.print("Input parts: ");
                        in.next();
                    }
                    int parts = in.nextInt();

                    System.out.print("Input accuracy: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input accuracy: ");
                        in.next();
                    }
                    double accuracy = in.nextDouble();
                    System.out.print("Result = ");
                    System.out.print(sm.xFunc(top, bottom, parts));
                    System.out.print("\n  ∆    = ");
                    System.out.print(sm.xRungeErr(top,bottom,accuracy,parts));

                    continue;
                }
                if (choice == 2)
                {
                    System.out.print("Input top: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input top: ");
                        in.next();
                    }
                    double top = in.nextDouble();

                    System.out.print("Input bottom: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input bottom: ");
                        in.next();
                    }
                    double bottom = in.nextDouble();

                    System.out.print("Input parts: ");
                    while (!in.hasNextInt())
                    {
                        System.out.print("Input parts: ");
                        in.next();
                    }
                    int parts = in.nextInt();

                    System.out.print("Input accuracy: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input accuracy: ");
                        in.next();
                    }
                    double accuracy = in.nextDouble();


                    if(bottom > top){
                        System.out.println("Bottom limit must smaller than top limit");

                    }
                    if(parts % 2 != 0 || parts <= 0){
                        System.out.println("Number of part must be even and > 0");
                        }

                    System.out.print("Result = ");
                    System.out.print(sm.sinFunc(top, bottom, parts));
                    System.out.print("\n  ∆    = ");
                    System.out.print(sm.sinRungeErr(top,bottom,accuracy,parts));
                }

                if (choice == 3)
                {
                    System.out.print("Input top: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input top: ");
                        in.next();
                    }
                    double top = in.nextDouble();

                    System.out.print("Input bottom: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input bottom: ");
                        in.next();
                    }
                    double bottom = in.nextDouble();

                    System.out.print("Input parts: ");
                    while (!in.hasNextInt())
                    {
                        System.out.print("Input parts: ");
                        in.next();
                    }
                    int parts = in.nextInt();

                    System.out.print("Input accuracy: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input accuracy: ");
                        in.next();
                    }
                    double accuracy = in.nextDouble();


                    if(bottom > top){
                        System.out.println("Bottom limit must smaller than top limit");
                        break;
                    }
                    if(parts % 2 != 0 || parts <= 0){
                        System.out.println("Number of part must be even and > 0");
                        break;
                    }

                    System.out.print("Result = ");
                    System.out.print(sm.cosFunc(top, bottom, parts));
                    System.out.print("\n  ∆    = ");
                    System.out.print(sm.cosRungeErr(top,bottom,accuracy,parts));
                }


                if (choice == 4)
                {
                    System.out.print("Input top: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input top: ");
                        in.next();
                    }
                    double top = in.nextDouble();

                    System.out.print("Input bottom: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input bottom: ");
                        in.next();
                    }
                    double bottom = in.nextDouble();

                    System.out.print("Input parts: ");
                    while (!in.hasNextInt())
                    {
                        System.out.print("Input parts: ");
                        in.next();
                    }
                    int parts = in.nextInt();

                    System.out.print("Input accuracy: ");
                    while (!in.hasNextDouble())
                    {
                        System.out.print("Input accuracy: ");
                        in.next();
                    }
                    double accuracy = in.nextDouble();


                    if(bottom > top){
                        System.out.println("Bottom limit must smaller than top limit");
                        break;
                    }
                    if(parts % 2 != 0 || parts <= 0){
                        System.out.println("Number of part must be even and > 0");
                        break;
                    }

                    System.out.print("Result = ");
                    System.out.print(sm.powerXFunc(top, bottom, parts));
                    System.out.print("\n  ∆    = ");
                    System.out.print(sm.powerXRungeErr(top,bottom,accuracy,parts));
                }

            } catch (Exception e)
            {
                System.exit(0);
            }
        }
    }
}