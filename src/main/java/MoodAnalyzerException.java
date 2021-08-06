/**
 * Custom Exception Definition
 */
public class MoodAnalyzerException extends Exception {

    enum TYPE_OF_EXCEPTION {
        EMPTY_MESSAGE,
        NULL_MESSAGE
    }

    public MoodAnalyzerException(String message){
        super(message);
    }
}
