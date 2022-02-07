import java.util.ArrayList;
import java.util.List;

public class FavoriteFoods {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Put a food you like here");

        System.out.println("OUR FAVORITE FOODS");
        for (String item : foods)
            System.out.println(item);
    }
}
