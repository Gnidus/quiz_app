package pl.sda.quiz_app.Models;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.quiz_app.Exceptions.QuizNotFoundException;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private Date date;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questionList;

    public Question getByIndex (Integer index){
       return questionList.stream()
                .filter((x)-> x.getId().equals(index))
                .findFirst().orElseThrow(QuizNotFoundException::new);
    }
}
