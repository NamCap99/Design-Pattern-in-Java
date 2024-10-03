public class PhoneFactory {
    public Phone getPhone(PhoneType phoneType) {
        Phone phone = null;
        switch (phoneType) {
            case SAMSUNG:
                phone = new Samsung();
                break;
            case APPLE:
                phone = new Iphone();
                break;

            case NOKIA:
                phone = new Nokia();
                break;
        }

        return phone;
    }
}
