object TicketPrice extends App{
	def Attendees(a:Int):Int = 120 + (15 - a) / 5 * 20;
	def Revenue(a:Int):Int = Attendees(a) * a;
	def Cost(a:Int):Int = 500 + Attendees(a);
	def Profit(a:Int):Int = Revenue(a) - Cost(a);
	printf("Ticket Price -> 5, profit -> %d\n",Profit(5));
	printf("Ticket Price -> 10, profit -> %d\n",Profit(10));
	printf("Ticket Price -> 15, profit -> %d\n",Profit(15));
	printf("Ticket Price -> 20, profit -> %d\n",Profit(20));
	printf("Ticket Price -> 25, profit -> %d\n",Profit(25));
	printf("Ticket Price -> 30, profit -> %d\n",Profit(30));
	printf("Ticket Price -> 35, profit -> %d\n",Profit(35));
	printf("Ticket Price -> 40, profit -> %d",Profit(40));
}