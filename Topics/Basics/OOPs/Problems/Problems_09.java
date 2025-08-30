package OOPs.Problems;

public class Problems_09 {
    public static void main(String[] args) {
        BankAccount B = new BankAccount(1000);
        B.ckeckBalance();


        B.deposit(500000);
        B.ckeckBalance();

        B.withdraw(10000);
        B.ckeckBalance();

    }
}

//Encapsulation
class BankAccount{
    private double balance ;

    //constructor
    BankAccount(double intialBalance){
        balance = intialBalance;
    }

    //deposit
    void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        }else {
            System.out.println("invalid deposit amount");
        }
    }

    //withdraw
    void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdraw : " + amount);
        }else {
            System.out.println("invalid withdraw amount");
        }
    }

    void ckeckBalance(){
        System.out.println("Available Balance is :"+ balance);
    }
}
