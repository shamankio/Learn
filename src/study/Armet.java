package study;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Armet {

     ArrayList<HW32> merge(ArrayList<HW32>ar1,ArrayList<HW32>ar2){
        ArrayList <HW32>ar = new ArrayList<HW32>();
        System.out.println("merge:");
        ar.addAll(ar1);
        boolean pp = false;
        for (HW32 c : ar2) {
            for (HW32 d:ar1) {

                if (c.equals(d)) {
                    pp = false;
                    break;
                }
                pp = true;
            }
            if (pp) {
                ar.add(c);
                pp = false;
            }
        }


        for (HW32 t:ar) {
            System.out.printf("name=%1$5s number=%2$5s%n", t.getName(), t.getNumber());
        }
        return ar;

    }

    ArrayList<HW32> innerJoin(ArrayList<HW32>ar1,ArrayList<HW32>ar2){
        System.out.println("inner join:");
        ArrayList <HW32>ijo = new ArrayList<HW32>();
        boolean pp1 = false;
        for (HW32 c1:ar2) {

            for (HW32 d1:ar1) {
                if (c1.equals(d1)) {
                    pp1 = true;
                    break;
                }

            }
            if (pp1) {
                ijo.add(c1);
                pp1 = false;
            }

        }


         for (HW32 t1:ijo) {
            System.out.printf("name=%1$5s number=%2$5s%n", t1.getName(), t1.getNumber());
        }
        return ijo;
    }

    ArrayList<HW32> outerJoin(ArrayList<HW32>ar1,ArrayList<HW32>ar2){
        System.out.println("outer join:");
        ArrayList <HW32>ojo = new ArrayList<HW32>();
        boolean pp2 = false;
        for (HW32 c2:ar2) {
            for (HW32 d2:ar1) {
                if (c2.equals(d2)) {
                    pp2 = false;
                    break;
                } else {
                    if (!(c2.equals(d2))) {
                        pp2 = true;
                    }
                }
            }
            if (pp2) {
                ojo.add(c2);

            }
        }

        for (HW32 t3:ojo) {
            System.out.printf("name=%1$5s number=%2$5s%n", t3.getName(), t3.getNumber());
        }
        return ojo;
    }
// key = object number, object=ArrayList
    Map<Integer,ArrayList<HW32>> getInnerAndOuterHW32(ArrayList<HW32>ar1,ArrayList<HW32>ar2){
        System.out.println("getInnerAndOuter metod");
        Map<Integer,ArrayList<HW32>>innerAndOuterHW32=new HashMap<Integer,ArrayList<HW32>>();
        //add list
        ArrayList<HW32> commonArray = new ArrayList<HW32>();
        commonArray.addAll(ar1);
        commonArray.addAll(ar2);
        for(HW32 t1:commonArray){
            ArrayList<HW32>mapArray=innerAndOuterHW32.get(t1.getNumber());
            if(mapArray==null){
                mapArray=new ArrayList<HW32>();
                mapArray.add(t1);
               innerAndOuterHW32.put(t1.getNumber(),mapArray) ;
            }
             else {
                mapArray.add(t1);
            }
        }
        //get array

        for (ArrayList<HW32> hw32ArrayList : innerAndOuterHW32.values()) {

            for (HW32 t:hw32ArrayList) {
                System.out.printf("name=%1$5s number=%2$5s%n", t.getName(), t.getNumber());
            }
            System.out.println();

        }

        return innerAndOuterHW32;
    }

    Map<Integer,HashSet<HW32>> getUniqueNumberOfSameName(ArrayList<HW32>ar1,ArrayList<HW32>ar2){
        System.out.println("getUniqueNumberOfSameName metod");
        Map<Integer,HashSet<HW32>>UniqueNumberOfSameName=new HashMap<Integer,HashSet<HW32>>();
        //add list
        HashSet<HW32> commonArray = new HashSet<HW32>();
        commonArray.addAll(ar1);
        commonArray.addAll(ar2);
        for(HW32 t1:commonArray){
            HashSet<HW32>mapArray=UniqueNumberOfSameName.get(t1.getNumber());
            if(mapArray==null){
                mapArray=new HashSet<HW32>();
                mapArray.add(t1);
                UniqueNumberOfSameName.put(t1.getNumber(),mapArray) ;
            }
            else {
                mapArray.add(t1);
            }
        }
        //get array

        for (HashSet<HW32> hw32ArrayList : UniqueNumberOfSameName.values()) {

            for (HW32 t:hw32ArrayList) {
                System.out.printf("name=%1$5s number=%2$5s%n", t.getName(), t.getNumber());
            }
            System.out.println();

        }

        return UniqueNumberOfSameName;
    }

}
