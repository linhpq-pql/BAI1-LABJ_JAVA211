package Entity;

public class Food {
    private String ID;
    private int weight;
    private String name;
    private String type;
    private String place;
    private String expireDate;

    public Food(){
    }

    public Food(String ID, String name,int weight, String type, String place, String expireDate) {
        this.ID = ID;
        this.weight = weight;
        this.name = name;
        this.type = type;
        this.place = place;
        this.expireDate = expireDate;
    }

    public String getID() {
        return ID;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPlace() {
        return place;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}
