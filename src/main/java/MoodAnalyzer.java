public class MoodAnalyzer {

    String moodMessage;

    /**
     * Constructor
     * @param moodMessage
     */
    public MoodAnalyzer(String moodMessage) {
        this.moodMessage = moodMessage;
    }

    /**
     * Analyze Mood Method
     * @return
     */
    public String analyzeMood(){
        if(moodMessage.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
