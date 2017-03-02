import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room" + room.getId() + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room" + room.getId() + "deleted");
        return true;
    }

    @Override

    public Room update(Room room) {
        System.out.println("Room" + room.getId() + "updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(6870090, 100, 1, new Date(), "hotel", "city");
        System.out.println("Room was found by ID" + id);
        return room;
    }
}
