public class SumDouble {
    //I am creating a method to find the sum of two integers and double it if the numbers are equal
    public int sumDouble(int a, int b) {
        //I am calculating the sum of the two integers and storing it as a variable named sum
        int sum = a + b;

        //I am checking if the two integers are equal
        if (a == b) {
            //If the integers are equal, the sum is doubled
            sum = sum * 2;
        }
        //I am returning the final result, which is either the original sum or the doubled sum
        return sum;
    }
}
