package org.mrityunjoy24.pen;

public abstract class Pen {
    private String name;
    private String brand;
    private int length;

    public WriteStrategy writeStrategy;

    public Pen(WriteStrategy writeStrategy){
        this.writeStrategy = writeStrategy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract void write();
}
