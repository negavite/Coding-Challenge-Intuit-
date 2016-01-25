public class Sort
{
	public static void main(String[] args) 
	{
		int[] nums = new int[]{1,10,5,63,29,71,10,12,44,29,10,-1};
		for( int i = 0; i<nums.length; i++)
		{
			for(int j = i + 1; j <nums.length; j++)
			{
				if(nums[j] < nums[i])
				{
					int switcher = nums[i];
					nums[i] = nums[j];
					nums[j] = switcher;
				}
			}
			System.out.print(nums[i] + " ");
		}	
	}
}