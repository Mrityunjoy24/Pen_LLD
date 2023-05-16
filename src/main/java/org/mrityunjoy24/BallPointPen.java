package org.mrityunjoy24;

public class BallPointPen extends Pen implements Refillable{

    private Refill refill;

    public BallPointPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {
        Parameter parameter = new Parameter();
        parameter.setPenType(PenType.BALL_POINT_PEN);
        parameter.setName(super.getName());

        super.writeStrategy.write(parameter);
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
