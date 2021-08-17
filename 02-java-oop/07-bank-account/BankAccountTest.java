public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.depositMoney(10, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //10
		myBankAccount.depositMoney(100, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //110
		System.out.println(BankAccount.getNumberOfAccounts()); //1
		System.out.println(BankAccount.getTotalMoney()); 
		myBankAccount.withdrawMoney(10000, "checking"); 
		myBankAccount.withdrawMoney(60, "saving");
		System.out.println(myBankAccount.getAccountTotal()); 



    }
    
}
