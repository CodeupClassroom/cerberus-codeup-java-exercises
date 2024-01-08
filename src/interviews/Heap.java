package interviews;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap() {
        heap = new ArrayList<Integer>();
    }

    public void insert(int val) {
        heap.add(val);

        int size = heap.size();
        int index1 = size - 1;
        int index2 = Math.floorDiv(index1, 2);
        while(index1 > 0 && heap.get(index1) < heap.get(index2)) {
            int temp = heap.get(index2);
            heap.set(index2, heap.get(index1));
            heap.set(index1, temp);
            index1 = index2;
            index2 = Math.floorDiv(index1, 2);
        }
    }

    public int getMin() {
        int min = heap.get(0);

        // put last val as the new min
        int index = 0;
        heap.set(index, heap.get(heap.size() - 1));

        // get rid of last entry in the heap (it is now the temp min)
        heap.remove(heap.size() - 1);

        // and sift it down
        while(true) {
            // stop when index is a leaf
            int leftChildIndex = index * 2 + 1;
            if(leftChildIndex >= heap.size()) {
                break;
            }

            // or is smaller than its children
            int tempMin = heap.get(leftChildIndex);
            int swapIndex = leftChildIndex;

            int rightChildIndex = index * 2 + 2;
            if(rightChildIndex < heap.size()) {
                if(heap.get(rightChildIndex) < tempMin) {
                    tempMin = heap.get(rightChildIndex);
                    swapIndex = rightChildIndex;
                }
            }

            // else swap if with the smallest one
            if(heap.get(index) > tempMin) {
                int tempVal = heap.get(index);
                heap.set(index, tempMin);
                heap.set(swapIndex, tempVal);
                index = swapIndex;
            } else {
                // can't swap so must be in the right spot
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(80);
        heap.insert(30);
        heap.insert(70);
        heap.insert(90);
        heap.insert(35);
        heap.insert(5);
        heap.insert(50);

        System.out.println(heap);

        System.out.println("min is " + heap.getMin());
        System.out.println(heap);

        System.out.println("min is " + heap.getMin());
        System.out.println(heap);

        System.out.println("min is " + heap.getMin());
        System.out.println(heap);
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heap=" + heap +
                '}';
    }
}