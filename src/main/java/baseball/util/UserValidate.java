package baseball.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserValidate {
    public List<Integer> numberException(String number) {
        List<Integer> nums = new ArrayList<>();
        try {
            for (int i=0; i<number.length(); i++) {
                nums.add(Character.getNumericValue(number.charAt(i)));
            }
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요.");
            throw new IllegalArgumentException();
        }
        return nums;
    }




}
