package com.java.arrays;

public class ArrayCodingQuestions {

    public static int findHighetPrice(int[] productPrices){
            int max = productPrices[0];

            for(int i = 1; i < productPrices.length; i++){
                if(productPrices[i] > max){
                    max = productPrices[i];
                }
            }
            return max;
        }

    public static void main(String[] args){
        int[] productPrices = {10,30,200,93,92};
        System.out.println(ArrayCodingQuestions.findHighetPrice(productPrices));
    }
}
