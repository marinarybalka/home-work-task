package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public List<String> getReversList(List<String> list) {
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = list.size() -1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public String getLongestString(List<String> list) {

//        TODO implements result
        String result = "";
        for (int i = list.size() -1; i >= 0; i--) {
            if(list.get(i).length() > result.length()) {
                result = list.get(i);
            }
        }
        return result;
    }

    public List<String> changeIndex(List<String> list) {

//        TODO implements result

        return list;
    }

    public List<String> removeDuplicates(List<String> list) {

//        TODO implements result

        return list;
    }

    public List<String> sortList(List<String> list) {

//        TODO implements result

        return list;
    }
}
