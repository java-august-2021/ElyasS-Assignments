import java.util.Random;

public class BankAccount{
    private String  accountNumber;
    private double checkingsBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalMoney;

    public BankAccount(){
        this.accountNumber=this.randAccountNumber();
        this.checkingsBalance = 0;
        this.savingsBalance=0;
        numberOfAccounts++;
    }
    private String randAccountNumber(){
        String acocuntNumebr = "";
        Random r = new Random();

        for (int i=0; i<10; i++){
            accountNumber = accountNumber.concat(String.valueOf(r.nextInt(10)));
        }
        return accountNumber;

    }

    public void depositMoney(double amount, String accountType){
        if(accountType.equals("checking")){
            this.setcheckingBalance(this.getCheckingsBalance()+ amount);
            totalMoney += amount;

        }else if (accountType.equals("saving")){

            this.setSavingsBalance(this.getSavingsBalance()+amount);

        } else {
            System.out.println("not valide account");
            return;
        }

        totalMoney += amount;
    }

    
    public void withdrawMoney(double amount, String accountType){
        if(accountType.equals("checking")){

            if (this.getCheckingsBalance() -amount < 0){
                System.out.println("not enough money");
            } else{
            this.setcheckingBalance(this.getCheckingsBalance()- amount);
            totalMoney -= amount;
            }
   

        }else if (accountType.equals("saving")){
            if(this.getSavingsBalance() -amount <0){
                System.out.println("not enough money");
            } else{
            this.setSavingsBalance(this.getSavingsBalance()-amount);
            totalMoney -= amount;
            }


        } else {
            System.out.println("not valide account");
            return;
        }

    }

    public String getAccountTotal(){
        return "total money is: "+ (this.getCheckingsBalance() +this.getSavingsBalance()); 
    }

    public double getCheckingsBalance(){
        return this.checkingsBalance;
    }

    private void setcheckingBalance(double checkingsBalance){
        this.checkingsBalance = checkingsBalance;
    }

    public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

    public double getSavingsBalance() {
		return savingsBalance;
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}	



}