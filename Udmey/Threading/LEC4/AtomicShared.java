package Threading.LEC4;

import java.util.concurrent.atomic.AtomicInteger;

// public class AtomicShared {
//     int counter;

//     public  void increment(){
//         counter++;
//     }

//     public  int get(){
//         return counter;
//     }
// }

//using lock free operation like atomicinteger
public class AtomicShared {
   AtomicInteger counter = new AtomicInteger(0);

    public  void increment(){
        counter.incrementAndGet();
    }

    public  int get(){
        return counter.get();
    }
}


//using syncronized
// public class  AtomicShared {
//     int counter;

//     public synchronized void increment(){
//         counter++;
//     }

//     public  int get(){
//         return counter;
//     }
// }
