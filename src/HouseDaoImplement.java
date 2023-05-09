import java.util.ArrayList;

public class HouseDaoImplement implements HouseDao{
    ArrayList<House> houses = new ArrayList<>();
    {
        houses.add(new House(1, 2, 1, 20.0, 32,"peshkov", "Katedj", "12.12.2050"));
        houses.add(new House(2, 4, 3, 60.0, 51,"peshkov", "Katedj", "12.12.2050"));
        houses.add(new House(3, 12, 2, 40.0, 10,"peshkov", "Katedj", "12.12.2050"));
        houses.add(new House(4, 23, 4, 80.0, 213,"peshkov", "Katedj", "12.12.2050"));
        houses.add(new House(5, 1, 2, 40.0, 82,"peshkov", "Katedj", "12.12.2050"));
        houses.add(new House(6, 11, 1, 20.0, 2,"peshkov", "Katedj", "12.12.2050"));

    }

    @Override
    public ArrayList<Integer> getFlatsByQuantityRooms(int room) {
        ArrayList<Integer> result = new ArrayList<>();
        for (House h:houses){
            if(h.getQuantityRooms() == room){
                result.add(h.getNumberOfFlat());
            }
        }return result;
    }

    @Override
    public ArrayList<Integer> getFlatsByQuantityRoomAndPlans(int room, int basePlan, int altPlan) {
        ArrayList<Integer> result = new ArrayList<>();
        for (House h:houses){
            if(h.getQuantityRooms() == room && h.getPlane()>=basePlan&&h.getPlane()<=altPlan){
                result.add(h.getNumberOfFlat());
            }
        }return result;
    }

    @Override
    public ArrayList<Integer> getFlatsByAreaMajor(double area) {
        ArrayList<Integer> result = new ArrayList<>();
        for (House h:houses){
            if(h.getArea()>area){
                result.add(h.getNumberOfFlat());
            }
        }return result;
    }
}
