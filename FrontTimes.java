public class FrontTimes {
    //I am creating a method to repeat the front part of the string 's', 'n' times
    public String frontTimes(String s, int n) {
        //Defining the length of the front part to take from the string
        int frontLen = 3;

        //Adjusting frontLen if the string is shorter than 3 characters
        if (frontLen > s.length()) {
            frontLen = s.length(); //Uses the full length of the string if it's less than 3
        }

        //I am extracting the front part of the string from index 0 to frontLen
        String front = s.substring(0, frontLen);

        //I am initializing an empty result string
        String result = "";

        //I am repeat the front part 'n' times
        for (int i = 0; i < n; i++) {
            result += front; //Concatenates the front part to the result string
        }

        //I am return the final result string
        return result;
    }
}
