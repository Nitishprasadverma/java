package OOP.Properties.inheritance;

public class BoxWeight extends Box{
    double weight;
   public BoxWeight (){
        this.weight = -1;
        // this.grip = 1; // grip can not accessible bcz that is decralred as private there;
    }

    BoxWeight (BoxWeight other){    super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(double l, double h, double w, double weight){
    super(l,h,w); //call the parent calass constructor
        this.weight = weight;
    }
}
