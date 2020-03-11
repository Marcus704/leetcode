class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int num:A)
            sum += num;
        if(sum % 3 != 0)
            return false;
        int num = 0, cnt = 0;
        sum = sum / 3;
        for(int i = 0; i < A.length - 1; i++){
            num += A[i];
            if(num == sum){
                num = 0;
                if(++cnt >= 2)
                    return true;
            }
        }
        return false;
    }
}