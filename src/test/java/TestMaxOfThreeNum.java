import com.blp.generics.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class TestMaxOfThreeNum {
    @Test
    public void checkMaximumNumber(){
        int max = FindMaximum.getMaximum(50,20,5);
        Assert.assertEquals(50,max);
    }
    @Test
    public void checkMaximumNumber1(){
        int max = FindMaximum.getMaximum(20,50,5);
        Assert.assertEquals(50,max);
    }
    @Test
    public void checkMaximumNumber2(){
        int max = FindMaximum.getMaximum(20,5,50);
        Assert.assertEquals(50,max);
    }
}
