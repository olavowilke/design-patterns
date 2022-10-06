package br.com.cod3r.state.pacman.states;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bla {


    public static void main(String[] args) {
        Appropriation appropriation1 = new Appropriation();
        appropriation1.setWhatever1("sha1");
        appropriation1.setWhatever2("sha2");
        Appropriation appropriation2 = new Appropriation();
        appropriation2.setWhatever1("sha1");
        appropriation2.setWhatever2("sha1");

        Res res1 = new Res();
        res1.setAppropriations(List.of(appropriation1, appropriation2));
        res1.setDate("date1");

        Res res2 = new Res();
        res2.setAppropriations(List.of(appropriation1, appropriation2));
        res2.setDate("date2");

        List<Res> res12 = List.of(res1, res2);

        System.out.println(res12);
    }
}
