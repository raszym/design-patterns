package behavioral;

import behavioral.chainofresponsibility.ConsultantHelper;
import behavioral.chainofresponsibility.FAQHelper;
import behavioral.chainofresponsibility.Helper;
import behavioral.chainofresponsibility.ProgrammerHelper;

public class ChainOfResponsibilityRunner {

    public void run() {
        Helper helper = getHelper();

        helper.handle("Otrzymuję informację, że hasło jest błędne");
        helper.handle("Komunikiat BusinessException - zbyt mała kwota");
        helper.handle("Exception - brak pliku formularz.txt");
    }

    private Helper getHelper() {
        Helper faqHelper = new FAQHelper();
        Helper consultantHelper = new ConsultantHelper();
        Helper programmerHelper = new ProgrammerHelper();

        faqHelper.setNextHelper(consultantHelper);
        consultantHelper.setNextHelper(programmerHelper);

        return faqHelper;
    }
}
