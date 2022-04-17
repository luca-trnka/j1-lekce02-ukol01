package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram<zofka> {

    public void main(String[] args) {

        Turtle zofka;
        zofka = new Turtle();

       nakresliSlunce(zofka);

        zofka.setLocation(180,200);

        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
            zofka.move(200);
            zofka.turnLeft(90);
        }

        zofka.setLocation(180,450);
        nakresliDomecek(zofka);

        zofka.setLocation(980,450);
        zofka.turnLeft(90);
        nakresliDomecek(zofka);

        zofka.setLocation(450,450);
        zofka.turnLeft(90);
        nakresliMalePrasatko(zofka);

    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.setPenColor(Color.black);
            zofka.turnLeft(90);
            zofka.move(130);
        }
        zofka.setPenColor(Color.red);
        zofka.turnLeft(45);
        zofka.move(91.9);
        zofka.turnLeft(90);
        zofka.move(91.9);
        zofka.turnLeft(135);
        zofka.move(130);
        zofka.penUp();

    }

    private void nakresliSlunce(Turtle zofka) {
        zofka.setLocation(240,90);
        zofka.setPenColor(Color.orange);
        for (int j = 0; j < 12; j++) {
           zofka.move(15);
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
            zofka.setPenColor(Color.green);
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
        zofka.penDown();
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