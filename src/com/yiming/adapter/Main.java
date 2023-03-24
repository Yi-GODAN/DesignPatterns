package com.yiming.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {@code @Program:} DesignPatterns
 * {@code @Description:}
 * {@code @Author:} YiMing
 * {@code @Created:} 2021/02/02 13:35
 */
public class Main {

    public static void adapterReader() throws IOException {
        FileInputStream f = new FileInputStream("D:/test.txt");
        InputStreamReader ir = new InputStreamReader(f);
        BufferedReader br = new BufferedReader(ir);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        adapterReader();
    }

}