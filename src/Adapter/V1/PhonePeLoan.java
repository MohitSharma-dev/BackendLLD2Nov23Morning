package Adapter.V1;

public class PhonePeLoan {
    int checkEligibility(int amt , BankAPI bankAPI){
//        20 % of the loan amount
        int balance = bankAPI.checkBalance();
        if(amt < balance *  0.2){
            return 1;
        }

        System.out.println("Not eligible to avail Loan");
        return 0;
    }


}
