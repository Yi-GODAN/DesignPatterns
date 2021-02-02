package com.yiming.command.test;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 11:24
 */
public class InsertCommand extends Command {

    Content c;
    String strToInsert = "yaa";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.str = c.str + strToInsert;
    }

    @Override
    public void undo() {
        c.str = c.str.substring(0, c.str.length() - strToInsert.length());
    }
}
