package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
    	//throw new NotImplementedException();
    	// 求leftBorder 和rightBorder之间的偶数和
    	int evenSum = 0;
    	if(leftBorder > rightBorder){
    		int temp = leftBorder;
    		leftBorder = rightBorder;
    		rightBorder = temp;	
    	}
    	for(int i = leftBorder; i <= rightBorder; i++){
    		if(i % 2 == 0){
    			evenSum += i;
    		}
    	}
    	return evenSum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
    	// 求leftBorder 和rightBorder之间的奇数和
    	int oddSum = 0;
    	if(leftBorder > rightBorder){
    		int temp = leftBorder;
    		leftBorder = rightBorder;
    		rightBorder = temp;	
    	}
    	for(int i = leftBorder; i <= rightBorder; i++){
    		if(i % 2 == 1){
    			oddSum += i;
    		}
    	}
    	return oddSum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
    	// 求数组中每个元素的3倍加2的和
        int tripleAndAddTwoSum =0;
    	for(int i=0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	tripleAndAddTwoSum += a.intValue()*3 + 2;
        }
		return tripleAndAddTwoSum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
    	// 求数组中奇数元素的3倍加2，偶数元素不变的数组
    	List<Integer>  tripleOfOddAndAddTwoList = new ArrayList<Integer>();
        for(int i=0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 == 1){
        		tripleOfOddAndAddTwoList.add(a*3 + 2) ;
        	} else{
        		tripleOfOddAndAddTwoList.add(a);
        	} 	
        }
		return tripleOfOddAndAddTwoList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        // 求数组中奇数元素的3倍加5的和
    	int processedOddsSum =0;
        for(int i =0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 ==1){
        	    processedOddsSum += a*3 + 5; 		
        	}
        }
        return processedOddsSum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
    	// 求数组中所有偶数组成的数组的中位数
        List<Integer> evenList = new ArrayList<Integer>();
        for(int i = 0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 ==0){
        		evenList.add(a);
        	}
	    }
        Collections.sort(evenList);
        int evenListSize = evenList.size();
        if(evenListSize % 2 == 0){
     	   return Double.valueOf((evenList.get(evenListSize / 2) + evenList.get(evenListSize / 2 - 1)) / 2.0 );
        } else{
     	   return Double.valueOf(evenList.get(evenListSize/2));
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {
    	// 求数组中所有偶数的平均数
    	Integer evenSum = 0;
    	Integer evenSize = 0;
    	for(int i = 0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 ==0){
        		evenSum += a;
        		evenSize += 1;
        	}
	    }
    	return (double)(evenSum /evenSize); 
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
    	// 求数组中所有偶数组成的数组是否包含某特定的数specialElment
    	List<Integer> evenList = new ArrayList<Integer>();
    	for(int i = 0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 ==0){
        		evenList.add(a);
        	}
	    }
    	return evenList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
    	// 找出数组中的所有偶数，从中剔除重复数据并返回
    	List<Integer> unrepeatedEvenList = new ArrayList<Integer>();
    	for(int i = 0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 ==0){
        		if(!unrepeatedEvenList.contains(a)){
        			unrepeatedEvenList.add(a);
        		}	
        	}
	    }
    	return unrepeatedEvenList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
    	// 排序数组 结果使数组偶数在递增在前，奇数递减在后
    	List<Integer> evenList = new ArrayList<Integer>();
    	List<Integer> oddList = new ArrayList<Integer>();
    	
    	for(int i = 0; i<arrayList.size(); i++){
        	Integer a = arrayList.get(i);
        	if(a % 2 ==0){
        		evenList.add(a);	
        	} else {
        		oddList.add(a);
        	}
    	}
    	Collections.sort(evenList);
    	Collections.reverse(oddList);
    	evenList.addAll(oddList);
    	
    	return evenList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
    	// 数组中前一个元素和后一个元素的和的3倍的数组
    	List<Integer>  processedList = new ArrayList<Integer>();
        for(int i=0; i<arrayList.size() - 1; i++){
        	processedList.add((arrayList.get(i) + arrayList.get(i+1)) * 3);
        }
		return processedList;
    }
}