package com.company;

public class Person {

    String WorkerName;
    String WorkerID;
    int WorkerAge = 0;
    int WorkerExp = 0;
    int Salary = 0;
    int Bonus = 0;
    String WorkerPro;
    int PaymentSum = 0;

    public void GetWorkerName(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter worker name: ");
        this.WorkerName = scanner.nextLine();

    }

    public void GetWorkerID(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter worker ID 9 numbers : ");
        this.WorkerID = scanner.nextLine();

        if(this.WorkerID.length() != 9){
            System.out.println("ID not allowed");
            return;
        }

    }

    public void GetWorkerAge(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter worker age between 15 and 68 years");
        this.WorkerAge = scanner.nextInt();

        if(this.WorkerAge < 15 || this.WorkerAge > 68){
            System.out.println("Age not allowed");
            return;
        }
    }

    public void GetWorkerExperience(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter worker Experience in years");
        this.WorkerExp = scanner.nextInt();

    }

    public void CalculateWorkerBonus(){

        if(this.WorkerExp < 10){
            this.Bonus = 10;
        }else{
            this.Bonus = 50;
        }

    }

    public void GetWorkerProfessional(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter worker Professional : ");
        this.WorkerPro = scanner.nextLine();

    }

    public int CalcWorkerSalary(){

        switch(this.WorkerPro){

            case "worker":
                this.Salary = 5000;
                break;
            case "engineer":
                this.Salary = 12000;
                break;
            case "manager ":
                this.Salary = 15000;
                break;
            case "seller ":
                this.Salary = 10000;
                break;
            case "technic":
                this.Salary = 8000;
                break;
            default:
                this.Salary = 0;
        }

        this.PaymentSum = this.Salary + (this.Salary / 100 * this.Bonus);

        return this.PaymentSum;
    }

}
