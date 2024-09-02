
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String fruit = in.next();
        // fruit = fruit.toLowerCase();

int day = in.nextInt();
in.close();

// switch     (fruit) {
//             case "mango":
//                 System.out.println("King of fruits.");
//                 break;
//             case "graps":
//                 System.out.println("i'm small green fruit best for summer.");
//                 break;

//             case "apple":
//                 System.out.println("red fruit");
//                 break;

//             case "orange":
//                 System.out.println("round fruit");
//                 break;
//             default:
//                 System.out.println("Didn't match to any  of our fruits !");
//                 break;
//         }
//     }


//     switch(day) {
//         case 1:
//             System.out.println("Monday");
//             break;
//         case 2:
//             System.out.println("Tuesday");
//             break;

//         case 3:
//             System.out.println("Wednesday");
//             break;

//         case 4:
//             System.out.println("Thrusday");
//             break;
            
//         case 5:
//         System.out.println("Friday");
//         break;
        
//         case 6:
//             System.out.println("Saturday");
//             break;
            
//         case 7:
//         System.out.println("Sunday");
//         break;
//         default:
//             System.out.println("Invalid input!");
//             break;
//     }
switch(day) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
   System.out.println("weekday");
   break;
    case 6:
    case 7:
    System.out.println("Weekend");
    break;
    default:
        System.out.println("Invalid input!");
        break;
}
}

}

