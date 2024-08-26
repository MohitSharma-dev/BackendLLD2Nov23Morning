package Adapter.V1;

public class FastTagRecharge {
    int recharge(int amount, BankAPI bankAPI){
       int balance =  bankAPI.checkBalance();
       if(balance < amount){
           System.out.println("Can't recharge, not enough money");
           return 0;
       }
       return 1;
    }
}
