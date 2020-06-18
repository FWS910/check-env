package com.twschool.practice;

public class FizzBuzz {
    public String say(int num) {
        if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0){
            return "FizzBuzzWhizz";
        }else if (num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }else if (num % 3 == 0 && num % 7 == 0){
            return "FizzWHizz";
        }
        else if (num % 5 == 0){
            return "Buzz";
        }else if (num % 7 == 0){
            return "Whizz";
        }
        return String.valueOf(num);
    }
}
