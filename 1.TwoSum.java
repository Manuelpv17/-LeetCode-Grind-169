class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkedNumbers = new HashMap<>();
        int[] solution = new int[2];

        checkedNumbers.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++){
            if (checkedNumbers.containsKey(target - nums[i])){
                solution[0] = checkedNumbers.get(target-nums[i]);
                solution[1] = i;
                break;
            }
            checkedNumbers.put(nums[i], i);
        }
        return solution;
    }
}
