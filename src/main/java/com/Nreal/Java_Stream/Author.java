package com.Nreal.Java_Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.awt.print.Book;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode//用于后期的去重使用
public class Author {
    private Long id;
    private String name;
    private Integer age;
    private String intro;
    private List<Book> books;
}
