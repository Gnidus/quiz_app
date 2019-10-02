package pl.sda.quiz_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.quiz_app.Models.Answer;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {
}
