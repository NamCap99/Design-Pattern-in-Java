public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.getPhone(PhoneType.SAMSUNG);
        phone.showInfo();
    }
}