public class TicketMachine {

  // The price of a ticket from this machine.
  private int price;
  // The amount of money entered by a customer so far.
  private int balance;
  // The total amount of money collected by this machine.
  private int total;
  // The total amount of money collected by this machine.

  private int qtd;

  /**
   * Create a machine that issues tickets of the given price.
   * Note that the price must be greater than zero, and there
   * are no checks to ensure this.
   */
  public TicketMachine(int ticketCost) {
    price = ticketCost;
    balance = 0;
    total = 0;
  }

  /**
   * Return the price of a ticket.
   */
  public int getPrice() {
    return price;
  }

  /**
   * Return the amount of money already inserted for the
   * next ticket.
   */
  public int getBalance() {
    return balance;
  }

  /**
   * Receive an amount of money in cents from a customer.
   */
  public void insertMoney(int amount) {
    if (amount < 0) {
      System.out.println("Coloque valor maior que zero");
    } else {
      balance += amount;
    }
  }

  /**
   * Receive an amount of money in cents from a customer.
   */
  public void QtdTicket(int ticket) {
    if ((ticket * price) > balance) {
      System.out.println("Saldo insuficiente");
    } else {
      qtd += ticket;
      balance -= (qtd * price);
      for (int i = 0; i < qtd; i++) {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
      }
      System.out.println("Saldo de:" + balance);
      // Update the total collected with the balance.
      total += (qtd * price);
      // Clear the balance.
      qtd = 0;
    }
  }

  /**
   * Print a ticket.
   * Update the total collected and
   * reduce the balance to zero.
   */
  public void printTicket() {
    balance -= (qtd * price);

    // Simulate the printing of a ticket.
    System.out.println("##################");
    System.out.println("# The BlueJ Line");
    System.out.println("# Ticket");
    System.out.println("# " + price + " cents.");
    System.out.println("##################");
    System.out.println("Saldo de:" + balance);

    // Update the total collected with the balance.
    total += (qtd * price);
    // Clear the balance.
    balance -= (qtd * price);
    qtd = 0;
  }
}
