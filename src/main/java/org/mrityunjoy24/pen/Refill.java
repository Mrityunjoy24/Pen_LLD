package org.mrityunjoy24.pen;

public class Refill {
    private Ink ink;
    private Nib nib;
    private RefillTypeEnum refillType;

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

    public RefillTypeEnum getRefillType() {
        return refillType;
    }

    public void setRefillType(RefillTypeEnum refillType) {
        this.refillType = refillType;
    }
}
