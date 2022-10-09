package org.binar.kampusmerdeka.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer user_id;

    @Column(name = "name")
    String name;

    String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_entity", referencedColumnName = "order_id")
    private OrderEntity orderEntity;
}
