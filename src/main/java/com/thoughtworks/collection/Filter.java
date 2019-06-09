package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
//import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
    	// 求数组中的偶数
    	List<Integer> evenList = new ArrayList<Integer>();
    	for(Integer a : array){
    		if(a % 2 == 0){
    			evenList.add(a);
    		}
    	}
    	return evenList;
    }

    public List<Integer> filterMultipleOfThree() {
    	// 求数组中3的倍数
    	List<Integer> multipleOfThreeList = new ArrayList<Integer>();
    	for(Integer a : array){
    		if(a % 3 == 0){
    			multipleOfThreeList.add(a);
    		}
    	}
    	return multipleOfThreeList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
    	// 求两数组的公共元素
    	List<Integer> commontList = new ArrayList<Integer>(firstList);
    	commontList.retainAll(secondList);
    	return commontList;
    }

    public List<Integer> getDifferentElements() {
    	//去除数组中的重复元素
    	List<Integer> differentList = new ArrayList<Integer>();
    	for (int i = 0; i < array.size(); i++) {
    		if(!differentList.contains(array.get(i))){
    			differentList.add(array.get(i));
    		}
		}
    	return differentList;
    }
}