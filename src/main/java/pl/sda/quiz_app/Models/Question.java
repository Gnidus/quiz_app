package pl.sda.quiz_app.Models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;
    private int index;

    @ManyToOne
    private Quiz quiz;

    @OneToMany(mappedBy = "question")
    private List<Answer> answerList;



}
