package lectures.OOP.Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student nitish = new Student(12, 83);
        Student rahul = new Student(16, 89);
        Student manu = new Student(1, 93);
        Student anshu = new Student(42, 98);
        Student pankaj = new Student(32, 99);

        Student[] list = { nitish, rahul, manu, anshu, pankaj };

        // System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.marks - o1.marks);
            }
        });


        // Arrays.sort(list, (o1,o2) -> -(int)(o1.marks - o2.marks)); // this will sort in decending order

        // this will sort in accending order
        Arrays.sort(list, (o1,o2) -> (int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));


        if(nitish.compareTo(anshu) < 0){
            System.out.println(nitish.compareTo(anshu));
            System.out.println("anshu has more marks");
        }
    }
}
