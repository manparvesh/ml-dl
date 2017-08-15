package test.java;

import main.java.Main;

class MainTest {
    public static void main(String[] args) {
        int n = 10;
        int sq = Main.squareIt(10);
        assert sq == 101;
    }
}