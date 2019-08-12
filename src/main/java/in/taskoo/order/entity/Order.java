package in.taskoo.order.entity;

import javax.persistence.Entity;

import in.taskoo.price.entity.Price;
import in.taskoo.user.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order {
    private Long id;

    private Price price;

    private User user;
}