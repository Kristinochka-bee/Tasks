package algoritms.greedyAlgoritm;

public class Request {
    private String name;

    private int start;
    private int end;
    private int sumTime;
    private int bonus;
    private int people;

    public int getSumTime() {
        return sumTime;
    }
//заявки с 9:00 до 13:00 стоят 1 единицу
    //заявки с 13:00 до 17:00 стоят 2 единицы


    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Request{" +
                ", start=" + start +
                ", end=" + end +
                ", sumTime=" + sumTime +
                ", bonus=" + bonus +
                '}';
    }


    public String getName() {
        return name;
    }

    //заявки на пересечении в большую сторону 9:00 стоят 1 ед
    //например с 11 до 14 стоит 1 ед
    //заявки на пересечении в большую сторону 17:00 стоят 2 ед
    //например с 12 до 16 стоит 2 ед
    public Request(int start, int end, String name){
        this.name = name;
        this.start = start;
        this.end = end;
        this.sumTime =  end - start; // 3

        if(start >= 13){  // c 13 часов
            bonus = 2;
        }
        else if (end < 13) { // до 13 часов
            bonus = 1;
        } else {
            int bonus1 = 13 - start;  //  сколько часов мы проводим до 13  (1)
            int bonus2 = end - 13;    //сколько часов мы проводим после 13 (3)
            if(bonus1 > bonus2){
                bonus = 1;
            } else {
                bonus = 2;
            }

        }

    }
}
