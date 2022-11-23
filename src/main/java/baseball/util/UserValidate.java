package baseball.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserValidate {
    public List<Integer> readNumberException(String number) {
        try {
            List<Integer> nums = numberException(number);
            numberRangeException(nums);
            zeroContainsException(nums);
            overlapException(nums);
            return nums;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> numberException(String number) {
        List<Integer> nums = new ArrayList<>();
        try {
            for (String num : number.split("")) {
                nums.add(Integer.valueOf(num));
            }
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요.");
            throw new IllegalArgumentException();
        }
        return nums;
    }

    public void overlapException(List<Integer> nums) {
        Set<Integer> set = new HashSet<>(nums);
        if (set.size() != 3) {
            System.out.println("[ERROR] 중복되지 않는 숫자를 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public void zeroContainsException(List<Integer> nums) {
        if (nums.contains(0)) {
            System.out.println("[ERROR] 0을 제외하고 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public void numberRangeException(List<Integer> nums) {
        if (nums.size() != 3) {
            System.out.println("[ERROR] 3자리 숫자를 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }


}
