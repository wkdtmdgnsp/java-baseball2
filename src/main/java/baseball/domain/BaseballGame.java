package baseball.domain;

import java.util.List;

public class BaseballGame {
    private final List<Integer> numbers;

    public BaseballGame(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int score() {
        return 0;
    }

    public void retry() {

    }
}
