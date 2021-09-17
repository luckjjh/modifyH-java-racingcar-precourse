package main.java.racingcar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserIO {
    public int tryNum = 0;
    public ArrayList<Car> carNameList = new ArrayList<>();
    public void initInput(){
        String carNames;
        final Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        carNames=scanner.next();
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            this.tryNum = scanner.nextInt();
            splitCarNames(carNames);
        }catch (InputMismatchException e){
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
            initInput();
        }
    }

    public void splitCarNames(String carNames){
        //차 이름 , 로 나누고 car 객체 배열 생성
        String[] splitedCarNames = carNames.split(",");

        for(int i = 0;i<splitedCarNames.length;i++){
            Car tmpCar = new Car(splitedCarNames[i]);
            carNameList.add(tmpCar);
        }
    }

    public void showRacingState(){
        for(int i = 0;i<carNameList.size();i++) {
            System.out.print(carNameList.get(i).getName() + " : ");
            for (int j = 0; j < carNameList.get(i).getPosition(); j++)
                System.out.print("-");
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public void showWinner(){
        int maxNum = 0;
        for(int i=0;i<carNameList.size();i++){
            if(maxNum<carNameList.get(i).getPosition())
                maxNum = carNameList.get(i).getPosition();
        }
        System.out.print("최종 우승자: ");
        for(int i=0;i<carNameList.size();i++){
            if(maxNum==carNameList.get(i).getPosition()&&i!=carNameList.size()-1)
                System.out.print(carNameList.get(i).getName()+",");
            else if(maxNum==carNameList.get(i).getPosition())
                System.out.print(carNameList.get(i).getName());
        }
    }
}
