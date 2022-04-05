package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "article")
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    @Id
    private Integer idOne;

    @Column(name = "user_id")
    private Integer userId;

    @Column
    private String title;
}
