package recursion;

public class peintnum {
    public static void main(String[] args) {
        System.out.println("ghekow");
        print(1);
    }

    static void print(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
