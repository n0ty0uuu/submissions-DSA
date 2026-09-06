class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set  = new HashSet<>();

        boolean tell = false;
        for(int num : nums){
            tell = set.add(num);

            if(tell == false){
                return true;
            }else{
                tell = false;
            }
        }
        return false;
    }
}