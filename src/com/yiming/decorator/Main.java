package com.yiming.decorator;

import java.io.*;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/27 19:09
 */
public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("d:/work/test.data");
        FileOutputStream fos = new FileOutputStream(f);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("hello");
        bw.flush();
        bw.close();
    }
}
