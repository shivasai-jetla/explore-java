package Diksha;

public class Restaurent {

    private String name;
    private String location;
    private String cuisine;
    private String rating;

    public Restaurent(String name, String location, String cuisine, String rating) {
        this.name = name;
        this.location = location;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurent{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cuisine='" + cuisine + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

