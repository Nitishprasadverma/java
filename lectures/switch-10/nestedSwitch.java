import java.util.*;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int id = in.nextInt();
        String dep = in.next();
        in.close();
        dep = dep.toLowerCase();

        switch (id) {
            case 1:
                System.out.println("Nitish Prasad Verma");
                break;
            case 2:
                System.out.println("Abhimanyu Kumar Mahto");

            case 3:
                System.out.println("Emp number 3");
                switch (dep) {
                    case "it":
                        System.out.println("IT Department");
                        break;

                    case "management":
                        System.out.println("Management Department");
                    case "marketing":
                        System.out.println("Marketing Department");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
                break;
            default:
                System.out.println("Invalid id");
                break;
        }
    }
}
