package com.serialization.com;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializationExample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void serialze() throws IOException {
		final Path storage = new File("object.ser").toPath();
		try (final ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(storage))) {
			out.writeObject(new SerializationExample());
		}
	}

	public static void deSerialze() throws IOException, ClassNotFoundException {
		final Path storage = new File("object.ser").toPath();
		try (final ObjectInputStream in = new ObjectInputStream(Files.newInputStream(storage))) {
			final SerializationExample instance = (SerializationExample) in.readObject();
			// Some implementation here
		}

	}

}
