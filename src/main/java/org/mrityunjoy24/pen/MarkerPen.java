package org.mrityunjoy24.pen;

public class MarkerPen extends Pen implements Refillable{

    private Refill refill;

    public MarkerPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {
        super.writeStrategy.write(null);
    }

    @Override
    public Boolean isRefillable() {
        return true;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }
}
