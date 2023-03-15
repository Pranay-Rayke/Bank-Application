import java.util.Objects;
import java.util.UUID;

public class SBI implements Bank {

    private String Name;
    private String AcoountNo;
    private int Balance;
    private String Password;
    private double BankrateOfIntrest;

    public SBI(String name, int balance, String password) {
        Name = name;
        Balance = balance;
        Password = password;

        AcoountNo = String.valueOf(UUID.randomUUID());

        BankrateOfIntrest = 6.6;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAcoountNo() {
        return AcoountNo;
    }

    public void setAcoountNo(String acoountNo) {
        AcoountNo = acoountNo;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getRateOfIntrest(int t) {
        return BankrateOfIntrest;
    }

    public void setRateOfIntrest(double BankrateOfIntrest) {
        this.BankrateOfIntrest = BankrateOfIntrest;
    }

    @Override
    public int getBalance() {
        return this.Balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.Balance += amount;
        return "Money deposited successfully : "+amount;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword, this.Password))
        {
            if(this.Balance < amount)
            {
                return "Insufficient Balance";
            }
            else {
                this.Balance -= amount;
                return "Money withdraw successfully : "+amount;
            }
        }
        return "Invalid Credential";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(oldPassword.equals(this.Password))
        {
            this.Password = newPassword;
            return "Password set successfully";
        }
        return "Wrong password";
    }


    @Override
    public double rateOfIntrest(int time) {
        return (this.Balance * BankrateOfIntrest * time)/100;
    }
}
