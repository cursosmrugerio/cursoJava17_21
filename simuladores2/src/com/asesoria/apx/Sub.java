package com.asesoria.apx;

class Super {
    private int a;

    protected Super(int a) {
        this.a = a;
    }
    
    Super(){}
}

class Sub extends Super {

    public Sub(int a) {
        super(a);
    }

    public Sub() {
        //this.a = 5;
    }
}