package pl.sda.quiz_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.quiz_app.Models.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
