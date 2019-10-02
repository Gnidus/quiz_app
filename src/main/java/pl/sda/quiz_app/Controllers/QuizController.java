package pl.sda.quiz_app.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.sda.quiz_app.Repositories.QuizRepository;

@Controller
public class QuizController {

    private QuizRepository quizRepository;

    @Autowired
    public QuizController(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @GetMapping
    public ModelAndView getQuizes(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("quizes");
        mav.addObject("quizes",quizRepository.findAll());
        return  mav;

    }

}
