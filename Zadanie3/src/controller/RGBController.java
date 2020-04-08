package controller;

import model.RGB;

import java.util.Scanner;

public class RGBController {
    private Scanner scan = new Scanner(System.in);

    private RGB color3 = new RGB();

    public void setColors(RGB C1, RGB C2) {

        System.out.println("Podaj R koloru 1:.");
        C1.setR_value(scan.nextInt());
        if (C1.getR_value() >= 255)
            C1.setR_value(255);
        else if (C1.getR_value() <= 0)
            C1.setR_value(0);

        System.out.println("Podaj G koloru 1.");
        C1.setG_value(scan.nextInt());
        if (C1.getG_value() >= 255)
            C1.setG_value(255);
        else if (C1.getG_value() <= 0)
            C1.setG_value(0);

        System.out.println("Podaj B koloru 1.");
        C1.setB_value(scan.nextInt());
        if (C1.getB_value() >= 255)
            C1.setB_value(255);
        else if (C1.getB_value() <= 0)
            C1.setB_value(0);

        System.out.println("Podaj R koloru 2.");
        C2.setR_value(scan.nextInt());
        if (C2.getR_value() >= 255)
            C2.setR_value(255);
        else if (C2.getR_value() <= 0)
            C2.setR_value(0);

        System.out.println("Podaj G koloru 2.");
        C2.setG_value(scan.nextInt());
        if (C2.getG_value() >= 255)
            C2.setG_value(255);
        else if (C2.getG_value() <= 0)
            C2.setG_value(0);

        System.out.println("Podaj B koloru 2.");
        C2.setB_value(scan.nextInt());
        if (C2.getB_value() >= 255)
            C2.setB_value(255);
        else if (C2.getB_value() <= 0)
            C2.setB_value(0);

    }

    public void getColors(RGB C1, RGB C2) {
        System.out.println("Kolor 1: ");
        System.out.println("R: " + C1.getR_value());
        System.out.println("G: " + C1.getG_value());
        System.out.println("B: " + C1.getB_value());
        System.out.println("Kolor 2: ");
        System.out.println("R: " + C2.getR_value());
        System.out.println("G: " + C2.getG_value());
        System.out.println("B: " + C2.getB_value());
    }

    public void mixColors(RGB C1, RGB C2) {

        if (C1.getR_value() == C2.getR_value()) {
            color3.setR_value(C1.getR_value());
        } else {
            color3.setR_value((C1.getR_value() + C2.getR_value()) % 256);
            if (color3.getR_value() >= 255)
                color3.setR_value(255);
            else if (color3.getR_value() <= 0)
                color3.setR_value(0);
        }

        if (C1.getG_value() == C2.getG_value()) {
            color3.setG_value(C1.getG_value());
        } else {
            color3.setG_value((C1.getG_value() + C2.getG_value()) % 256);
            if (color3.getG_value() >= 255)
                color3.setG_value(255);
            else if (color3.getG_value() <= 0)
                color3.setG_value(0);
        }

        if (C1.getB_value() == C2.getB_value()) {
            color3.setB_value(C1.getB_value());
        } else {
            color3.setB_value((C1.getB_value() + C2.getB_value()) % 256);
            if (color3.getB_value() >= 255)
                color3.setB_value(255);
            else if (color3.getB_value() <= 0)
                color3.setB_value(0);
        }

        System.out.println("Nowy kolor: ");
        System.out.println("R: " + color3.getR_value());
        System.out.println("G: " + color3.getG_value());
        System.out.println("B: " + color3.getB_value());
    }

}
