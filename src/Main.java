import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name, initialBalance, password");
        String name = sc.nextLine();
        int initialBalance = sc.nextInt();
        String password = sc.next();

        SBI pranay = new SBI(name, initialBalance, password);
        System.out.println("Your account has been created with account no : "+pranay.getAcoountNo());

        //getBalance
        System.out.println("Current Balance is : "+pranay.getBalance());

        //depositMoney
        System.out.println(pranay.depositMoney(500));
        System.out.println("Updated Balance : "+pranay.getBalance());

        //withdrawMoney
        System.out.println("Enter amount to be withdrawn : ");
        int amount = sc.nextInt();
        System.out.println("Enter password : ");
        String enterPassword = sc.next();

        System.out.println(pranay.withdrawMoney(amount, enterPassword));
        System.out.println("Updated Balance Is : "+pranay.getBalance());

        //rateOfIntrest
        System.out.println("Enter a time duration in years for calculate rateOfIntrest : ");
        int t = sc.nextInt();
        System.out.println("The rate of intrest for "+t+" years on currentBalance : "+pranay.getBalance()+" is "+pranay.rateOfIntrest(t));
    }
}