package Adapter.V0;

public class PhonePeLoan {
    int checkEligibility(int amt , YesBankAPI yesBankAPI){
//        20 % of the loan amount
        int balance = yesBankAPI.getBalance();
        if(amt < balance *  0.2){
            return 1;
        }

        System.out.println("Not eligible to avail Loan");
        return 0;
    }


}
