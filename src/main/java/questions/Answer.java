package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SerenityLoginPage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameTitle = Text.of(SerenityLoginPage.TITLE_HOME).viewedBy(actor).asString();
        if (question.equals(nameTitle)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
