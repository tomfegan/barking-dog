public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWeWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWeWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWeWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWeWakeUp(true, -1));
    }
}
