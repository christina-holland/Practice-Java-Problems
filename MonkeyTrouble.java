public class MonkeyTrouble {
    //I am creating a method to determine if there is monkey trouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        //I am checking if both monkeys are smiling
        //The && symbol indicates that both monkeys must be smiling to return true
        if (aSmile && bSmile) {
            return true; //Returns true if both are smiling (monkey trouble)
        }
        //I am checking if neither monkey is smiling
        //The ! symbol means "not"
        if (!aSmile && !bSmile) {
            return true; //Return true if neither is smiling (monkey trouble)
        }
        //All other cases (one smiling and the other not)
        return false; //Returns false indicating no trouble
    }
}
