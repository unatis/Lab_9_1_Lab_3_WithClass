package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person Worker = new Person();
        Worker.GetWorkerName();
        Worker.GetWorkerID();
        Worker.GetWorkerAge();
        Worker.GetWorkerExperience();
        Worker.CalculateWorkerBonus();
        Worker.GetWorkerProfessional();
        int Sum = Worker.CalcWorkerSalary();

        System.out.println("Worker payment is " + Sum);

    }


}
