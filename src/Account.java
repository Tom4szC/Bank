public abstract class Account {
    private String customerName;
    private String customerSurname;
    private String accountNumber;
    int amount;


    public void Deposit(int depositAmount) {
        amount = amount + depositAmount;
    }

    public void Withdraw(int withdrawalAmount) {
        amount = amount - withdrawalAmount;
    }

    public void Bonus(){
        amount = amount + 100;
    }

}