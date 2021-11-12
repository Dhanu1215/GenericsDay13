import com.blp.generics.FindMaximumFloat;
import org.junit.Assert;
import org.junit.Test;

public class TestMaxOfFloat {

    @Test
    public void checkMaximumFloatValue(){
        float max = FindMaximumFloat.getMaximumFloat(5.5f,3.4f,2.5f);
        Assert.assertEquals(5.5, max,0);
    }
    @Test
    public void checkMaximumFloatValue1(){
        float max = FindMaximumFloat.getMaximumFloat(3.4f,5.5f,2.5f);
        Assert.assertEquals(5.5, max,0);
    }
    @Test
    public void checkMaximumFloatValue2(){
        float max = FindMaximumFloat.getMaximumFloat(3.4f,2.5f,5.5f);
        Assert.assertEquals(5.5, max,0);
    }
}
