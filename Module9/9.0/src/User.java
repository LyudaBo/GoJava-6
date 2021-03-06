/**
 * Created by Людмила on 15.04.2017.
 */
public class User implements Comparable<User>{
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", balance=" + balance +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;

        User user = (User) o;
        return getCity ( ) != null ? getCity ( ).equals ( user.getCity ( ) ) : user.getCity ( ) == null;
    }

    @Override
    public int hashCode () {
        int result = getFirstName ( ) != null ? getFirstName ( ).hashCode ( ) : 0;
        result = 31 * result + (getLastName ( ) != null ? getLastName ( ).hashCode ( ) : 0);
        result = 31 * result + (getCity ( ) != null ? getCity ( ).hashCode ( ) : 0);
        result = 31 * result + getBalance ( );
        return result;
    }

    @Override
    public int compareTo ( User o ) {
        return getCity ().compareTo ( o.getCity () );
    }
}
