package org.binar.kampusmerdeka.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer order_id;

    @Column(name = "name")
    String kursi;

    Integer jumlah;
}
