package Adapter.V1;

public interface BankAPI {
    int checkBalance();
    boolean transfer(int amt , int to);
}

// common which PhonePe