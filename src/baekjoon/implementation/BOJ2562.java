package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최댓값
public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];
        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if(nums[i] > max) {
                max = nums[i];
                idx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}
