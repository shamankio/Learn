package study;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.*;


public class ArmetTest {
    HW32 ob1 = new HW32("aaa", 1);
    HW32 ob2 = new HW32("bbb", 2);
    HW32 ob3 = new HW32("ccc", 3);
    HW32 ob4 = new HW32("ddd", 4);
    HW32 ob5 = new HW32("eee", 5);




    @Test
    public void mergeArrayEq() {
        ArrayList<HW32> ar1 = new ArrayList<>();
        ar1.add(ob1);
        ar1.add(ob2);
        ArrayList<HW32> ar2 = new ArrayList<>();
        ar2.add(ob1);
        ar2.add(ob2);
        ar2.add(ob3);
        ar2.add(ob4);
        ar2.add(ob5);

        HW32[] expectedArrayMerge = new HW32[]{ob1, ob2, ob3, ob4, ob5};
        //initialize class
        Armet testObject = new Armet();
        ArrayList<HW32> retArray = new ArrayList<>();
        retArray.addAll(testObject.merge(ar1, ar2));
        Assert.assertArrayEquals(retArray.toArray(), expectedArrayMerge);
    }

    @Test
    public void innerJoinArrayEq() {
        ArrayList<HW32> ar1 = new ArrayList<>();
        ar1.add(ob1);
        ar1.add(ob2);
        ArrayList<HW32> ar2 = new ArrayList<>();
        ar2.add(ob1);
        ar2.add(ob2);
        ar2.add(ob3);
        ar2.add(ob4);
        ar2.add(ob5);
        HW32[] expectedArrayIJoin = new HW32[]{ob1, ob2};
        //initialize class
        Armet testObjectIJ = new Armet();
        ArrayList<HW32> retArrayIJ = new ArrayList<>();
        retArrayIJ.addAll(testObjectIJ.innerJoin(ar1, ar2));
        Assert.assertArrayEquals(retArrayIJ.toArray(), expectedArrayIJoin);
    }

    @Test
    public void outerJoinArrayEq() {
        ArrayList<HW32> ar1 = new ArrayList<>();
        ar1.add(ob1);
        ar1.add(ob2);
        ArrayList<HW32> ar2 = new ArrayList<>();
        ar2.add(ob1);
        ar2.add(ob2);
        ar2.add(ob3);
        ar2.add(ob4);
        ar2.add(ob5);
        HW32[] expectedArrayOJoin = new HW32[]{ob3, ob4, ob5};
        //initialize class
        Armet testObjectOJ = new Armet();
        ArrayList<HW32> retArrayOJ = new ArrayList<>();
        retArrayOJ.addAll(testObjectOJ.outerJoin(ar1, ar2));
        Assert.assertArrayEquals(retArrayOJ.toArray(), expectedArrayOJoin);
    }

    @Test
    public void ArEqAr() {
        HW32[] ar1 = new HW32[]{ob1, ob2, ob3, ob4};
        HW32[] ar2 = new HW32[]{ob1, ob2, ob3, ob4};
        //initialize class
        Assert.assertArrayEquals(ar1, ar2);
    }

    @Test
    public void Ar1EqMaxValue() {
        HW32[] ar1 = new HW32[]{ob1, ob2, ob3, ob4};

        //initialize class
        Assert.assertEquals(ar1.length, Integer.MAX_VALUE);
    }

    @Test
    public void Ar2EqMaxValue() {
        HW32[] ar2 = new HW32[]{ob1, ob2, ob3, ob4};

        //initialize class
        Assert.assertEquals(ar2.length, Integer.MAX_VALUE);
    }
//mocito test
    @Test
    public void mergeArrayMoc() {
        ArrayList<HW32> ar1 = new ArrayList<>();
        ArrayList<HW32> ar2 = new ArrayList<>();
        ArrayList<HW32> retArray = new ArrayList<>();
        ArrayList<HW32> expectedArrayMerge = new ArrayList<HW32> ();
        System.out.println(expectedArrayMerge.size());
        Armet resourse = mock(Armet.class);
        when(resourse.merge(ar1, ar2)).thenReturn(expectedArrayMerge);
        Assert.assertArrayEquals(expectedArrayMerge.toArray(),retArray.toArray());
    }
    @Test
    public void innerJoinArrayMoc() {
        ArrayList<HW32> ar1 = new ArrayList<>();
        ArrayList<HW32> ar2 = new ArrayList<>();
        ArrayList<HW32> expectedArray = new ArrayList<HW32> ();
        Armet resourse = mock(Armet.class);
        when(resourse.innerJoin(ar1, ar2)).thenReturn(expectedArray);
        ArrayList<HW32> retArray = new ArrayList<>();
        retArray.addAll(resourse.innerJoin(ar1, ar2));
        Assert.assertArrayEquals(retArray.toArray(),expectedArray.toArray());
    }
    @Test
    public void outerJoinArrayMoc() {
        ArrayList<HW32> ar1 = new ArrayList<>();
        ArrayList<HW32> ar2 = new ArrayList<>();
        ArrayList<HW32> expectedArray = new ArrayList<HW32> ();
        Armet resourse = mock(Armet.class);
        when(resourse.outerJoin(ar1, ar2)).thenReturn(expectedArray);
        ArrayList<HW32> retArray = new ArrayList<>();
        retArray.addAll(resourse.outerJoin(ar1, ar2));
        Assert.assertArrayEquals(retArray.toArray(),expectedArray.toArray());
    }
    @Test
    public void getInnerAndOuterHW32Test(){
        ArrayList<HW32> ar1 = new ArrayList<>();
        ArrayList<HW32> ar2 = new ArrayList<>();
        Map<Integer,ArrayList<HW32>>expectedArray=new HashMap<>();
        Armet resorce = mock(Armet.class);
        when(resorce.getInnerAndOuterHW32(ar1,ar2)).thenReturn(expectedArray);
        Map<Integer,ArrayList<HW32>> retArray=new HashMap<Integer, ArrayList<HW32>>();
        retArray.putAll(resorce.getInnerAndOuterHW32(ar1,ar2));
        Assert.assertEquals(expectedArray.size(),retArray.size());
    }
    @Test
    public void getUniqueNumberOfSameNameTest(){
        ArrayList<HW32> ar1 = new ArrayList<>();
        ArrayList<HW32> ar2 = new ArrayList<>();
        Map<Integer,HashSet<HW32>>expectedArray=new HashMap<Integer,HashSet<HW32>>();
        Armet resorce = mock(Armet.class);
        when(resorce.getUniqueNumberOfSameName(ar1, ar2)).thenReturn(expectedArray);
        Map<Integer,HashSet<HW32>> retArray=new HashMap<Integer,HashSet<HW32>>();
        retArray.putAll(resorce.getUniqueNumberOfSameName(ar1,ar2));
        Assert.assertEquals(expectedArray.size(),retArray.size());
    }
}
