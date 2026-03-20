class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add current fruit to the basket
            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);

            // If we have more than 2 types, shrink the window from the left
            while (count.size() > 2) {
                count.put(fruits[left], count.get(fruits[left]) - 1);
                if (count.get(fruits[left]) == 0) {
                    count.remove(fruits[left]);
                }
                left++;
            }

            // Update the maximum length found so far
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
