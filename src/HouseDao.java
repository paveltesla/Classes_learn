import java.util.ArrayList;

public interface HouseDao {
    ArrayList<Integer> getFlatsByQuantityRooms(int room);
    ArrayList<Integer> getFlatsByQuantityRoomAndPlans(int room, int basePlan, int altPlan);
    ArrayList<Integer> getFlatsByAreaMajor(double area);
}
