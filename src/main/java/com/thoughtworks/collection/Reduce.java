package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.security.Signature;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
    	// 获取数组中的最大值
         Collections.sort(arrayList);
         return arrayList.get(arrayList.size() - 1);
    }

    public double getMinimum() {
    	// 获取数组中的最小值
        Collections.sort(arrayList);
        return arrayList.get(0);
    }

    public double getAverage() {
    	// 获取数组的平均值
    	int sum = 0;
    	for (int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i);
		}
    	return (sum * 1.0 / arrayList.size());
    }

    public double getOrderedMedian() {
    	// 获取数组中位数
         Collections.sort(arrayList);
         int arrayListSize = arrayList.size();
         if(arrayListSize % 2 == 0){
      	   return (arrayList.get(arrayListSize / 2) + arrayList.get(arrayListSize / 2 - 1)) / 2.0;
         } else{
      	   return Double.valueOf(arrayList.get(arrayListSize/2));
         }
    }

    public int getFirstEven() {
    	//获取数组中第一个偶数
    	int i = 0;
    	for (i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i) % 2 ==0){
				break;
			}
		}
    	return arrayList.get(i);
    }

    public int getIndexOfFirstEven() {
    	//获取数组中第一个偶数的下标
    	int i = 0;
    	for (i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i) % 2 ==0){
				break;
			}
		}
    	return i;
    }

    public boolean isEqual(List<Integer> comArrayList) { //arrayList
    	// 判断两个数组是否相等
    	List<Integer> cmpArrayList = new ArrayList<Integer>(comArrayList);
		Collections.sort(arrayList);
		Collections.sort(cmpArrayList);
		System.out.println(arrayList.toString());
		System.out.println(cmpArrayList.toString());
		return arrayList.toString().equals(cmpArrayList.toString());
    }

    public Double getMedianInLinkList(SingleLink<Integer>  singleLink) {
    	// 获取链表的中位数
    	Collections.sort(arrayList);
        int arrayListSize = arrayList.size();
        if(arrayListSize % 2 == 0){
     	    return (arrayList.get(arrayListSize / 2) + arrayList.get(arrayListSize / 2 - 1)) / 2.0;
        } else{
     	    return Double.valueOf(arrayList.get(arrayListSize/2));
        }   
    }

    public int getLastOdd() {
    	// 获取数组中最后一个奇数
    	int i = 0;
    	for (i = arrayList.size() - 1; i > 0; i--) {
			if(arrayList.get(i) % 2 ==1){
				break;
			}
		}
    	return arrayList.get(i);
    }

    public int getIndexOfLastOdd() {
    	// 获取数组中最后一个奇数的下标
    	int i = 0;
    	for (i = arrayList.size() - 1; i > 0; i--) {
			if(arrayList.get(i) % 2 ==1){
				break;
			}
		}
    	return i;
    }
}