package com.nolilicht.dynamicproperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassPathPropertiseLoader extends PropertiesLoader {
	private ClassLoader classLoader;

	public ClassPathPropertiseLoader(ClassLoader classLoader, String location) {
		this.classLoader = classLoader;
		this.location = location;
	}

	@Override
	public Properties load() throws IOException {
		InputStream inStream = this.classLoader.getResourceAsStream(location);
		if (inStream == null) {
			throw new ClassPathFileNotFoundException(location);
		}

		return load(inStream);
	}
}
