import java.util.PriorityQueue;

class MedianFinder {

    // A max heap to store the smaller half of the numbers
    // Since Java's PriorityQueue is a min heap by default, we use a comparator to reverse the order.
    private PriorityQueue<Integer> leftMaxHeap;

    // A min heap to store the larger half of the numbers
    private PriorityQueue<Integer> rightMinHeap;

    // Constructor initializes both heaps
    public MedianFinder() {
        leftMaxHeap = new PriorityQueue<>((a, b) -> b - a); // Max heap to hold smaller values
        rightMinHeap = new PriorityQueue<>(); // Min heap to hold larger values
    }

    // Adds a number to the data structure
    public void addNum(int num) {
        // First, insert the number into max heap (left heap)
        leftMaxHeap.add(num);

        // Move the largest element from max heap to min heap (to balance the two halves)
        rightMinHeap.add(leftMaxHeap.poll());

        // Ensure leftMaxHeap (max heap) has at least as many elements as rightMinHeap (min heap)
        if (rightMinHeap.size() > leftMaxHeap.size()) {
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }

    // Returns the median of the current set of numbers
    public double findMedian() {
        // If the number of elements is odd, max heap has the median
        if (leftMaxHeap.size() > rightMinHeap.size()) {
            return leftMaxHeap.peek();
        }
        // If the number of elements is even, median is the average of both top elements
        else {
            return (leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
        }
    }
}