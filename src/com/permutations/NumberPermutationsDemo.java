package com.permutations;

import java.util.*;

public class NumberPermutationsDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permutations(nums);
    }

    private static List<List<Integer>> permutations(int[] nums) {
    List<List<Integer>> resultList = new ArrayList<>();
    backtrack(resultList,new ArrayList<>(),nums);
    return resultList;
    }

    private static void backtrack(List<List<Integer>> resultList, ArrayList<Object> tempList, int[] nums) {
        System.out.println("begin---backtrack resultList: " + resultList+" tempList: " + tempList);

        if (tempList.size()==nums.length){
            resultList.add(new ArrayList(tempList));
            return;
        }
        for(int number:nums){
            System.out.println("foor loop begin number "+number);
            if(tempList.contains(number))
                continue;

            tempList.add(number);
            System.out.println("after adding number "+number+" to tempList: " + tempList);
            backtrack(resultList,tempList,nums);
            System.out.println("after---backtrack :");
            tempList.remove(tempList.size()-1);
            System.out.println("after---removing from tempList: "+tempList);
        }
    }
}
