import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data= new HashMap<Integer,Integer>();

    public void geLogin()throws IOException{
        int x =1;
        do{
            try{
                data.put(9572, 1919);
                System.out.println("Welcome to the ATM !");
                System.out.println("Enter your customer number:");
                setCustNo(sc.nextInt());

                System.out.println("Enter your PIN Number: ");
                setmPin(sc.nextInt());


            }
            catch(Exception e){System.out.println("Invalid Characters!");
            x=2;
        }

        int cn= getCustNo();
        int pn = getmPin();

        if(data.containsKey(cn)&& data.get(cn)==pn){
            getAccountType();
        }else{System.out.println("Wrong Customer number");}

        }while(x==1);
    }

    public void getAccountType(){
        System.out.println("select the account you want to accsess: ");
        System.out.println("1. checking accoount");
        System.out.println("2. Savings account");
        System.out.println("3. Exit");

        int sel= sc.nextInt();
        switch(sel){
            case 1:
            getChecking();
            break;
            case 2:
            getSaving();
            break;
            case 3:
            System.out.println("Bye!");
            break;
            default:
            System.out.println("select correct options");
            getAccountType();
        }
    }

    public void getChecking(){
        System.out.println("Checking account: ");
        System.out.println("1. View  Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");

        int sel= sc.nextInt();
        switch(sel){
            case 1:
            System.out.println("Current Balance is"+ moneyFormat.format(getCheckingBalance()));
            getAccountType();
            break;
            case 2:
            getCheckingWithdrawInput();
            break;
            case 3:
            getCheckingDepositInput();
            break;
            case 4:
            System.out.println("bye!");
            getAccountType();
            break;
            default:
            System.out.println("Enter correct options!");
        }
    }

    public void getSaving(){
        System.out.println("Saving account: ");
        System.out.println("1. View  Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");

        int sel= sc.nextInt();
        switch(sel){
            case 1:
            System.out.println("Current Balance is"+ moneyFormat.format(getSavingBalance()));
            getAccountType();
            break;
            case 2:
            getSavingWithdrawInput();
            break;
            case 3:
            getSavingDepositInput();
            break;
            case 4:
            System.out.println("bye!");
            getAccountType();
            break;
            default:
            System.out.println("Enter Correct choice!");
        }
    }
} 
