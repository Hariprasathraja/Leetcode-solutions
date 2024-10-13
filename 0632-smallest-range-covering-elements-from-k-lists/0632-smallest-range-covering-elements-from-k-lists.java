class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        // Min-heap that stores the current smallest element along with its list index and element index
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int max = Integer.MIN_VALUE;
        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE;

        // Initialize the heap with the first element from each list
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            minHeap.offer(new int[] {val, i, 0}); // Store value, list index, and element index
            max = Math.max(max, val); // Track the maximum value in the current range
        }

        // Continue processing while the heap is not empty
        while (minHeap.size() == nums.size()) {
            int[] curr = minHeap.poll();
            int min = curr[0], listIndex = curr[1], elemIndex = curr[2];

            // Update the range if we found a smaller range
            if (max - min < rangeEnd - rangeStart) {
                rangeStart = min;
                rangeEnd = max;
            }

            // If there are more elements in the current list, add the next element to the heap
            if (elemIndex + 1 < nums.get(listIndex).size()) {
                int nextVal = nums.get(listIndex).get(elemIndex + 1);
                minHeap.offer(new int[] {nextVal, listIndex, elemIndex + 1});
                max = Math.max(max, nextVal); // Update the max value in the current range
            }
        }

        // Return the smallest range
        return new int[] {rangeStart, rangeEnd};
    }
}
