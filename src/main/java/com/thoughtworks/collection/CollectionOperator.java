package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
    	// 选出给定区间中所有的数字
    	List<Integer> rangeList = new ArrayList<Integer>();
    	if(left < right){
    		for(int i = left; i <= right; i++){
        		rangeList.add(i);
        	}
    	} else {
    		for(int i = left; i >= right; i--){
        		rangeList.add(i);
    		}
    	}
    	return rangeList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
    	// 选出给定区间中所有的偶数
    	List<Integer> rangeEvenList = new ArrayList<Integer>();
    	if(left < right){
    		for(int i = left; i <= right; i++){
    			if(i %2 == 0){
    				rangeEvenList.add(i);
    			}
        	}
    	} else {
    		for(int i = left; i >= right; i--){
    			if(i %2 == 0){
    				rangeEvenList.add(i);
    			}
    		}
    	}
    	return rangeEvenList;
    }

    public List<Integer> popEvenElments(int[] array) {
    	// 选出给定数组区间中所有的偶数
        List<Integer> arrayEvenList = new ArrayList<Integer>();
        for(int i : array){
        	if(i % 2 == 0){
        		arrayEvenList.add(i);
        	}
        }
        return arrayEvenList;
    }

    public int popLastElment(int[] array) {
    	// 弹出集合最后一个元素
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
    	// 弹出两个集合的交集
    	List<Integer> firstList = new ArrayList<Integer>();
    	List<Integer> secondist = new ArrayList<Integer>();
    	for(int fa : firstArray){
    		firstList.add(fa);
    	}
    	for(int sa : secondArray){
    		secondist.add(sa);
    	}
    	firstList.retainAll(secondist);
    	return firstList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
    	// 将集合二中与集合一不同的元素加入集合一
    	List<Integer> firstList = new ArrayList<Integer>();
    	for(int fa : firstArray){
    		firstList.add(fa);
    	}
    	for(int sa : secondArray){
    		if(!firstList.contains(sa)){
    			firstList.add(sa);
    		}
    	}
    	return firstList;
    }
}