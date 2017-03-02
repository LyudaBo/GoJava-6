import java.util.Arrays;

public class Controller {
    private API apis[] = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        int countRequestRooms = 0;
        for (API eachApi : apis) {
            countRequestRooms += eachApi.findRooms(price, persons, city, hotel).length;
        }

        Room[] requestRoomsResult = new Room[countRequestRooms];

        int i = 0;
        for (API eachApi : apis) {
            for (Room nextRoom : eachApi.findRooms(price, persons, city, hotel)) {
                requestRoomsResult[i] = nextRoom;
                i++;
            }
        }

        return requestRoomsResult;
    }


    Room[] check(API api1, API api2) {

    }
}

