package Adapter.V1;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private BankAPI bankAPI;
    private PhonePeLoan phonePeLoan;

    PhonePe(BankAPI bankAPI){
        fastTagRecharge = new FastTagRecharge();
        this.bankAPI = bankAPI;
        phonePeLoan = new PhonePeLoan();
    }

    boolean availLoan(int amt){
        int response =  phonePeLoan.checkEligibility(amt , bankAPI);
        if(response == 0){
            return false;
        }
        System.out.println("Loan successful");
        return true;
    }

    boolean rechargeFastTag(int x){
        int response = fastTagRecharge.recharge(x , bankAPI);
        if(response == 1){
            System.out.println("Fast Tag successfully recharged");
            return true;
        }
        return false;
    }
}
