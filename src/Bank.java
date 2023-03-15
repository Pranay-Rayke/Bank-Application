public interface Bank {

    int getBalance();

    String depositMoney(int amount);

    String withdrawMoney(int amount , String enteredPassword);

    public String changePassword(String oldPassword,String newPassword);

    double rateOfIntrest(int time);
}
