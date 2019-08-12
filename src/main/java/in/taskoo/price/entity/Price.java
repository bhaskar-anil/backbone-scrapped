package in.taskoo.price.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import in.taskoo.attribute.entity.Attribute;
import in.taskoo.task.entity.Task;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Price {
    private Long id;

    @ManyToOne
    @JoinColumn(name = "att_id", referencedColumnName = "id")
    private Attribute attribute;

    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;

    private Double price;
}