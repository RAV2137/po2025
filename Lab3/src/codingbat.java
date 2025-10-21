public class codingbat {

    public static void main(String[] args) {
    }

    public boolean monkeyTrouble ( boolean aSmile, boolean bSmile){
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

    }
    public String front22(String str) {
        if (str.length() ==0){
            return str;
        }
        else if (str.length() == 1){
            return str.substring(0) + str +  str.charAt(0) ;
        }
            return str.substring(0, 2) + str + str.substring(0, 2);
        }

    public int[] maxEnd3(int[] nums) {
        int max=0;
        if(nums[0]> nums[nums.length-1]){
            max=nums[0];
        }
        else{
            max = nums[nums.length-1];
        }
        for (int i =0; i<nums.length;i++){
            nums[i]=max;
        }
        return nums;
    }
    public boolean hasBad(String str) {
        char[] word= {'b','a','d'};
        char[] str_char= str.toCharArray();
        if (str.length()<3){
            return false;
        }
        if ( str_char[0]==word[0] && str_char[1]==word[1] && str_char[2]==word[2]){
            return true;
        }
        if( str.length() >= 4 && str_char[1]==word[0] && str_char[2]==word[1] && str_char[3]==word[2]){
            return true;
        }
        return false;
    }


}