package br.com.cod3r.state.pacman.states;

import java.util.List;

public class Res {


    private List<Appropriation> appropriations;
    private String date;

    public List<Appropriation> getAppropriations() {
        return appropriations;
    }

    public void setAppropriations(List<Appropriation> appropriations) {
        this.appropriations = appropriations;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
