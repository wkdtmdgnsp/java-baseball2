package baseball.domain;

import java.util.List;

public class BaseballGame {
    private final List<Integer> numbers;

    public BaseballGame(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getStrike(BaseballGame user) {
        int strike = 0;
        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) == user.numbers.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int getBall(BaseballGame user, int strike) {
        int ball = 0;
        for (int i=0; i<numbers.size(); i++) {
            if (numbers.contains(user.numbers.get(i))) {
                ball++;
            }
        }
        return ball - strike;
    }

    public void retry() {

    }
}
