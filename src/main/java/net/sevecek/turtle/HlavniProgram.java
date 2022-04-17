package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram<zofka> {

    public void main(String[] args) {

        Turtle zofka;
        zofka = new Turtle();
    zofka.setLocation(300,400);

    nakresliPrasatko(zofka);

        mezeraMeziPrasatky(zofka);

        nakresliMalePrasatko(zofka);
    }


    private void nakresliPrasatko(Turtle zofka) {
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(60);
        zofka.move(50);
        zofka.turnRight(120);
        zofka.move(50);
    }

    private void mezeraMeziPrasatky(Turtle zofka) {
        zofka.turnLeft(60);
        zofka.penUp();
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(95);
        zofka.penDown();
    }
    private void nakresliMalePrasatko(Turtle zofka) {
        zofka.setPenColor(Color.pink);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(30);
        zofka.move(70);
        zofka.turnLeft(120);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(30);
        zofka.penUp();
        zofka.turnLeft(60);
        zofka.move(90);
        zofka.penDown();
        zofka.turnLeft(60);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(30);
}
}