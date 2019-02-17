package com.company;

import com.company.animals.Animal;
import com.company.animals.Flying;

public class Main {

    public static void main(String[] args) {
        Init init = new Init();

        Animal fl = new Flying();

        int[] arr = fl.move();

        System.out.println(arr[0] + "  " + arr[1]);
    }
}
