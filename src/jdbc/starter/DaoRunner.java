package jdbc.starter;

import jdbc.starter.dao.TicketDao;
import jdbc.starter.dto.TicketFilter;
import jdbc.starter.entity.Ticket;

import java.math.BigDecimal;

public class DaoRunner {

    public static void main(String[] args) {
     //   saveTest();
    //    deleteTest(59L);
       var tickets = TicketDao.getInstance().findAll();
      //  var ticket = TicketDao.getInstance().findById(2L);
        System.out.println(tickets);

        var ticketFilter = new TicketFilter(3, 0, "Евгений Кудрявцев", "A1");
        var ticketss = TicketDao.getInstance().findAll(ticketFilter);
        System.out.println(ticketss);

    }

    private static void updateTest() {
        var ticketDao = TicketDao.getInstance();
        var maybeTicket = ticketDao.findById(2L);
        System.out.println(maybeTicket);

        maybeTicket.ifPresent(ticket -> {
            ticket.setCost(BigDecimal.valueOf(188.88));
            ticketDao.update(ticket);
        });
    }


    private static void deleteTest(Long id) {
        var ticketDao = TicketDao.getInstance();
        var deleteResult = ticketDao.delete(id);
        System.out.println(deleteResult);
    }

    private static void saveTest() {
        var ticketDao = TicketDao.getInstance();
        var ticket = new Ticket();
        ticket.setPassengerNo("1234567");
        ticket.setPassengerName("Test");
        ticket.setFlightId(3L);
        ticket.setSeatNo("B3");
        ticket.setCost(BigDecimal.TEN);

        var savedTicket = ticketDao.save(ticket);
        System.out.println(savedTicket);
    }
}
