import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//addsumLT001
class addsum
{
    void main()
    {
        int nums[]={2,7,3,4,5,6};
        int target=9;
        int i,j=0;
        for(i=0; i<nums.length; i++)
        {
            for(j=i+1; j<nums.length; j++)
            {
                if((nums[i]-target)+nums[j]==0)
                {
                    i+=nums.length;
                    break;
                }
            }
        }
        System.out.println(i-nums.length-1+" "+j);
    }
}