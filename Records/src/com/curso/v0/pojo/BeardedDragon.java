package com.curso.v0.pojo;

public final class BeardedDragon {
    
	private final boolean fun; 

    public BeardedDragon(boolean fun) {
        this.fun = fun;
    }

    public boolean fun() { //getter
        return fun;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BeardedDragon that = (BeardedDragon) obj;
        return fun == that.fun;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(fun);
    }

    @Override
    public String toString() {
        return "BeardedDragon[fun=" + fun + "]";
    }
}
