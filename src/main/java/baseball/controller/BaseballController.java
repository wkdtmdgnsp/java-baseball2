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
    private int strike = 0;

    public void run() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        game();
    }

    public void gameStart() {
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
        strike = computer.getStrike(user);
        int ball = computer.getBall(user, strike);
        outputView.printScore(strike, ball);
    }

    public void game() {
        gameStart();

        while (strike != 3) {
            readNum();
            printResult();
        }

        if (strike == 3) {
            retry();
        }
    }

    public void retry() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String reGame = inputView.readRetry();
        if (reGame.contentEquals("1")) {
            strike = 0;
            game();
        }
    }
}
