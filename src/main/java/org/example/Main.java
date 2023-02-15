package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    int [] nums = new int[]{1,7,3,6,5,6};

    private void run() {
        Solution solution = new Solution();
        int pivotIndex = solution.pivotIndex(nums);
        System.out.println("Pivot index is: " + pivotIndex);
    }
}