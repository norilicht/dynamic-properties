package com.nolilicht.dynamicproperties;

public class DummyClassLoader extends ClassLoader {
	public DummyClassLoader() {
		super(Thread.currentThread().getContextClassLoader());
	}
}
