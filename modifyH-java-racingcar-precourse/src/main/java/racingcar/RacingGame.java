package main.java.racingcar;

import java.util.ArrayList;
import main.java.utils.*;

public class RacingGame {

    public void startRacingGame(){
        UserIO userIO = new UserIO();
        userIO.initInput();
        while((userIO.tryNum--)!=0){
            driveCar(userIO.carNameList);
            userIO.showRacingState();
        }
        userIO.showWinner();
    }
    public void driveCar(ArrayList<Car> carNameList){
        int randomNum = 0;
        for(int i = 0;i<carNameList.size();i++){
            randomNum = RandomUtils.nextInt(0,9);
            carNameList.get(i).driveCar(randomNum);
        }
    }

}
