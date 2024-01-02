package array;

import java.util.*;

public class Arrayto2DArray {
    public List<List<Integer>> convertTo2DArray(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            List<Integer> row = new ArrayList<>();
            while (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0 && !row.contains(num)) {
                row.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
                num = findNextNumber(frequencyMap);
            }
            if (!row.isEmpty()) {
                result.add(row);
            }
        }
        
        // Sort the result list based on the size of each sublist
        result.sort((a, b) -> a.size() - b.size());

        return result;
    }

    private int findNextNumber(Map<Integer, Integer> frequencyMap) {
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > 0) {
                return num;
            }
        }
        return -1; // Indicates no next number found
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        Arrayto2DArray converter = new Arrayto2DArray();
        List<List<Integer>> result = converter.convertTo2DArray(nums);

        System.out.println("Output:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
