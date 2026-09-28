package CollectionFrameWorks;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lec2Main {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        minPq.add(5);
        minPq.add(2);
        minPq.add(8);
        minPq.add(1);

        //printing all the values

        minPq.forEach((Integer val) -> System.out.println(val));

        //remove top element from the pq and print

        while (!minPq.isEmpty()) {
            int val = minPq.poll();
            System.out.println("Removing from top:" + val);
        }

        //Max priority queue maxPq used to solve problems of max heap

        PriorityQueue<Integer> maxpq = new PriorityQueue<>((Integer a, Integer b) -> b - a);

        maxpq.add(5);
        maxpq.add(2);
        maxpq.add(8);
        maxpq.add(1);

        maxpq.forEach((Integer val) -> System.out.println(val));

        //remove top element from the pq and print

        while (!maxpq.isEmpty()) {
            int val = maxpq.poll();
            System.out.println("Remove from top" + val);
        }

        int[] arr = {1,2,3};
        Arrays.sort(arr);


        Car[] carrArray = new Car[3];
        

        carrArray[1] = new Car("SUV", "Petrol");
        carrArray[1] = new Car("Sedan", "Diesel");
        carrArray[2] = new Car("HatchBook", "CNG");

        // Arrays.sort(carrArray);

        Integer[] a = {6,4,1,9,2,11};
        Arrays.sort(a,(Integer val1, Integer val2) -> val1 - val2); // sorting in increase order

        for(int v : a){
            System.out.println(v);
        }
        Arrays.sort(a,(Integer val1, Integer val2) -> val2-val1);

        for(int v : a){
            System.out.println(v);
        }


        Arrays.sort(carrArray,(Car obj1, Car obj2) -> obj2.carType.compareTo(obj1.carType)); // decending order

        for(Car car : carrArray){
            System.out.println(car.carName + ".." + car.carType);
        }

        Arrays.sort(carrArray,(Car obj1, Car obj2) -> obj1.carType.compareTo(obj2.carType)); // ascending order

        for(Car car : carrArray){
            System.out.println(car.carName + ".." + car.carType);
        }

        

        
    }

    public static   class  Car {
    
        String carName;
        String carType;

        Car(String name, String type){
            this.carName = name;
            this.carType = type;
        }
    }
}
