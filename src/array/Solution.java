package array;

class Solution {
    public int numberOfBeams(String[] bank) {
        int m = bank.length;
        int n = bank[0].length();
        int count = 0;

        for (int j = 0; j < n; j++) {
            int start = -1;
            for (int i = 0; i < m; i++) {
                if (bank[i].charAt(j) == '1') {
                    if (start != -1) {
                        count += i - start - 1;
                    }
                    start = i;
                }
            }
        }
        return count;
    }
    //main method
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] bank = {
            "011001",
            "000000",
            "010100",
            "001000"
        };
        int beams = solution.numberOfBeams(bank);
        System.out.println("Total number of laser beams: " + beams);
    }
}
