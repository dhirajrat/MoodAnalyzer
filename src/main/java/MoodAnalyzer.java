public class MoodAnalyzer {

    /**
     * Analyze Mood method
     * @param message
     * @return
     */
    public String analyzeMood(String message){


        if(message.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
