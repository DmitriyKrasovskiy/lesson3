package DZ3;

public class DZ31 {

    public static void main(String[] args) {

        int s = 997040;
        int sec;
        int m;
        int min, h, hours;
        int d, day;
        int week;


        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hours = h % 24;
        d = (h-hours) / 24;
        day = d % 7;
        week = (d - day)/7;

        System.out.println(week + "недель" + " " + day + "дней" + " " + hours + " часов" + " "
                + min + " минут" + " " + sec + " секунд");

    }
}
