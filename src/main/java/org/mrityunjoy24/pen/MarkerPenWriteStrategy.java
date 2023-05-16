package org.mrityunjoy24.pen;

public class MarkerPenWriteStrategy implements WriteStrategy{
        @Override
        public void write(Parameter parameter) {
            System.out.println("Writing with marker pen.");
        }
}
