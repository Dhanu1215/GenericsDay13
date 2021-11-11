import com.blp.generics.FindMaximumInteger;
import org.junit.Assert;
import org.junit.Test;

public class TestMaxOfThreeNum {
    @Test
    public void checkMaximumNumber(){
        int max = FindMaximumInteger.getMaximum(50,20,5);
        Assert.assertEquals(50,max);
    }
    @Test
    public void checkMaximumNumber1(){
        int max = FindMaximumInteger.getMaximum(20,50,5);
        Assert.assertEquals(50,max);
    }
    @Test
    public void checkMaximumNumber2(){
        int max = FindMaximumInteger.getMaximum(20,5,50);
        Assert.assertEquals(50,max);
    }
}
