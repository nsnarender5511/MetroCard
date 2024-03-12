public class MetroCard {
    String cardNo;
    int balance;

    public MetroCard(String cardNo, int balance) {
        this.cardNo = cardNo;
        this.balance = balance;
    }


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
