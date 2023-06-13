package com.example.slmfinalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmFinalExamHammingCalc {

    String string;
    @RequestMapping("api/hamming")
    public int hamcalc(@RequestParam String string){
        int cnt=0;
       this.string=string;
       for (char c: string.toCharArray()){
           if (c != '0') {
               cnt++;
           }
       }
        return cnt;
    }


    @RequestMapping("api/hamming/previous")
    public String prevnumber(){
        String currentnumb=string;
        return currentnumb;
    }

}
