package baseball.controller;

import baseball.domain.BaseballGame;
import baseball.util.RandomNumber;

public class BaseballController {
    BaseballGame computer;
    public void run() {
        gameStart();
    }

    public void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        computer = new BaseballGame(RandomNumber.createRandomNumber());
    }
}
