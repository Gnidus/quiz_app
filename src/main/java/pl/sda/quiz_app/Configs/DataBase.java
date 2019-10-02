package pl.sda.quiz_app.Configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.sda.quiz_app.Models.Answer;
import pl.sda.quiz_app.Models.Question;
import pl.sda.quiz_app.Models.Quiz;
import pl.sda.quiz_app.Repositories.AnswerRepository;
import pl.sda.quiz_app.Repositories.QuestionRepository;
import pl.sda.quiz_app.Repositories.QuizRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataBase implements ApplicationRunner {

    private QuestionRepository questionRepository;
    private QuizRepository quizRepository;
    private AnswerRepository answerRepository;

    @Autowired
    protected DataBase(QuestionRepository questionRepository, QuizRepository quizRepository, AnswerRepository answerRepository){
        this.questionRepository = questionRepository;
        this.quizRepository = quizRepository;
        this.answerRepository = answerRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        DateFormat dateFormatYMD = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date now = new Date();

        // stwoerzenie pierwszego quizu
        Quiz quiz1 = new Quiz();
        quiz1.setTitle("Quiz o polskich filmach");
        quiz1.setDescription("Czy odgadniesz brakujący wyraz w tytule polskich filmów?");
        quiz1.setDate(now);

        Quiz quiz2 = new Quiz();
        quiz2.setTitle("Quiz o zwierzętach");
        quiz2.setDescription("Świat zwierząt - ile o nim wiesz?");
        quiz2.setDate(now);

        quizRepository.save(quiz1);
        quizRepository.save(quiz2);

//            quizRepository.save(quiz2);
//            question1.setQuiz(quiz1);     ---> metoda setQuizToQuestion w QuestionService
//            questionRepository.save(question1);

        //stworzenie 3 pytan
        Question question1 = new Question();
        question1.setContent("Nic ...");
        question1.setIndex(1);
        question1.setQuiz(quiz1);
        questionRepository.save(question1);

        Question question2 = new Question();
        question2.setContent("Nie ma róży bez ...");
        question2.setIndex(2);
        question2.setQuiz(quiz1);
        questionRepository.save(question2);

        Question question3 = new Question();
        question3.setContent("Dzień ...");
        question3.setIndex(3);
        question3.setQuiz(quiz1);
        questionRepository.save(question3);

        Question question4 = new Question();
        question4.setContent("... film o miłości");
        question4.setIndex(4);
        question4.setQuiz(quiz1);
        questionRepository.save(question4);

        Question question5 = new Question();
        question5.setContent("Nie ... poniedziałków");
        question5.setIndex(5);
        question5.setQuiz(quiz1);
        questionRepository.save(question5);


        //Pytania do Quizu2
        Question question6 = new Question();
        question6.setContent("Ile mrówek przypada na jednego człowieka?");
        question6.setIndex(1);
        question6.setQuiz(quiz2);
        questionRepository.save(question6);

        Question question7 = new Question();
        question7.setContent("Czy ptaki umieją fruwać do tyłu?");
        question7.setIndex(2);
        question7.setQuiz(quiz2);
        questionRepository.save(question7);

        Question question8 = new Question();
        question8.setContent("Które z tych zwierząt jest ssakiem?");
        question8.setIndex(3);
        question8.setQuiz(quiz2);
        questionRepository.save(question8);

        Question question9 = new Question();
        question9.setContent("Do czego kangury używają swoich ogonów?");
        question9.setIndex(4);
        question9.setQuiz(quiz2);
        questionRepository.save(question9);

        Question question10 = new Question();
        question10.setContent("Która istota morska śpi z jednym okiem otwartym");
        question10.setIndex(5);
        question10.setQuiz(quiz2);
        questionRepository.save(question10);



        //stworzenie 4 odpowiedzi
        //pytanie 1
        Answer answer11 = new Answer();
        answer11.setContent("śmiesznego");
        answer11.setCorrect(true);
        answer11.setQuestion(question1);

        Answer answer12 = new Answer();
        answer12.setContent("nowego");
        answer12.setCorrect(false);
        answer12.setQuestion(question1);

        Answer answer13 = new Answer();
        answer13.setContent("zabawnego");
        answer13.setCorrect(false);
        answer13.setQuestion(question1);

        Answer answer14 = new Answer();
        answer14.setContent("wesołego");
        answer14.setCorrect(false);
        answer14.setQuestion(question1);

        //pytanie 2
        Answer answer15 = new Answer();
        answer15.setContent("dymu");
        answer15.setCorrect(false);
        answer15.setQuestion(question2);

        Answer answer16 = new Answer();
        answer16.setContent("kolców");
        answer16.setCorrect(false);
        answer16.setQuestion(question2);

        Answer answer17 = new Answer();
        answer17.setContent("ognia");
        answer17.setCorrect(true);
        answer17.setQuestion(question2);

        Answer answer18 = new Answer();
        answer18.setContent("miłości");
        answer18.setCorrect(false);
        answer18.setQuestion(question2);

        //pytanie 3
        Answer answer19 = new Answer();
        answer19.setContent("świstaka");
        answer19.setCorrect(false);
        answer19.setQuestion(question3);

        Answer answer20 = new Answer();
        answer20.setContent("zbira");
        answer20.setCorrect(false);
        answer20.setQuestion(question3);

        Answer answer212 = new Answer();
        answer212.setContent("świra");
        answer212.setCorrect(true);
        answer212.setQuestion(question3);

        Answer answer213 = new Answer();
        answer213.setContent("nauczyciela");
        answer213.setCorrect(false);
        answer213.setQuestion(question3);

        //pytanie 4
        Answer answer141 = new Answer();
        answer141.setContent("Lekki");
        answer141.setCorrect(false);
        answer141.setQuestion(question4);

        Answer answer142 = new Answer();
        answer142.setContent("Krótki");
        answer142.setCorrect(true);
        answer142.setQuestion(question4);

        Answer answer143 = new Answer();
        answer143.setContent("Prosty");
        answer143.setCorrect(false);
        answer143.setQuestion(question4);

        Answer answer144 = new Answer();
        answer144.setContent("Szybki");
        answer144.setCorrect(false);
        answer144.setQuestion(question4);

        //pytanie 5
        Answer answer151 = new Answer();
        answer151.setContent("znoszę");
        answer151.setCorrect(false);
        answer151.setQuestion(question5);

        Answer answer152 = new Answer();
        answer152.setContent("lubię");
        answer152.setCorrect(true);
        answer152.setQuestion(question5);

        Answer answer153 = new Answer();
        answer153.setContent("cierpię");
        answer153.setCorrect(false);
        answer153.setQuestion(question5);

        Answer answer154 = new Answer();
        answer154.setContent("ma");
        answer154.setCorrect(false);
        answer154.setQuestion(question5);


        //Odpowiedz na pytanie 1 z quizu 2
        Answer answer21 = new Answer();
        answer21.setContent("1 000 000");
        answer21.setCorrect(true);
        answer21.setQuestion(question6);

        Answer answer22 = new Answer();
        answer22.setContent("1 000");
        answer22.setCorrect(false);
        answer22.setQuestion(question6);

        Answer answer23 = new Answer();
        answer23.setContent("10");
        answer23.setCorrect(false);
        answer23.setQuestion(question6);

        Answer answer24 = new Answer();
        answer24.setContent("100 000");
        answer24.setCorrect(false);
        answer24.setQuestion(question6);

        //Odpowiedz na pytanie 2 z quizu 2

        Answer answer222 = new Answer();
        answer222.setContent("Oczywiście, że tak!");
        answer222.setCorrect(false);
        answer222.setQuestion(question7);

        Answer answer223 = new Answer();
        answer223.setContent("Tylko kolibry potrafią");
        answer223.setCorrect(true);
        answer223.setQuestion(question7);

        Answer answer224 = new Answer();
        answer224.setContent("Nie potrafią");
        answer224.setCorrect(false);
        answer224.setQuestion(question7);

        //Odpowiedz na pytanie 3 z quizu 2

        Answer answer231 = new Answer();
        answer231.setContent("Rekin");
        answer231.setCorrect(false);
        answer231.setQuestion(question8);

        Answer answer232 = new Answer();
        answer232.setContent("Nietoperz");
        answer232.setCorrect(true);
        answer232.setQuestion(question8);

        Answer answer233 = new Answer();
        answer233.setContent("Krokodyl");
        answer233.setCorrect(false);
        answer233.setQuestion(question8);

        Answer answer234 = new Answer();
        answer234.setContent("Struś");
        answer234.setCorrect(false);
        answer234.setQuestion(question8);

        //Odpowiedz na pytanie 4 z quizu 2

        Answer answer241 = new Answer();
        answer241.setContent("Dla lepszego balansu podczas skoków");
        answer241.setCorrect(true);
        answer241.setQuestion(question9);

        Answer answer242 = new Answer();
        answer242.setContent("Do zabawy z dziećmi");
        answer242.setCorrect(false);
        answer242.setQuestion(question9);

        Answer answer243 = new Answer();
        answer243.setContent("Aby zwabiać partnerów podczas sezonu godowego");
        answer243.setCorrect(false);
        answer243.setQuestion(question9);

        Answer answer244 = new Answer();
        answer244.setContent("Aby odganiać się od owadów");
        answer244.setCorrect(false);
        answer244.setQuestion(question9);

        //Odpowiedz na pytanie 5 z quizu 2

        Answer answer251 = new Answer();
        answer251.setContent("Konik morski");
        answer251.setCorrect(false);
        answer251.setQuestion(question10);

        Answer answer252 = new Answer();
        answer252.setContent("Delfin");
        answer252.setCorrect(true);
        answer252.setQuestion(question10);

        Answer answer253 = new Answer();
        answer253.setContent("Meduza");
        answer253.setCorrect(false);
        answer253.setQuestion(question10);

        Answer answer254 = new Answer();
        answer254.setContent("Ośiornica");
        answer254.setCorrect(false);
        answer254.setQuestion(question10);


        //Dodanie odpowiedzi do listy jednego pytania
        answerRepository.save(answer11);
        answerRepository.save(answer12);
        answerRepository.save(answer13);
        answerRepository.save(answer14);
        answerRepository.save(answer15);
        answerRepository.save(answer16);
        answerRepository.save(answer17);
        answerRepository.save(answer18);
        answerRepository.save(answer19);
        answerRepository.save(answer20);
        answerRepository.save(answer212);
        answerRepository.save(answer213);
        answerRepository.save(answer141);
        answerRepository.save(answer142);
        answerRepository.save(answer143);
        answerRepository.save(answer144);
        answerRepository.save(answer151);
        answerRepository.save(answer152);
        answerRepository.save(answer153);
        answerRepository.save(answer154);


        answerRepository.save(answer21);
        answerRepository.save(answer22);
        answerRepository.save(answer23);
        answerRepository.save(answer24);

        answerRepository.save(answer222);
        answerRepository.save(answer223);
        answerRepository.save(answer224);

        answerRepository.save(answer231);
        answerRepository.save(answer232);
        answerRepository.save(answer233);
        answerRepository.save(answer234);

        answerRepository.save(answer241);
        answerRepository.save(answer242);
        answerRepository.save(answer243);
        answerRepository.save(answer244);

        answerRepository.save(answer251);
        answerRepository.save(answer252);
        answerRepository.save(answer253);
        answerRepository.save(answer254);




    }
}
