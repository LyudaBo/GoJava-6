import java.util.Date;

public class TripAdvisorAPI implements API {
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Room room1 = new Room(189070, 100, 1, new Date(), "New York", "Kiev");
        Room room2 = new Room(6790998, 1000, 1, new Date(), "Ibiza", "Kiev");
        Room room3 = new Room(7890900, 300, 3, new Date(), "New York", "Kiev");
        Room room4 = new Room(6789899, 400, 4, new Date(), "New York", "Kiev");
        Room room5 = new Room(8090000, 500, 5, new Date(), "New York", "Kiev");

        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }
}
