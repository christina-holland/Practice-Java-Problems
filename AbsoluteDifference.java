public class AbsoluteDifference {
    //I am creating a method to find the difference from 21 and doubling if the number is over 21
    public int diff21(int n) {
        //Checking if the input number is less than or equal to 21
        if (n <= 21) {
            //Returning the difference between 21 and the number if under 21
            return 21 - n;
        } else {
            //Return double the difference between the number and 21 if over 21
            return (n - 21) * 2;
        }
    }
}
