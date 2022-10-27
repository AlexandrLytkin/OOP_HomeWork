package validator;

public class ValidationUtils {
    public static String validOrDefault(String valid, String defaultValid) {
        if (valid == null || valid.isBlank()) {
            return defaultValid;
        } else {
            return valid;
        }
        //return valid == null || valid.isBlank() ? defaultValid : valid; //тоже самое сокращенно!
    }
}
