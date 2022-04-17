package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram<zofka> {

    public void main(String[] args) {

        Turtle zofka;
        zofka = new Turtle();
    zofka.setLocation(200,100);


        nakresliOsmihran(zofka);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(160);
        zofka.turnLeft(90);
        zofka.move(10);
        zofka.penDown();

        zofka.setPenColor(Color.green);
        nakresliKolo(zofka);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliSlunce(zofka);


    }

    private void nakresliSlunce(Turtle zofka) {
        zofka.setPenColor(Color.orange);
        for (int j = 0; j < 12; j++) {
           zofka.move(30);
           zofka.turnLeft(30);
       zofka.turnRight(100);
       zofka.move(15);
       zofka.turnRight(180);
       zofka.move(15);
       zofka.turnRight(80);
   }
    }

    private void nakresliKolo(Turtle zofka) {
        for (int i = 0; i < 40; i++) {
            zofka.move(9);
            zofka.turnLeft(9);

        }
    }

    private void nakresliOsmihran(Turtle zofka) {
        zofka.setPenColor(Color.magenta);
        for (int i = 0; i < 8; i++) {
            zofka.move(40);
            zofka.turnLeft(45);
    }
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