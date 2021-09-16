package main.java.racingcar;

public class Car {
    public final static int MOVENUM = 4;
    public final static int STOPNUM = 3;

    private final String name;
    private int position = 0;


    public Car(String name) {
        this.name = name;
    }

    public int getPosition(){
        return position;
    }

    public String getName() {
        return name;
    }

    public void driveCar(int randomNum){
        if(randomNum>=MOVENUM){
            position++;
            return;
        }
        else if(randomNum<=STOPNUM){
            return;
        }
    }
}
