package lectures.OOP.cloning;

public class Human {
     
        int age;
        String name;
        int[] arr;
    

    public Human(int age, String name){
       this.age = age;
       this.name = name;
       this.arr = new int[]{3,4,5,6,6,7};
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException {
    //     //this is shallow copy
    //     return super.clone();
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin  = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
