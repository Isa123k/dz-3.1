package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nums = {12.2, -15.4, 43.2, -11.1, 32.23, 19.9, -7.2, 8.8, -16.6, 15.7, -72.8, -22.3, 28.13, 14.4, -18.0};
      double totalSuma = 0.0;
      int kolichestvo = 0;
      boolean isNegative = false;

        for (double sum :nums ) {
            if (sum < 0 ){
                isNegative = true;
            }
            else if (isNegative){
                totalSuma = totalSuma + sum;
                kolichestvo++;
            }
        }
        System.out.println("Cumma:" + totalSuma);
        System.out.println("количество:" + kolichestvo);

        double answer = totalSuma / kolichestvo;
        System.out.println("oтвет: " + answer );
        }

    }

