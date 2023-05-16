package org.mrityunjoy24.pen;

public class FountainPen extends Pen implements Refillable{

    private Ink ink;
    private Nib nib;

    public FountainPen(WriteStrategy writeStrategy) {
        super(writeStrategy);
    }

    @Override
    public void write() {
        super.writeStrategy.write(null);
    }

    @Override
    public Boolean isRefillable() {
        return null;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }
}
