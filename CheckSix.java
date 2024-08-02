public class CheckSix {
    //I am creating a method to check if 6 appears as the first or last element in the array
    public boolean firstOrLastIsSix(int[] nums) {
        //I am checking if the first element of the array is 6
        if (nums[0] == 6) {
            return true; //Returns true if the first element is 6
        }

        //I am checking if the last element of the array is 6
        if (nums[nums.length - 1] == 6) {
            return true; //Returns true if the last element is 6
        }

        //Returns false if 6 is neither the first nor the last element
        return false;
    }
}

