  
class Account (id:String,no:Int,bal:Double){
  val nic:String=id
  val accno:Int=no
  var balance: Double =bal

  val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0)
  var sum=(b:List[Account])=>b.reduce((a,b)=>(new Account("0",0,a.balance+b.balance)))
  var finalbalance=(b:List[Account])=>b.map(a=>{
    if(a.balance<0)(new Account(a.nic,a.accno,a.balance*1.1)) 
    else(new Account(a.nic,a.accno,a.balance*1.05))
  })

  override def toString ="\n[NIC no: "+nic+":Account No: "+accno +":Balance: "+ balance+"]"
};

object Bank{
 def main(args:Array[String])={

  val bank:List[Account]=List(
  new Account("982320585v",1234,100000),
  new Account("987131156v",5678,12000),
  new Account("981234545v",9101,-500)
  ) 
 println("Negative balance accounts: \n"+bank(0).overdraft(bank))
 println("\nSum of all account balances: " +(bank(0).sum(bank)).balance)
 println("\nFinal balance of all accounts: " +(bank(0).finalbalance(bank)))

 }
}
 