package Adapter.V1;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName =  scanner.nextLine();
        BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.availLoan(100);
        phonePe.rechargeFastTag(50);
    }
}
