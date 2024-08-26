package org.example;

import static org.example.Calculator.*;
import static org.example.Counter.incrementTotalCount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Counter counter = new Counter();
    Counter counter2 = new Counter();

        System.out.println("add "+add(12.5,15.2)); //import static method
        System.out.println("sub "+sub(12.5,15.2));
        System.out.println("mul "+mul(12.5,15.2));
        System.out.println("div "+div(12.5,15.2));

        System.out.println("incrementTotalCount 1:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 2:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 3:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 4:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 5:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 6:  "+ incrementTotalCount());

        System.out.println("incrementInstanceCount 1:  "+counter.incrementInstanceCount());
        System.out.println("incrementInstanceCount 2:  "+counter.incrementInstanceCount());
        System.out.println("incrementInstanceCount 3:  "+counter.incrementInstanceCount());
        System.out.println("incrementInstanceCount 4:  "+counter.incrementInstanceCount());
        System.out.println("incrementInstanceCount 5:  "+counter.incrementInstanceCount());
        System.out.println("incrementInstanceCount 6:  "+counter.incrementInstanceCount());


        System.out.println("incrementTotalCount 7:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 8:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 9:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 10:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 11:  "+ incrementTotalCount());
        System.out.println("incrementTotalCount 12:  "+ incrementTotalCount());

        System.out.println("incrementInstanceCount 7:  "+counter2.incrementInstanceCount());
        System.out.println("incrementInstanceCount 8:  "+counter2.incrementInstanceCount());
        System.out.println("incrementInstanceCount 9:  "+counter2.incrementInstanceCount());
        System.out.println("incrementInstanceCount 10:  "+counter2.incrementInstanceCount());
        System.out.println("incrementInstanceCount 11:  "+counter2.incrementInstanceCount());
        System.out.println("incrementInstanceCount 12:  "+counter2.incrementInstanceCount());

    }
}