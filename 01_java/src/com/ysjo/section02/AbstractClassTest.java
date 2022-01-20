package com.ysjo.section02;

public class AbstractClassTest {
    public static void main(String[] args) {
        Unit[] group = new Unit[4];

        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();

        for(int i = 0; i<3; i++) {
            group[i].move(100, 200);
        }
    }
}


abstract class Unit{
    int x, y;

    abstract void move(int x, int y);
    void stop() { System.out.println("Stop!"); }
}

class Marine extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("마린이 (" + x + ", " + y + ") 좌표로 이동...");
    }
    void SteamPack() {}
}
class Tank extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("탱크가 (" + x + ", " + y + ") 좌표로 이동...");
    }
    void ChangeMode() {}
}
class Dropship extends Unit{
    @Override
    void move(int x, int y) {
        System.out.println("드랍쉽이 (" + x + ", " + y + ") 좌표로 이동...");
    }
    void load() {}
    void unload() {}
}
