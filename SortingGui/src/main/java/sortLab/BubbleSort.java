package sortLab;

public final class BubbleSort extends SortingAlgorithm {

    public BubbleSort(int[] unsortedList) {
        super(unsortedList);
    }

    public void iterateOnce() {
        int temp;
        for (int i = 0; i < (nums.length - 1); i++) {//for every element in the array...
            if (nums[i + 1] < nums[i]) { //if the number is greater than the one ahead of it...
                temp = nums[i + 1]; //swap them...
                nums[i + 1] = nums[i];
                nums[i] = temp;
                return;//then stop executing
            }
        }
        this.isSorted = true; //if the for loop doesnt find an error and we dont return in it then it is sorted
    }
}
