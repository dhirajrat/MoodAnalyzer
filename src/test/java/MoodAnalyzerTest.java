import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer("This is a happy name Message");

        String mood=moodAnalyzerObj.analyzeMood();

        Assertions.assertEquals(mood,"SAD");
    }
    @Test
    public void testOtherMoodAnalysis(){
        MoodAnalyzer moodAnalyzerObj = new MoodAnalyzer("this contains happy message");

        String mood = moodAnalyzerObj.analyzeMood();

        Assertions.assertEquals(mood,"HAPPY");
    }
}
