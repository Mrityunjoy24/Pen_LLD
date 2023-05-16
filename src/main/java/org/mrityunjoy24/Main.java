package org.mrityunjoy24;

public class Main {
    public static void main(String[] args) {
        Ink inkBlack = new Ink();
        inkBlack.setColor(ColorEnum.BLACK);

        Ink inkBlue = new Ink();
        inkBlue.setColor(ColorEnum.BLUE);

        Ink inkRed = new Ink();
        inkRed.setColor(ColorEnum.RED);

        Ink inkGreen = new Ink();
        inkGreen.setColor(ColorEnum.GREEN);
        //---------------------------------------------

        Nib gelNib = new Nib();
        gelNib.setRadius(8.0);

        Nib ballPointNib = new Nib();
        ballPointNib.setRadius(5.0);

        Nib markerNib = new Nib();
        markerNib.setRadius(10.0);

        Nib fountainNib = new Nib();
        fountainNib.setRadius(2.0);
        //---------------------------------------------

        Refill ballPointRefill = new Refill();
        ballPointRefill.setInk(inkBlack);
        ballPointRefill.setNib(ballPointNib);
        ballPointRefill.setRefillType(RefillTypeEnum.BALL_PEN_REFILL);

        Refill gelPointRefill = new Refill();
        gelPointRefill.setInk(inkBlue);
        gelPointRefill.setNib(gelNib);
        gelPointRefill.setRefillType(RefillTypeEnum.GEL_PEN_REFILL);

        Refill markerRefill = new Refill();
        markerRefill.setInk(inkRed);
        markerRefill.setNib(markerNib);
        markerRefill.setRefillType(RefillTypeEnum.MARKER_REFILL);
        //---------------------------------------------

        WriteStrategy ballPointGelWriteStrategy = new BallPointGelWriteStrategy();

        BallPointPen ballPointPen = new BallPointPen(ballPointGelWriteStrategy);
        ballPointPen.setBrand("Flair");
        ballPointPen.setName("Writometer");
        ballPointPen.setLength(5);
        ballPointPen.setRefill(ballPointRefill);
        ballPointPen.write();

        GelPointPen gelPen = new GelPointPen(ballPointGelWriteStrategy);
        gelPen.setBrand("Classmate");
        gelPen.setName("Octane");
        gelPen.setLength(5);
        gelPen.setRefill(gelPointRefill);
        gelPen.write();

        WriteStrategy markerPenWriteStrategy = new MarkerPenWriteStrategy();
        MarkerPen markerPen = new MarkerPen(markerPenWriteStrategy);
        markerPen.setBrand("Camlin");
        markerPen.setName("White Board");
        markerPen.setLength(6);
        markerPen.setRefill(markerRefill);
        markerPen.write();

        WriteStrategy fountainPenWriteStrategy = new FountainPenWriteStrategy();
        FountainPen fountainPen = new FountainPen(fountainPenWriteStrategy);
        fountainPen.setBrand("Lamy");
        fountainPen.setName("Safari");
        fountainPen.setLength(6);
        fountainPen.setInk(inkGreen);
        fountainPen.setNib(fountainNib);
        fountainPen.write();
    }
}