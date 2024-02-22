public class TimeDemo {
    public static void main(String[] args) {
        Time time1 = new Time(5, 30);
        Time time2 = new Time(17, 30);
        Time sum = time1.add(time2);
        System.out.println(sum); // Output: 13:20
    }
}