package org.mrityunjoy24.pen;

public class FountainPenWriteStrategy implements WriteStrategy {

    @Override
    public void write(Parameter parameter){
        System.out.println("Writing with fountain pen.");
    }
}
