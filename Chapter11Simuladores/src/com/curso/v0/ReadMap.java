package com.curso.v0;

import java.util.Locale;

public class ReadMap implements AutoCloseable {
	
	private Locale locale;
	private boolean closed = false;

	@Override
	public void close() {
		System.out.println("Folding map");
		locale = null;
		closed = true;
	}

	public void open() {
		this.locale = new Locale.Builder()
				.setLanguage("yw")
				.setRegion("PM")
				.build();
	}

	public void use() {
		// Implementation omitted
	}

}
