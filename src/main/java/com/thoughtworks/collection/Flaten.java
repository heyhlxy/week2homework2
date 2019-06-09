package com.thoughtworks.collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
    	// 把二维数组变成一维数组
    	List<Integer> oneDimList = new ArrayList<Integer>();
    	for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				oneDimList.add(array[i][j]) ;
			}
		}
    	return oneDimList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
    	// 把二维数组变成一维数组,消除重复,按照第一次出现的顺序排列最后的输出结果
    	List<Integer> unrepeatedOneDimList = new ArrayList<Integer>();
    	for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(!unrepeatedOneDimList.contains(array[i][j])){
					unrepeatedOneDimList.add(array[i][j]) ;
				}	
			}
		}
    	return unrepeatedOneDimList;
    }
}