package com.chapter07;

abstract class Snake {}
class Cobra extends Snake {}
class GardenSnake extends Cobra {}

public class SnakeHandler {
    private Snake snakey;
    public void setSnake(Snake mySnake) { this.snakey = mySnake; }
    public static void main(String[] args) {
        new SnakeHandler().setSnake( null);
        System.out.println("Fin de Programa");
    }
}