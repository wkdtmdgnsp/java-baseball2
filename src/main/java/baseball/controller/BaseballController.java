package baseball.controller;

import baseball.domain.BaseballGame;
import baseball.util.RandomNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    private BaseballGame computer;
    private BaseballGame user;
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();

    public void run() {
        gameStart();
        readNum();
        printResult();
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
            throw new IllegalArgumentException();
        }
    }

    public void printResult() {
        int strike = computer.getStrike(user);
        int ball = computer.getBall(user, strike);
        outputView.printScore(strike, ball);
    }
}
