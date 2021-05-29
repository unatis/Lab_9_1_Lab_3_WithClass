package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person Worker = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter worker name : ");
        Worker.WorkerName = scanner.nextLine();

        System.out.print("Please enter worker ID 9 numbers : ");
        Worker.WorkerID = scanner.nextLine();

        if(Worker.WorkerID.length() != 9){
            System.out.print("ID not allowed " + Worker.WorkerID.length() + " numbers");
            return;
        }

        System.out.print("Please enter worker age between 15 and 68 years : ");
        Worker.WorkerAge = scanner.nextInt();

        if(Worker.WorkerAge < 15 || Worker.WorkerAge > 68){
            System.out.print("Worker age not allowed " + Worker.WorkerAge);
            return;
        }

        System.out.print("Please enter working experience years : ");
        Worker.WorkingExp = scanner.nextInt();

        if(Worker.WorkingExp < 10){
            Worker.Bonus = 10;
        }else{
            Worker.Bonus = 50;
        }

        scanner= new Scanner(System.in);

        System.out.print("Please enter worker profession : ");
        Worker.WorkerPro = scanner.nextLine();

        switch(Worker.WorkerPro){

            case "worker":
                Worker.Salary = 5000;
                break;
            case "engineer":
                Worker.Salary = 12000;
                break;
            case "manager ":
                Worker.Salary = 15000;
                break;
            case "seller ":
                Worker.Salary = 10000;
                break;
            case "technic":
                Worker.Salary = 8000;
                break;
            default:
                Worker.Salary = 0;
        }

        Worker.PaymentSum = Worker.Salary + (Worker.Salary / 100 * Worker.Bonus);

        System.out.print("Worker payment is : " + Worker.PaymentSum + "\n");

    }


}
