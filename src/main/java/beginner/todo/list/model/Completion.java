package beginner.todo.list.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "completions")
public class Completion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCompleted;

    @ManyToOne
    @JoinColumn(name = "habit_id")
    @JsonBackReference
    private Habit habit;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDateCompleted() { return dateCompleted; }
    public void setDateCompleted(LocalDate dateCompleted) { this.dateCompleted = dateCompleted; }

    public Habit getHabit() { return habit; }
    public void setHabit(Habit habit) { this.habit = habit; }
}
