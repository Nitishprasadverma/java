package OOP.Properties.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;
    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;

    }

    BoxPrice(double cost,double h, double l, double w, double weight){
        super(l,w,h,weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight,double cost){
        super(weight,side);
        this.cost = cost;
    }
}
