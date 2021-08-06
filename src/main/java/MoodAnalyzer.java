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
        //Exception Handling
        if(moodMessage == null || moodMessage.isEmpty()){
            try { throw new MoodAnalyzerException("enter valid input except null or empty"); } catch (MoodAnalyzerException e) { e.printStackTrace();}
        }

        if (moodMessage.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
