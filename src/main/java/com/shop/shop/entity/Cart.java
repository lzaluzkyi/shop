package com.shop.shop.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    private Long count;

    private Boolean conform = false;

    @OneToMany(mappedBy = "cart")
    private List<CartNode> cartNodes;



}
