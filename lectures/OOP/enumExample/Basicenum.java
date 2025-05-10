package OOP.enumExample;

public class Basicenum {

    enum Week implements A {

        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;

        //these are enum constants
        //public,static and final
        //since its final you can not create child enums
        //type is week

        void hello(){

        }


        Week(){
            System.out.println("Constructor called for " + this);

        }
        @Override
        public void display() {
            System.out.println("hello i'm override in enum");
        }

        //this is not public or protected, only private or default
        //why? we don't want to create new objects

        //internally : public static final Week Monday = new Week(); 
    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;
        week.display();

        System.out.println(Week.valueOf("Monday"));

        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());

    }
}
