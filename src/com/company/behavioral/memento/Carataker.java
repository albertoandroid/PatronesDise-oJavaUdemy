package com.company.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albertopalomarrobledo on 31/7/19.
 */
public class Carataker {

    private List<ArticleMemento> estados = new ArrayList<>();

    public void addMemento(ArticleMemento memento){
        estados.add(memento);
    }

    public ArticleMemento getMemento(int index){
        return estados.get(index);
    }
}
