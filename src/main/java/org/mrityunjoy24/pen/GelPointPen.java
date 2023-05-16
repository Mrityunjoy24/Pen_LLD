package org.mrityunjoy24.pen;

public class GelPointPen extends Pen implements Refillable{

    private Refill refill;

    public GelPointPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {
        Parameter parameter = new Parameter();
        parameter.setPenType(PenType.GEL_POINT_PEN);
        parameter.setName(super.getName());

        super.writeStrategy.write(parameter);
    }

    @Override
    public Boolean isRefillable() {
        return true;
    }

    public void setRefill(Refill gelPointRefill) {
        this.refill = gelPointRefill;
    }

    public Refill getRefill() {
        return refill;
    }
}
