package com.yiming.command.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2021/02/02 11:46
 */
public class FilterChain {

    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public void doFilter(Command doit, Command undo) {
        if (index == filters.size()) return;
        Filter f = filters.get(index);
        index ++;

        f.doFilter(doit, undo, this);
    }

}
