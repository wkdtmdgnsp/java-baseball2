package baseball.view;

public class OutputView {
    public void printScore(int strike, int ball) {
        String score = getScore(strike, ball);
        if (!score.contentEquals("")) {
            System.out.println(score);
            return;
        }
        System.out.println("낫싱");
    }

    public String getScore(int strike, int ball) {
        StringBuilder sb = new StringBuilder();
        if (ball != 0) {
            sb.append(ball +"볼 ");
        }
        if (strike != 0) {
            sb.append(strike +"스트라이크");
        }
        return sb.toString();
    }
}
