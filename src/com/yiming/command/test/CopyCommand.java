package com.yiming.command.test;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 11:28
 */
public class CopyCommand extends Command {

    Content c;

    public CopyCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.str = c.str + c.str;
    }

    @Override
    public void undo() {
        c.str = c.str.substring(0, c.str.length() / 2);
    }
}
