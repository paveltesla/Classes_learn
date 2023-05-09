public class Main {
    public static void main(String[] args) {
        System.out.println(HouseDaoSingleton.getInstance().getValue().getFlatsByQuantityRooms(3));
        System.out.println(HouseDaoSingleton.getInstance().getValue().getFlatsByQuantityRoomAndPlans(2,1,30));
        System.out.println(HouseDaoSingleton.getInstance().getValue().getFlatsByAreaMajor(20));
    }
}
