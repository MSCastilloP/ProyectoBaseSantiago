package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SerenityBusinessUnits;
import userinterface.SerenityLoginPage;

public class AnswerModule implements Question<Boolean> {
    private String question;

    public AnswerModule(String question) {
        this.question = question;
    }

    public static AnswerModule toThe(String question) {
        return new AnswerModule(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameTitle = Text.of(SerenityBusinessUnits.TITLE_BUSINESS_UNITS).viewedBy(actor).asString();
        System.out.println(nameTitle+ ' '+ question);
        if (question.equals(nameTitle)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
