package com.example.slmfinalexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlmFinalExamHammingCalc {
    @RequestMapping("api/hamming")
    public int hamcalc(@RequestParam int string){
        int cnt=0;
        while(string!=0){
            if (string%10!=0){
                cnt++;
            }
            string/=10;
        }
        return cnt;
    }

}
