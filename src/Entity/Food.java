package Entity;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Food implements Comparable<Food>  {
    private String ID;
    private int weight;
    private String name;
    private String type;
    private String place;
    private LocalDate expireDate;

    public Food() {
    }

    public Food(String ID, String name,int weight, String type, String place, LocalDate expireDate) {
        this.ID = ID;
        this.weight = weight;
        this.name = name;
        this.type = type;
        this.place = place;
        this.expireDate=expireDate;
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

    public LocalDate getExpireDate() {
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

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return this.ID + " | " + this.name + " | " + this.weight + " | " + this.type + " | " + this.place + " | " + this.expireDate;
    }

    @Override
    public int compareTo(Food t) {
        if (t.expireDate.isAfter(this.expireDate)) {
        return 1;
    } else if (t.expireDate.isBefore(this.expireDate)) {
        return -1;
    } else {
        return 0;
    }
    }
}
