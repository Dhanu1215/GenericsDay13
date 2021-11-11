import com.blp.generics.FindMaxString;
import org.junit.Assert;
import org.junit.Test;

public class TestOfMaxString {
    @Test
    public void checkMaximumString(){
        String max = FindMaxString.getMaximumString("Banana","Apple","Peach");
        Assert.assertEquals("Banana",max);
    }
    @Test
    public void checkMaximumString1(){
        String max = FindMaxString.getMaximumString("Apple","Banana","Peach");
        Assert.assertEquals("Banana",max);
    }
    @Test
    public void checkMaximumString2(){
        String max = FindMaxString.getMaximumString("Apple","Peach","Banana");
        Assert.assertEquals("Peach",max);
    }
}
