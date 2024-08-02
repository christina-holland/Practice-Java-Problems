public class StringManipulator {
    //I am creating a method to repeat a given string 's', 'n' times
    public String stringTimes(String s, int n) {
        //I am use StringBuilder for efficient string concatenation
        StringBuilder result = new StringBuilder();

        //I am looping 'n' times to append the string 's' to the result
        for (int i = 0; i < n; i++) {
            result.append(s); //Appends the string 's' to the StringBuilder
        }

        //I am converting the StringBuilder to a String and returning it
        return result.toString();
    }
}
