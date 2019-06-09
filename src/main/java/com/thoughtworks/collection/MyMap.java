package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
    	// 将集合A中得元素映射成集合B中的元素
        List<Integer> tripleList = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
			tripleList.add(array.get(i) * 3);
		}
        return tripleList;
    }

    public List<String> mapLetter() {
    	// 数字映射为字母
    	List<String> letterList = new ArrayList<String>();
    	for (int i = 0; i < array.size(); i++) {
			letterList.add(letters[array.get(i) - 1]);
		}
    	return letterList;
    }

    public List<String> mapLetters() {
    	// 字母表映射
    	List<String> lettersList = new ArrayList<String>();
    	for (int i = 0; i < array.size(); i++) {
			if(array.get(i) >= 26){
				if(array.get(i) % 26 == 0){
					lettersList.add(letters[array.get(i) / 52 - 1]+ letters[25]);
				} else {
					lettersList.add(letters[array.get(i) / 52] + letters[array.get(i) % 26 - 1]);
				}	
			} else {
				lettersList.add(letters[array.get(i) - 1]);
			}
		}
    	return lettersList;
    }

    public List<Integer> sortFromBig() {
    	// 从大到小排序
    	Collections.reverse(array);
    	return array;
    }

    public List<Integer> sortFromSmall() {
    	// 从小到大排序
    	Collections.sort(array);
    	return array;
    }
}