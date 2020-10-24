package com.techknow.algoexpert.hackerrank.string;

public class StringOddEven {

    public static void main(String[] args) {

        //Scanner sc  = new Scanner(System.in);

        //String valueString = sc.next();

        System.out.println(subsequent("21462675756"));
    }

    private static String subsequent(String valueString) {

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <=valueString.length();i++) {
            for(int j = i-1; j <i;j++) {
                Character c1 = valueString.charAt(i);
                Character c2 = valueString.charAt(j);
                int s1 = Integer.parseInt(c1.toString());
                int s2 = Integer.parseInt(c2.toString());

                if (s1 % 2 == 0 && s2 % 2 == 0) {
                    sb.append(s1).append("*");
                } else if (s1 % 2 != 0 && s2 % 2 != 0) {
                    sb.append(s1).append("-");
                } else {
                    sb.append(s1);
                }
            }
        }

//sb.append(valueString.charAt(valueString.length()-1));
return sb.toString();

    }
}
