package study;


import java.util.ArrayList;
//POJO
public class HW32 {
    private String name;
    private int number;

    HW32(final String name, final int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HW32)) return false;

        HW32 hw32 = (HW32) o;

        if (number != hw32.number) return false;
        if (name != null ? !name.equals(hw32.name) : hw32.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        return result;
    }


    //main()
    public static void main(String[] args) {
        HW32 ob1 = new HW32("aaa", 1);
        HW32 ob2 = new HW32("bbb", 2);
        HW32 ob3 = new HW32("ccc", 3);
        HW32 ob4 = new HW32("ddd", 4);
        HW32 ob5 = new HW32("ggg", 1);
        HW32 ob6 = new HW32("hhh", 3);
        //arrays
        ArrayList<HW32> ar1 = new ArrayList<>();
        ar1.add(ob1);
        ar1.add(ob2);
        ar1.add(ob1);
        ar1.add(ob1);
        ar1.add(ob6);
        // HW32[] ar1 = null;
        ArrayList<HW32> ar2 = new ArrayList<>();
        ar2.add(ob1);
        ar2.add(ob2);
        ar2.add(ob2);
        ar2.add(ob3);
        ar2.add(ob3);
        ar2.add(ob3);
        ar2.add(ob4);
        ar2.add(ob5);

        //inition object class methods
        Armet kkk = new Armet();
        //merge method
        kkk.merge(ar1, ar2);

//inner join method
        kkk.innerJoin(ar1, ar2);

        //outer join
        kkk.outerJoin(ar1, ar2);

        //getInnerAndOuter
        kkk.getInnerAndOuterHW32(ar1, ar2);

        //getUniqueNumberOfSameName
        kkk.getUniqueNumberOfSameName(ar1, ar2);

    }

}
