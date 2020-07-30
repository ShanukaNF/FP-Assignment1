  
object TransferMoney extends App{
  val acc1 = new Account("982320585v","1234","A.S.N Fernando",100000);
  val acc2 = new Account("987131156v","5678","K.A.S Malsha",12000);
  println("Initial Balances: \n");
  println(acc1);
  println(acc2);
  acc1.transferMoney(acc2,15000);
  println("Balances after Transfer: \n");
  println(acc1);
  println(acc2);
}

class Account(id:String, accNo:String, name:String, amount:Double){
  val nic = id;
  val accNum = accNo;
  val fullName = name;
  var balance = amount;

  def withdraw(amount: Double) = this.balance -= amount;
  def deposit(amount: Double) = this.balance += amount;
  def transferMoney(bankAccount: Account,amount:Double): Unit ={
    this.withdraw(amount);
    bankAccount.deposit(amount);
  }
  override def toString: String = "NIC: "+this.nic+"\nAccountNumber: "+this.accNum+"\nFull Name: "+this.fullName+"\nBalance: "+this.balance+"\n";
}