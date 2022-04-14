package com.example.kunde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    public final List<Kunde> allekunder=new ArrayList<>();

    @PostMapping("/lagre")

    public void lagreKunder(Kunde innkunde){
        allekunder.add(innkunde);
    }
    @GetMapping("/hentalle")

    public List<Kunde> hentalle(){
        return allekunder;
    }
}
