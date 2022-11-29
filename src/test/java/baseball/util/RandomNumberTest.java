package baseball.util;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {
    private List<Integer> randomNumber = RandomNumber.createRandomNumber();
    @Test
    void 숫자_중복_테스트() {
        Set set = new HashSet(randomNumber);
        assertThat(set.size()).isEqualTo(3);
    }

    @Test
    void 숫자_0_포함_테스트() {
        boolean zero = true;
        if (randomNumber.contains(0)) {
            zero = false;
        }
        assertThat(zero).isEqualTo(true);
    }
}