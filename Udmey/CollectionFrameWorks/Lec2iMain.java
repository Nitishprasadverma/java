package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lec2iMain {
    

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("SUV", "Petrol"));

        cars.add(new Car("Sedan", "disel"));
        cars.add(new Car("hatchback", "cng"));

        Collections.sort(cars,(Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName));

        cars.forEach((Car carObj) -> System.out.println(carObj.carName + ".." + carObj.carType));
    }

    public  static  class Car {
        String carName;
        String carType;

        Car(String name, String type){
            this.carName = name;
            this.carType = type;
        }
    }

    // public static  class CarNameComparator implements  Comparator<Car> {

    //     @Override 
    //     public  int compare(Car o1, Car o2){
    //         return o2.carName.compareTo(o1.carName)
    //     }
    // }
    // public  class Car implements Comparator<Car> {}
}
