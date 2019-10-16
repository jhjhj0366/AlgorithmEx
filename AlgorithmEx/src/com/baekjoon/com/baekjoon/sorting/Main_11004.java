package com.baekjoon.com.baekjoon.sorting;


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 *  백준 알고리즘
 *  K번째 수 - 11004
 * https://www.acmicpc.net/problem/11004
 * */
public class Main_11004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
        br.close();
    }

}
