package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {
    private BaseballGame computer = new BaseballGame(Arrays.asList(1,2,3));
    private BaseballGame user = new BaseballGame(Arrays.asList(1,3,2));

    @Test
    void 스트라이크_테스트() {
        assertThat(computer.getStrike(user)).isEqualTo(1);
    }

    @Test
    void 볼_테스트() {
        assertThat(computer.getBall(user, computer.getStrike(user))).isEqualTo(2);
    }
}