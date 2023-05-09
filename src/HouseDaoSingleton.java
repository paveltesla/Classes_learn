public class HouseDaoSingleton {
    public HouseDao value;
    public static HouseDaoSingleton instance;
    public HouseDaoSingleton(){
        this.value = new HouseDaoImplement();
    }
    public  static HouseDaoSingleton getInstance(){
        if (instance == null){
            instance = new HouseDaoSingleton();
        }return instance;
    }

    public HouseDao getValue() {
        return value;
    }
}
