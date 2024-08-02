public class SleepIn {
    //I am writing a method to determine if I can sleep in
    public boolean sleepIn(boolean weekday, boolean vacation) {
        //I am checking if it's not a weekday or if it's a vacation
        //The || symbol means if either condition is true, I can sleep in
        if (!weekday || vacation) {
            return true; //Returns true indicates I can sleep in
        }

        //If it's a weekday and not a vacation, I cannot sleep in
        return false; //Returns false indicating I cannot sleep in
    }
}
