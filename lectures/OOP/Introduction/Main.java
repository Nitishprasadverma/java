package OOP.Introduction;



public class Main {
    public static void main(String[] args) {
        // stores 5 roll no
        int[] numbers = new int[5];


        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {rollno, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //creating 5 students  obj using Student class

        Student[] students = new Student[5];
         
        // declaring studnet class obj
         Student nitish ;
         nitish = new Student();

        //in short

        

        Student nitish1 = new Student();
        System.out.println(nitish1.name); // by default String type value will be null if not initialize

        System.out.println(nitish1.rno); // int value is given  zero by default if it is not initialize 
        System.out.println(nitish1.marks); // float value is given  0.0 by default if it is not initialize

        // initialize the above obj value

        // nitish1.name = "nitish verma";
        // nitish1.rno = 13;
        // nitish1.marks = 82.6f;

        // System.out.println(nitish1.name);
        // System.out.println(nitish1.rno);
        // System.out.println(nitish1.marks);
        nitish1.greeting();
        // nitish1.changeName("Pankaj");
        nitish1.greeting();

        Student Random  = new Student(nitish1);
        System.out.println(Random.name);

        Student random1 = new Student();
        
        // System.out.println(random1.name);

        Student one  = new Student();
        Student two = one;
        one.name = "Something-somthing";
        System.out.println(two.name);
    }


}

 class Student {

    int rno;
   
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object

    // we need one word to access every object

    //own constructor declaring
    //it will called when Student constructor will called without any arguments
    Student () {
        // this.rno = 13;
        // this.name = "Nitish Verma";
        // this.marks = 82.6f;


        //this is how you call a constructor from another constructor
        // internally : new Student(13,"Defalut-name", 100.0f);
        this(13, "Defalut-name", 100.0f);
    }

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }
// it will called when Student constructor will called t=with roll, name and marks arguments

//Student miki = new Student(17,"miki",89.3f);
// here this will be replace with miki.rno,miki.name,miki.marks
    Student (int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

}
