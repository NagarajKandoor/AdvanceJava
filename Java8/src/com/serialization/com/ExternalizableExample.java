package com.serialization.com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableExample implements Externalizable {
	private String str;
	private int number;
	private SerializationExample obj;

	@Override
	public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException {
		setStr(in.readUTF());
		setNumber(in.readInt());
		setObj((SerializationExample) in.readObject());
	}

	@Override
	public void writeExternal(final ObjectOutput out) throws IOException {
		out.writeUTF(getStr());
		out.writeInt(getNumber());
		out.writeObject(getObj());
	}

	private void setObj(SerializationExample readObject) {
		this.obj = readObject;

	}

	private void setNumber(int readInt) {
		this.number = readInt;

	}

	private void setStr(String readUTF) {
		this.str = readUTF;

	}

	private Object getObj() {
		return obj;
	}

	private int getNumber() {
		return number;
	}

	private String getStr() {
		return str;
	}
}
