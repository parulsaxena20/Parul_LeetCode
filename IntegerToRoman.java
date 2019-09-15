import java.lang.*;

class Solution {
    public String intToRoman(int num) {
        String roman_num = "";
        int[] val = new int[]{
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4,
            1
            };
        String[] symbols = new String[]{
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
            };
        int i = 0;
        while(num > 0)
        {
            double divided = Math.floor(num / val[i]);
            for(int j = 0;j<divided;j++)
            {
                roman_num += symbols[i];
                num -= val[i];
            }
            i++;
        }
        return roman_num;
    }
}