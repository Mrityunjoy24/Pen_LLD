package org.mrityunjoy24;

public class BallPointGelWriteStrategy implements WriteStrategy{
    @Override
    public void write(Parameter parameter) {
        System.out.println("Writing with " + parameter.getName() + " " + parameter.getPenType() + " pen " + "with refill.");
    }
}
