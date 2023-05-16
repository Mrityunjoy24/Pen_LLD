package org.mrityunjoy24;

public class FountainPenWriteStrategy implements WriteStrategy {

    @Override
    public void write(Parameter parameter){
        System.out.println("Writing with fountain pen.");
    }
}
