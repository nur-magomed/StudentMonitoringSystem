package ru.innopolis.nur.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * Created by nur on 10.11.16.
 */

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "topic")
    private String topic;

    @Column(name = "lesson_date")
    private Date date;

    @ManyToMany(mappedBy = "lessons", fetch = FetchType.LAZY)
    private Set<Student> students;

    public Lesson() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
