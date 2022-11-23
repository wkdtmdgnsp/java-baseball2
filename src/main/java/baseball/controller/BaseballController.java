package baseball.controller;

import baseball.domain.BaseballGame;
import baseball.util.RandomNumber;
import baseball.view.InputView;

public class BaseballController {
    private BaseballGame computer;
    private BaseballGame user;
    private InputView inputView = new InputView();

    public void run() {
        gameStart();
        readNum();
    }

    public void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        computer = new BaseballGame(RandomNumber.createRandomNumber());
    }

    public void readNum() {
        try {
            System.out.print("숫자를 입력해주세요 : ");
            user = new BaseballGame(inputView.readNumber());
        } catch (IllegalArgumentException e) {
            readNum();
        }
    }
}
