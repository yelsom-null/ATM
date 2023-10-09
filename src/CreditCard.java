public class CreditCard {
    private long cardNumber;
    private String expirationDate;
    private int cvv;

    public CreditCard(long cardNumber, String expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}
