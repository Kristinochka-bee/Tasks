package algoritms.greedyAlgoritm;
import java.util.ArrayList;
import java.util.List;

public class Shedule {
    // 9 - 17

    public static void main(String[] args) {
        Request request01 = new Request(9, 11, "a");
        Request request02 = new Request(12, 16, "b");
        Request request03 = new Request(12, 13, "c");
        Request request04 = new Request(13, 15, "d");
        Request request05 = new Request(9, 13, "e");
        Request request06 = new Request(11, 12, "f");

        ArrayList<Request> array = new ArrayList<>(List.of(request01, request02, request03, request04, request05, request06));
        array.sort((o1, o2) -> o2.getSumTime() - o1.getSumTime());
        System.out.println(array.toString());

        Request[] arrayReqest = array.toArray(new Request[0]);
        System.out.println(arrayReqest.length);

        String[] schedule = new String[24];

        for(int i = 0; i < arrayReqest.length; i++){

            if (haveTime(schedule, arrayReqest[i].getStart(), arrayReqest[i].getEnd())){ // проверяем есть ли в этом промежутке свободное время

                for(int j = arrayReqest[i].getStart(); j < arrayReqest[i].getEnd(); j++){ // заполняем время которое свободно от старта до конуа
                    schedule[j] = arrayReqest[i].getName();
                    //schedule[j] = "+";
                }
            }
        }

        for (int i = 9; i <= 17; i++ ){
            System.out.println( i + " " + schedule[i]);
        }



        //найти время которое заканчивается позже всех

    }

    private static boolean haveTime(String[] schedule, int start, int end) {
        for(int i = start; i < end; i++){
            if(schedule[i] != null){ // если не 0 то занято
                return false;
            }
        }
        return true;

    }

}
