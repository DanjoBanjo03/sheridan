package yourturn5;

public class Start {
    public static void main(String[] args)
    {
        //⁡⁢⁣⁢PartA:⁡ check out the diagram called PartA.jpg
        //Build MovieTicket so that the following code works:

        MovieTicket ticket1 = new MovieTicket("SpiderMan", TicketType.ADULT, 4);
        String ticketInfo = ticket1.getTicketInfo();
        System.out.println(ticketInfo);

        MovieTicket ticket2 = new MovieTicket("Avengers", TicketType.CHILD, 3);
        String ticket2Info = ticket2.getTicketInfo();
        System.out.println(ticket2Info);

        MovieTicket ticket3 = new MovieTicket("Avengers", TicketType.SENIOR, 3);
        String ticket3Info = ticket3.getTicketInfo();
        System.out.println(ticket3Info);

        // ⁡⁢⁣⁢Part B:  Follow the instructions below⁡

        //Build an array of 5 Movie Objects and print out the names of all the movies
        //print out how many are ACTION FILMS
        //print out the total amount of money these tickets cost

    }
}
