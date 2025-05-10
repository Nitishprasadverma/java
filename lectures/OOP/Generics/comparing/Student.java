package OOP.Generics.comparing;

public class Student implements Comparable<Student>{
   int rollno;
   int marks;
   public Student(int rollno, int marks){
    this.rollno = rollno;
    this.marks = marks;
   } 
@Override
   public String toString() {
    return marks + "";
   }

@Override
    public int compareTo(Student o){
        System.out.println("in compareTo method");
        int diff = (int)(this.marks - o.marks);

        //if diff ==0 : means both are equals
        //if diff < 0 mean o is bigger else o is smaller
        return diff;


    }

    
   
}

