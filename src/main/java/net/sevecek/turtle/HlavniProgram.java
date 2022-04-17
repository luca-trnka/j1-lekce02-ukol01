package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram<zofka> {

    public void main(String[] args) {

        Turtle zofka;
        zofka = new Turtle();

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

        //pismeno L
        zofka.turnLeft(90);
        zofka.setLocation(85, 300);
        nakresliL(zofka);

        //pismeno U
        zofka.turnLeft(90);
        zofka.setLocation(285, 300);
        nakresliU(zofka);


        //pismeno C
        zofka.setLocation(485, 300);
        nakresliC(zofka);


        //pismeno I
        zofka.setLocation(685, 300);
        nakresliI(zofka);

        //pismena E
        zofka.setLocation(885, 300);
            nakresliE(zofka);


        zofka.setLocation(450,450);
     zofka.turnLeft(90);
    nakresliMalePrasatko(zofka);

    nakresliSlunce(zofka);



    }

    private void nakresliE(Turtle zofka) {
        zofka.setPenColor(Color.blue);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(50);
    }

    private void nakresliI(Turtle zofka) {
        zofka.setPenColor(Color.blue);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(25);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(60);
    }

    private void nakresliC(Turtle zofka) {
        zofka.penDown();
        zofka.setPenColor(Color.blue);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(50);
        zofka.turnRight(90);
    }

    private void nakresliU(Turtle zofka) {
        zofka.penDown();
        zofka.setPenColor(Color.blue);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(60);
    }

    private void nakresliL(Turtle zofka) {
        zofka.penDown();
        zofka.setPenColor(Color.blue);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
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
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(30);
        zofka.move(35);
        zofka.turnRight(135);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.move(20);
        zofka.setLocation(430,480);
        zofka.move(2);
        zofka.turnLeft(135);



}
}