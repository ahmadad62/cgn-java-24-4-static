package org.example;

public class Counter {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static int incrementTotalCount() {
//        System.out.println("incrementTotalCount...."+totalCount);
        return totalCount=totalCount+1;

    }
    public int incrementInstanceCount() {
        return instanceCount=instanceCount+1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
