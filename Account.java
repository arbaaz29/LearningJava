import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner; 


public class Account {
    private int custNo;
    private int mPin;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner in= new Scanner(System.in);
    DecimalFormat mF= new DecimalFormat("'$'###,##0.00");
    public int getCustNo() {
        return custNo;
    }
    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
    public int getmPin() {
        return mPin;
    }
    public void setmPin(int mPin) {
        this.mPin = mPin;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }


    
   public double calcCheckingWithdraw(double amount){
    checkingBalance= checkingBalance-amount;
    return checkingBalance;
   }
   public double calcCheckDeposit(double amount){
    checkingBalance= checkingBalance+amount;
    return checkingBalance;
   }
   public double calcSavingWithdraw(double amount){
    savingBalance= savingBalance-amount;
    return savingBalance;
   }
   public double calcSavingDeposit(double amount){
    savingBalance= savingBalance+amount;
    return savingBalance;
   }

   public void getCheckingWithdrawInput(){
    System.out.println("Checking Account Balance:"+ mF.format(checkingBalance));
    System.out.println("Amount you want to withdraw from your checking account:");
    double amount= in.nextDouble();

    if((checkingBalance-amount)>=0){
        calcCheckingWithdraw(amount);
        System.out.println("New Checking balance is :"+ mF.format(checkingBalance));
    }
    else{System.out.println("Insufficient Balance!");}
   }

   public void getCheckingDepositInput(){
    System.out.println("Checking Account Balance:"+ mF.format(checkingBalance));
    System.out.println("Amount you want to deposit to your checking account:");
    double amount= in.nextDouble();

    if((checkingBalance+ amount)>=0){
        calcCheckDeposit(amount);
        System.out.println("New Checking balance is :"+ mF.format(checkingBalance));
    }
    else{System.out.println("Money not deposited!");}
   }

   public void getSavingWithdrawInput(){
    System.out.println("Checking Account Balance:"+ mF.format(savingBalance));
    System.out.println("Amount you want to withdraw from your Savings account:");
    double amount= in.nextDouble();

    if((savingBalance-amount)>=0){
        calcSavingWithdraw(amount);
        System.out.println("New Savings balance is :"+ mF.format(savingBalance));
    }
    else{System.out.println("Insufficient Balance!");}
   }

   public void getSavingDepositInput(){
    System.out.println("Checking Account Balance:"+ mF.format(savingBalance));
    System.out.println("Amount you want to withdraw from your Savings account:");
    double amount= in.nextDouble();

    if((savingBalance+amount)>=0){
        calcSavingDeposit(amount);
        System.out.println("New Savings balance is :"+ mF.format(savingBalance));
    }
    else{System.out.println("Money not deposited!");}
   }
}
