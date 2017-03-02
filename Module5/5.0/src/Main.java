import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(1000, 1, "Paris", "New York");
        controller.requestRooms(2000, 2, "Vena", "Jora");

        for (Room oneRoom : controller.requestRooms(1000, 1, "Kiev", "New York")) {
            System.out.println(oneRoom.getId());
        }

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();

       controller.check(api1, api2);

        Room room1 = new Room(79900, 5000, 1, new Date(), "hotel", "city");
        DAO dao = new DAOImpl();

        dao.save(room1);
        dao.delete(room1);
    }
}
