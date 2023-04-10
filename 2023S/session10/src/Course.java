import java.util.*;

/*
    This is an example Java Bean

    1. public class
    2. has matching public get/set methods where return type of get = parameter of set
    3. has a constructor with no parameters OR is serializable


 */
public class Course {
    private String id; // CPE552
    private String name;// Engineering Java
    private String roomid;
    private int    capacity; // how many people allowed in class

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private ArrayList<Person> students;

    public Course() {
        name = "";
        roomid = "";
        capacity = 0;
        students = new ArrayList<>();
    }

    // set and get, matching type, and public
    public void setId(String id) { this.id = id; }
    public String getId()        { return this.id; }

    public void setName(String name) { this.name = name; }
    public String getName()          { return this.name; }

    public void setRoomId(String room) {
        roomid = room;
    }
    public String getRoomId() {
        return roomid;
    }

}
