package repository;

import model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {
    private static QuestionRepository INSTANCE;

    private final ArrayList<Question> questions = new ArrayList<>();

    private QuestionRepository() {
        questions.add(Question.builder()
                .text("Вам пропонують почати наволосвітню подорож. Прийняти пропозицію?")
                .answers(new ArrayList<>(List.of("Прийняти", "Відхилити")))
                .nextQuestions(new ArrayList<>(List.of(1, 2)))
                .build());

        questions.add(Question.builder()
                .text("Брати з собою тільки важливі речі ?")
                .answers(new ArrayList<>(List.of("Так", "Ні")))
                .nextQuestions(new ArrayList<>(List.of(3, 5)))
                .build());

        questions.add(Question.builder()
                .text("У результаті вашого відказу ви не встигли на корабель. Поразка")
                .answers(new ArrayList<>())
                .nextQuestions(new ArrayList<>())
                .build());

        questions.add(Question.builder()
                .text("Ви піднились на корабель! Що робимо далі?")
                .answers(new ArrayList<>(List.of("Піти у каюту поспати!", "Дослідити корабель")))
                .nextQuestions(new ArrayList<>(List.of(4, 9)))
                .build());

        questions.add(Question.builder()
                .text("Ви проспали подорож! Поразка.")
                .answers(new ArrayList<>())
                .nextQuestions(new ArrayList<>())
                .build());

        questions.add(Question.builder()
                .text("Що робити далі?")
                .answers(new ArrayList<>(List.of("Почати виконувати свої обов'язки", "Байдикувати")))
                .nextQuestions(new ArrayList<>(List.of(6, 2)))
                .build());

        questions.add(Question.builder()
                .text("Скільки часу ви хотіли би поспати?")
                .answers(new ArrayList<>(List.of("6 годин", "8 годин")))
                .nextQuestions(new ArrayList<>(List.of(7, 8)))
                .build());

        questions.add(Question.builder()
                .text("Ви стали поважним мореходцем. Перемога!")
                .answers(new ArrayList<>())
                .nextQuestions(new ArrayList<>())
                .build());

        questions.add(Question.builder()
                .text("Ви всеж усе проспали! Поразка!")
                .answers(new ArrayList<>())
                .nextQuestions(new ArrayList<>())
                .build());

        questions.add(Question.builder()
                .text("Ви стали поважним мореходцем. Перемога!")
                .answers(new ArrayList<>())
                .nextQuestions(new ArrayList<>())
                .build());
    }

    public static QuestionRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new QuestionRepository();
        }

        return INSTANCE;
    }

    public ArrayList<Question> getAll() {
        return questions;
    }
}
