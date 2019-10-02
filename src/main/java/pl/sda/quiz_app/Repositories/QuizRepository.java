package pl.sda.quiz_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.quiz_app.Models.Quiz;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}
