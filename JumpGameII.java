public class JumpGameII
{
    public int jump(int[] nums)
    {
        int farthest = 0;
        int currEnd = 0;
        int jump = 0;

        for (int i = 0; i < nums.length-1; i++)
        {
            farthest = Math.max(farthest, i+nums[i]);

            if (i == currEnd)
            {
                currEnd = farthest;
                jump++;
            }
        }
        return jump;
    }
}
