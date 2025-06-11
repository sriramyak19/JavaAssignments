public class MovieTicket {
    static int totalTicketsSold = 0;

    MovieTicket() {
        totalTicketsSold++;
    }

    void showTotalTickets() {
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
    }

    public static void main(String[] args) {
        MovieTicket mt1 = new MovieTicket();
        MovieTicket mt2 = new MovieTicket();
        mt1.showTotalTickets();
    }
}

