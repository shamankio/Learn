package study;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FishTest {
    Fish fish1 = new Fish.Builder().setName("fish1").setColor("red").setType("guppy").build();
    Fish fish2 = new Fish.Builder().setName("fish2").setColor("yellow").setType("brabus").build();
    Fish fish3 = new Fish.Builder().setName("fish3").setColor("white").setType("shark").build();
    Fish fish4 = new Fish.Builder().setName("fish4").setColor("black").setType("whale").build();
    Fish[] ar1 = new Fish[]{fish1, fish2};
    Fish[] ar2 = new Fish[]{fish1, fish2, fish3, fish4};

    @Test
    public void mergeArrayEq() {
        Fish[] expectedArrayMerge = new Fish[]{fish1,fish2, fish3, fish4};
        //initialize class
        ArrayHelper resourse = new ArrayHelper();
        ServiceDelegate testObject = new ServiceDelegate(resourse);
        Fish[] retArray = testObject.mergeFish(ar1, ar2);
        Assert.assertArrayEquals(retArray, expectedArrayMerge);
    }
    @Test
    public void mergeArrayEqMoc(){
        Fish[] expectedArrayMerge = new Fish[]{fish1,fish2,fish3, fish4};
        ArrayHelper resourse = mock(ArrayHelper.class);
        when(resourse.mergeFish(ar1, ar2)).thenReturn(expectedArrayMerge);
        ServiceDelegate testObject = new ServiceDelegate(resourse);
        Fish[] retArray = testObject.mergeFish(ar1, ar2);
        Assert.assertArrayEquals(retArray, expectedArrayMerge);


    }



}
