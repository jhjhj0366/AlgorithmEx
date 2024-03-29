package com.baekjoon.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10950 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i< N; i++){
            String x = br.readLine();
            int y = Integer.parseInt(x.split(" ")[0]);
            int z = Integer.parseInt(x.split(" ")[1]);

            bw.write(y+z + "\n");
        }
        br.close();
        bw.close();
    }
}