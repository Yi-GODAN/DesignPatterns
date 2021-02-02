package com.yiming.visiter;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/29 17:44
 */
public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        PersonVisitor pv = new PersonVisitor();
        new Computer().accept(pv);
        System.out.println(pv.totalPrice);
    }

}

abstract class ComputerPart {
    abstract void accept(Visitor v);

    //some other operation eg:getName getBrand
    abstract double getPrice();
}

class CPU extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitorCPU(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitorMemory(this);
    }

    @Override
    double getPrice() {
        return 350;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitorBoard(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}

interface Visitor {
    void visitorCPU(CPU cpu);

    void visitorMemory(Memory memory);

    void visitorBoard(Board board);
}

class PersonVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitorCPU(CPU cpu) {
        totalPrice = cpu.getPrice() * 0.9;
    }

    @Override
    public void visitorMemory(Memory memory) {
        totalPrice = memory.getPrice() * 0.85;
    }

    @Override
    public void visitorBoard(Board board) {
        totalPrice = board.getPrice() * 0.8;
    }
}

class CorpVisitor implements Visitor {
    double totalPrice = 0.0;

    @Override
    public void visitorCPU(CPU cpu) {
        totalPrice = cpu.getPrice() * 0.6;
    }

    @Override
    public void visitorMemory(Memory memory) {
        totalPrice = memory.getPrice() * 0.55;
    }

    @Override
    public void visitorBoard(Board board) {
        totalPrice = board.getPrice() * 0.5;
    }
}
