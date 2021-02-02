package com.yiming.command.test;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 11:43
 */
public interface Filter {

    void doFilter(Command doit, Command undo, FilterChain chain);

}
