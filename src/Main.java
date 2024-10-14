import DTO.CarDTO;
import java.util.ArrayList;  // Import the ArrayList class
import java.util.List;      // Import the List interface//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        List<CarDTO> cars =  toateMasinileDinParcare();

        System.out.println("Nr De Masini in parcare : " + cars.size());

        for (CarDTO car : cars) {
            System.out.println(car.getId() +" ----- "+ car.marca +" ----- "+ car.model);
        }
    }

    public static List<CarDTO> toateMasinileDinParcare() {
        List<CarDTO> carList = new ArrayList<>();
        carList.add(new CarDTO(1, "VK","Golf1"));
        carList.add(new CarDTO(2, "VK","Golf2"));
        carList.add(new CarDTO(3, "Honda","Accord"));
        return carList;
    }
}