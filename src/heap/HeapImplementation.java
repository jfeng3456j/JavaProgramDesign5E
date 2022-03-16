package heap;

public class HeapImplementation {

    int size;
    int[] arr = new int[20];

    public void insertNewValue(int val) {
        arr[size] = val;

        int index = size;

        int parent = (index - 1) / 2;

        //swap
        while (parent >= 0 && arr[parent] < arr[index]) {
            int temp = arr[parent];
            arr[parent] = arr[index];
            arr[index] = temp;

            temp = parent;
            index = parent;

            parent = (temp -1) /2;
        }

        size++;
    }

    public int getMax() {
        return arr[0];
    }

    public int removeMax() {
        int max = arr[0];

        //move the last element to the first
        arr[0] = arr[size-1];

        //update the size
        size = size -1;

        maxheapify(0);
        return max;
    }

    public void maxheapify(int index) {
        int left, right;

        left = 2 * index + 1;
        right = 2 * index + 2;

        int largest = index;
        if (left < this.size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;

            maxheapify(largest);
        }
    }


    public void buildMaxHeap(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
        for (int i = size / 2 -1; i >= 0; i++) {
            maxheapify(i);
        }
    }
}

