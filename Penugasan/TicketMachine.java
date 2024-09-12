/**
 * A simple demo on a Ticket Machine.
 */

public class TicketMachine
{
    private int price;
    private int balance;
    private int total;
    
    public TicketMachine(int TicketCost)
    {
        if(TicketCost > 0)
            price = TicketCost;
        else
            price = 0;
        
        balance = 0;
        total = 0;
    }

    public int GetBalance()
    {
        return balance;
    }
    
    public int GetPrice()
    {
        return price;
    }
    
    public void InsertMoney (int amount) 
    {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Amount invalid.");
    }
    
    public void PrintTicket() 
    {
        if(balance>=price)
        {
            System.out.println("Ticket Out");
            System.out.println("BlueJ Line Ticket " + price + " cents");
            
            total += price;
            balance -= price;
        }
        else
            System.out.println("Gimme atleast " + (price - balance) + "more cents.");
    }
}
