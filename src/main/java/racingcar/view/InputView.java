package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> readRacingCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String racingCarName = Console.readLine();
        return Arrays.stream(racingCarName.split(","))
                .map(String::trim)
                .toList();
    }
}
