package com.yiming.command;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 11:21
 */
public class DeletedCommand extends Command {

    Content c;
    String delete;

    public DeletedCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        delete = c.str.substring(0, 5);
        c.str = c.str.substring(5, c.str.length());
    }

    @Override
    public void undo() {
        c.str = delete + c.str;
    }
}
