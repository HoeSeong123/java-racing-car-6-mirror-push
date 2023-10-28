package racingcar.controller;

import java.util.List;
import racingcar.validator.Validator;
import racingcar.view.InputView;

public class RacingGame {
    public void start() {
        List<String> racingCarNames = InputView.readRacingCarName();

        Validator.validateIsDuplicate(racingCarNames);
        for (String name : racingCarNames) {
            Validator.validateUnderFiveLength(name);
            Validator.validateIsBlank(name);
        }

        Long tryCount = InputView.readTryCount();
    }
}
