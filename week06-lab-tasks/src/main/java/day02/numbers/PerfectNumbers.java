package day02.numbers;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number){
        List<Integer> dividers=new ArrayList<>();
        for(int i  =1;i<=number/2;++i){
            if(number%i==0){
                dividers.add(i);
            }
        }
        int tmp = 0;
        for (int i :
                dividers) {
            tmp+=i;
        }
        if(tmp==number){
            return true;
        }
        return false;
    }
}
