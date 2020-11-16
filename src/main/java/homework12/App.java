package homework12;

public class App {
    public static void main(String[] args) {
        Phone firstPhone = new Phone("google", "pixel 2",OperatingSystem.ANDROID);
        firstPhone.getCellPhoneInfo();
        firstPhone.lithiumIonBatteryStandard();
        firstPhone.workingUsing110v();

        Phone secondPhone = new Phone("iphone", "x-max", OperatingSystem.IOS);
        secondPhone.getCellPhoneInfo();
        secondPhone.lithiumIonBatteryStandard();
        secondPhone.workingUsing110v();

    }
}
