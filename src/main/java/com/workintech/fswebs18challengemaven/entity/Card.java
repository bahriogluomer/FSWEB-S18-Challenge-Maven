package com.workintech.fswebs18challengemaven.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cards", schema = "casino")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "value")
    private Integer value;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private Type type;
    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color color;
}
