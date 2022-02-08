package sortLab;

public abstract class SortingAlgorithm {

    public SortingAlgorithm(int[] unsortedList) {  //The constructor takes in an array, sets it to nums[]. Sets isSorted to false.
        this.nums = unsortedList;
        this.isSorted = false;
    }

    public abstract void iterateOnce();//ABSTRACT FUNCTION!!! You need to make it so that when this.iterateOnce() is called, it takes nums, runs 1 iteration of your sort on it, updates nums, and changes this.isSorted to true if its already sorted

    //after that, this is code I have written to save you some time. All children of this class will automatically have all this stuff unless you override a function to re-define it.
    public int nums[];
    public boolean isSorted;



    public void step() {//iterates unless list is already sorted
        if (!this.isSorted)
            iterateOnce();
    }

    public boolean isSorted(){return isSorted;}//Allows me to get a read-only copy of isSorted

    public int[] getContents() {return nums;}//Allows me to get a read-only copy of the nums[] array
}

