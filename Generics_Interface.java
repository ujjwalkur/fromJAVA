package com.company;

interface MinMax<M extends Comparable<M>>{
    M min();
    M max();
}

class GenClass<M extends Comparable<M>> implements MinMax<M>{

    M[] val;
    GenClass(M[] m){
        this.val = m;
    }

    //return minimum value
    public M min(){
        M v = val[0];
        for (int i=1; i< val.length; i++)
            if (val[i].compareTo(v) < 0 ) v=val[i];
        return v;
    }

    //return maximum value
    public M max(){
        M v = val[0];
        for (int i=1; i< val.length; i++)
            if (val[i].compareTo(v) > 0 ) v=val[i];
            return v;
    }
}

public class Generics_Interface {
    public static void main(String[] args) {
        Integer ival[] = {5, 8, 9, 3, 7,};
        Character chr[] = {'p', 'r', 'w', 's'};

        GenClass intv = new GenClass(ival);
        GenClass charV = new GenClass(chr);

        System.out.println("Maximum value of ival : " +intv.max());
        System.out.println("Minimum value of intv : " + intv.min());

        System.out.println("maximum value of charV : " +charV.max());
        System.out.println("Minumum value of charV : " + charV.min());
    }
}
