package com.mycompany.beans;

import com.mycompany.urs.domain.Playera;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class PlayeraBean {
    private List<Playera> playeras = new ArrayList<>();

    public PlayeraBean() {
        playeras.add(new Playera(100.12, "Playera de color de azul, bonita", "XL", 100, "imagen"));
        playeras.add(new Playera(123.15, "Playera del ITESS", "M", 12, "imagen1"));
        playeras.add(new Playera(189.11, "Playera de algo, ejemplo", "S", 19, "imagen2"));
    }

    public List<Playera> getPlayeras() {
        return playeras;
    }

    public void setPlayeras(List<Playera> playeras) {
        this.playeras = playeras;
    }
}
