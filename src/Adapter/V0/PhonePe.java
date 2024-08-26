package Adapter.V0;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private YesBankAPI yesBankAPI;
    private PhonePeLoan phonePeLoan;

    PhonePe(){
        fastTagRecharge = new FastTagRecharge();
        yesBankAPI = new YesBankAPI();
        phonePeLoan = new PhonePeLoan();
    }

    boolean availLoan(int amt){
        int response =  phonePeLoan.checkEligibility(amt , yesBankAPI);
        if(response == 0){
            return false;
        }
        System.out.println("Loan successful");
        return true;
    }

    boolean rechargeFastTag(int x){
        int response = fastTagRecharge.recharge(x , yesBankAPI);
        if(response == 1){
            System.out.println("Fast Tag successfully recharged");
            return true;
        }
        return false;
    }
}
