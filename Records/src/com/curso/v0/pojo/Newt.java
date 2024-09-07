package com.curso.v0.pojo;

public final class Newt {

	private final long size;

	public Newt(long size) {
		this.size = size;
	}

	public long size() {
		return size;
	}

//	public void setSize(long size) {
//		this.size = size;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Newt newt = (Newt) obj;
		return size == newt.size;
	}

	@Override
	public int hashCode() {
		return Long.hashCode(size);
	}

	@Override
	public String toString() {
		return "Newt[size=" + size + "]";
	}
}
