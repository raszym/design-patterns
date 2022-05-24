package behavioral.templatemethod;

public class UserTest extends Test {
    @Override
    public void initializeData() {
        System.out.println("Tworzenie danych");
    }

    @Override
    public void checkTest() {
        System.out.println("Walidacja danych");
    }

    @Override
    public void cleanData() {
        System.out.println("Usuwanie danych");
    }
}
