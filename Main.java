public class Main
{
    public static void main(String[] args)
    {
        JumpGameII jg2 = new JumpGameII();

        /*
            Input: nums = [2,3,1,1,4]
            Output: 2
            Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
         */
        System.out.println(jg2.jump(new int[]{2, 3, 1, 1, 4}));

        /*
            Input: nums = [2,3,0,1,4]
            Output: 2
         */
        System.out.println(jg2.jump(new int[]{2, 3, 0, 1, 4}));
    }
}
