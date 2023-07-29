class SavingsAccountTest
{
    public static void main(String[] args){
        SavingsAccount ob1 = new SavingsAccount(2000);
        SavingsAccount ob2 = new SavingsAccount(3000);
        ob1.modifyInterestRate(.04);
        ob1.calculateMonthlyInterest();
        ob2.modifyInterestRate(.04);
        ob2.calculateMonthlyInterest();
        ob1.modifyInterestRate(.05);
        ob1.calculateMonthlyInterest();
        ob2.modifyInterestRate(.05);
        ob2.calculateMonthlyInterest();
    }
}
