package com.yiming.command.test;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 12:18
 */
public class CopyFilter implements Filter{
    @Override
    public void doFilter(Command doit, Command undo, FilterChain chain) {
        doit.doit();
        chain.doFilter(doit, undo);
        undo.undo();
    }
}
