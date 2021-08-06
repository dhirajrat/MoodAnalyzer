import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void testMoodAnalysis() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer("This is a happy name Message");

        String mood=moodAnalyzerObj.analyzeMood();

        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    public void testHappyMoodAnalysis() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer("this contains happy message");

        String mood = moodAnalyzerObj.analyzeMood();

        Assertions.assertEquals(mood,"HAPPY");
    }

    @Test
    public void testOtherMoodAnalysisWithNull() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer(null);

        String mood = moodAnalyzerObj.analyzeMood();

        Assertions.assertEquals(mood,"HAPPY");
    }

    @Test
    public void testOtherMoodAnalysisWithEmptyMessage() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer("");

        String mood = moodAnalyzerObj.analyzeMood();

        Assertions.assertEquals(mood,"HAPPY");
    }
}
