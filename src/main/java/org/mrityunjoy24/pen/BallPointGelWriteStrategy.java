package org.mrityunjoy24.pen;

public class BallPointGelWriteStrategy implements WriteStrategy{
    @Override
    public void write(Parameter parameter) {
        System.out.println("Writing with " + parameter.getName() + " " + parameter.getPenType() + " pen " + "with refill.");
    }
}
