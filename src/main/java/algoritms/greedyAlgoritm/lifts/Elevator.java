package algoritms.greedyAlgoritm.lifts;

import static java.lang.Math.abs;

public class Elevator {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        System.out.println(elevator.callLift());

    }
    private int totalFloors = 19;
    private String[] liftsNames = {"a","b","c"};
    private int[] liftsPositions = {4,10,8};
    private int  passengerFloor = 6;

    private boolean[] liftsBusy = {true,false,true} ;

    public String callLift(){
        String liftNameMinDiff = liftsNames[0];
        int minDiff = totalFloors;

        for (int i = 0; i < liftsPositions.length; i++) {
                if (abs(passengerFloor - liftsPositions[i]) < minDiff) {
                    if (liftsBusy[i] == false) {
                        minDiff = abs(passengerFloor - liftsPositions[i]);
                        liftNameMinDiff = liftsNames[i];
                    }
                }
        }
        return liftNameMinDiff;
    }



}
