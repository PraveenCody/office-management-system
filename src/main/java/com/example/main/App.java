package com.example.main;

import java.util.List;
import java.util.Scanner;

import com.example.Model.Office;
import com.example.Service.AppSer;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        AppSer ser = new  AppSer();

        System.out.println( "Hello Welcome to the Office...!!!" );
        System.out.println("1. Add Employees");
        System.out.println("2. ALL Employee");
        System.out.println("3. Search Employee");
        System.out.println("4. Update Employee");
        System.out.println("5. Remove Emplyees");
        System.out.println("6. Exit");

        int loop=0;

        while(loop==0){

            System.out.println("Enter option :");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Id :");
                    int id = sc.nextInt();
                    System.out.println("Name :");
                    String name = sc.next();
                    System.out.println("Dept :");
                    String dept = sc.next();
                    Office off = new Office(id,name,dept);
                    if(ser.addEmp(off)){
                        System.out.println("Added!!!");
                    }
                    else{
                        System.out.println("Not Added");
                    }
                    break;

                case 2:
                    List<Office> ls = ser.allEmp();
                    for (Office of : ls) {
                        System.out.println("Id : "+of.getId()+" Name : "+of.getName()+" Position : "+of.getDept());
                    }
                    break;

                case 3:
                    id = sc.nextInt(); 
                    break;

                case 4:
                    id = sc.nextInt();
                    name = sc.next();
                    dept = sc.next();
                    break;

                case 5:
                    id = sc.nextInt();
                    break;

                case 6:
                    System.out.println("Bye...");
                    loop=10;
                    break;

                default:
                    System.out.println("Wrong Input");
            }
        }
        sc.close();
    }
}
