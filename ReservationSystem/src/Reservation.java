public class Reservation {
    private int id;
    private String Name;
    private String date;

    public Reservation(int id, String name, String date){
        this.id = id;
        this.Name = name;
        this.date = date;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return Name;
    }

    public String getDate(){
        return date;
    }
}
