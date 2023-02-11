public interface Bank {

    int getBalance();

    String depositMoney(int amount);

    String withdrawMoney(int amount , String enteredPassword);

    double rateOfIntrest(int time);
}
