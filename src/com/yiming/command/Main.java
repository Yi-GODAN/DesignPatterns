package com.yiming.command;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 11:32
 */
public class Main {

    public static void main(String[] args) {

        Content c = new Content();

        Command insertCommand = new InsertCommand(c);
        insertCommand.doit();
        insertCommand.undo();

        Command copyCommand = new CopyCommand(c);
        copyCommand.doit();
        copyCommand.undo();

        Command deletedCommand = new DeletedCommand(c);
        deletedCommand.doit();
        deletedCommand.undo();

        System.out.println(c.str);
    }

}
