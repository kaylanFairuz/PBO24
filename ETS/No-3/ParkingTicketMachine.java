/**
 * ParkingTicketMachine adalah sebuah kelas yang
 * mensimulasikan mesin tiket parkir
 */
public class ParkingTicketMachine
{
    private int balance;
    private int ticketPrice;
    private int ticketTime;

    /**
     * Konstruktor objek kelas ParkingTicketMachine
     */
    public ParkingTicketMachine()
    {
        balance = 0;
        ticketPrice = 5000;
        ticketTime = 0;
        
        
    }

    public void insertMoney(int amount)
    {
        if(amount < 0) {
            System.out.println("Invalid amount, please try a positive amount.");        
        } else {
            balance += amount;
            System.out.println("Successfully added " + amount + " rupiah.");
        }
    }
    
    public int getTimePurchased() {
        return ticketTime;
    }
    
    public void issueTicket() {
        if(balance < 5000){
            System.out.println("You don't have enough money, please insert atleast " + (5000 - balance) + " more rupiah.");
        } else {
            while(balance >= 5000) {
                balance -= 5000;
                ticketTime += 1;
            }
            
            System.out.println("You have bought " + getTimePurchased() + " rupiahs worth of ticket, your current balance is " + balance + " rupiahs.");
        }
    }
    
    
    
    /**
     * Helper function
     */
    public int getBalance() {
        return balance;
    }
    
    public int getTicketPrice() {
        return ticketPrice;
    }
}
