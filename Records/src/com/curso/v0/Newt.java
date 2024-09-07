package com.curso.v0;

public record Newt(long size) {

	@Override
	public boolean equals(Object obj) {
		return false;
	}
	
//	public void setSize(long size) {
//		this.size = size;
//	} //NO SE PUEDE

}
