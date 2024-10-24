
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
        
        System.out.println("Welcome to the Parking Ticket Machine the current price rate is:");
        System.out.println("5000 rupiah/hour");
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
    
    public void issueTicket() {
        if(balance < 5000){
            System.out.println("You don't have enough money, please insert atleast " + (5000 - balance) + " more rupiah.");
        } else {
            int ticketCount = 0;
            while(balance >= 5000) {
                ticketCount += 1;
                balance -= 5000;
                ticketTime += 1;
            }
            
            System.out.println("You have bought " + 5000*ticketCount + " rupiahs worth of ticket, your current balance is " + balance + " rupiahs.");
        }
    }
    
    public int getTimePurchased() {
        return ticketTime;
    }
}
