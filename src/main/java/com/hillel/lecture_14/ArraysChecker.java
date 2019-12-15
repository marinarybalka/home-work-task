package com.hillel.lecture_14;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


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
        String result = "";
        for (int i = list.size() -1; i >= 0; i--) {
            if(list.get(i).length() > result.length()) {
                result = list.get(i);
            }
        }
        return result;
    }

    public List<String> changeIndex(List<String> list) {

        String oldItem = list.get(1);
        String newItem = list.get(3);
        list.set(1, newItem);
        list.set(3, oldItem);
        return list;
    }

    public List<String> removeDuplicates(List<String> list) {
        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (unique.indexOf(list.get(i)) == -1) {
                unique.add(list.get(i));
            }
        }
        return unique;
    }

    public List<String> sortList(List<String> list) {
        TreeSet <String>tree = new TreeSet<String>();
        for (int i = 0; i < list.size(); i++) {
            tree.add(list.get(i));
        }
       return new ArrayList<String>(tree);
    }
}
