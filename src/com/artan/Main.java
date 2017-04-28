package com.artan;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        boolean answer = palindromeCheck("antntttan");
        if(answer){
            System.out.println("Yes, we can create a palindrome with these characters.");
        }else{
            System.out.println("No, we can not create a palindrome with these characters!");
        }
    }

    private static boolean palindromeCheck(String input){

        HashMap<Character, Integer> map = new HashMap<>();
        int odds = 0;

        for(int i=0; i<input.length(); i++){
            if(map.get(input.charAt(i)) == null){
                map.put(input.charAt(i), 1);
            }else{
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }

        for(Integer value: map.values()){
            if(value%2 != 0){
                odds++;
            }
        }

        if(odds>1){
            return false;
        }else {
            return true;
        }
    }
}
