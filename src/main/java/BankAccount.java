public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;
    private double interestRate;
    private String accountType;
    private int overdraft;

    public BankAccount(String firstName,String lastName, String dateOfBirth,int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.interestRate = 0;
        this.accountType = "";
        this.overdraft = 500;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }
    public void setAccountNumber(int newAccountNumber){
        this.accountNumber = newAccountNumber;
    }
//    I haven't added the setBalance since it would be criminal and cause inflation
//    public void setBalance(int newBalance){
//        this.balance = newBalance;
//    }

    public void deposit(int depositAmount){
        this.balance += depositAmount;
    }
    public String withdrawal(int withdrawalAmount){
        if (this.balance - withdrawalAmount >= - this.overdraft){
            this.balance -= withdrawalAmount;
            return "Withdrawal Successful!";
        } else {
            return "Cannot make Withdrawal. Insufficient Funds";
        }
    }

    public void payInterest(String account){
        if (account.equals("Saving")){
            this.interestRate = 1.06;
        } else if (account.equals("Current")){
            this.interestRate = 1.03;
        } else {
//            This option has no interest added
            this.interestRate = 1;
        }
        this.balance = this.balance * this.interestRate;
    }
}
