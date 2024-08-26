package Adapter.V0;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.availLoan(100);
        phonePe.rechargeFastTag(50);
    }
}
