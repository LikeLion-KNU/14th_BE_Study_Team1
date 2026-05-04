package baseball;

// 입력 숫자 유효성 검증
public class Validator {
    public static void validate(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("[ERROR] 3자리여야 합니다.");
        }

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("[ERROR] 숫자만 입력하세요.");
            }
        }
    }
}
