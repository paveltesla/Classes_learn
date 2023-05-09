public class House {
    int id;
    int plane;
    int quantityRooms;
    double area;
    int numberOfFlat;
    String street;
    String typeOfBuild;
    String liveTime;

    public House() {
    }

    public House(int id, int plane, int quantityRooms, double area, int numberOfFlat, String street, String typeOfBuild, String liveTime) {
        this.id = id;
        this.plane = plane;
        this.quantityRooms = quantityRooms;
        this.area = area;
        this.numberOfFlat = numberOfFlat;
        this.street = street;
        this.typeOfBuild = typeOfBuild;
        this.liveTime = liveTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlane() {
        return plane;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }

    public int getQuantityRooms() {
        return quantityRooms;
    }

    public void setQuantityRooms(int quantityRooms) {
        this.quantityRooms = quantityRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuild() {
        return typeOfBuild;
    }

    public void setTypeOfBuild(String typeOfBuild) {
        this.typeOfBuild = typeOfBuild;
    }

    public String getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
    }
}
