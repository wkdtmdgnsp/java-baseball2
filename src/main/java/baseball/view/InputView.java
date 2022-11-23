package baseball.view;

import baseball.util.UserValidate;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    UserValidate userValidate = new UserValidate();

    public List<Integer> readNumber() {
        String number = Console.readLine();
        try {
            List<Integer> nums = userValidate.readNumberException(number);
            return nums;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public int readRetry() {
        return 0;
    }
}
