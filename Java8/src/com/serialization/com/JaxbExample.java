package com.serialization.com;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "example")
public class JaxbExample {
	@XmlElement(required = true)
	private String str;
	@XmlElement(required = true)
	private BigDecimal number;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public BigDecimal getNumber() {
		return number;
	}

	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	public static void jaxbSerialization() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(JaxbExample.class);
		Marshaller marshaller = context.createMarshaller();
		final JaxbExample example = new JaxbExample();
		example.setStr("Some string");
		example.setNumber(new BigDecimal(12.33d, MathContext.DECIMAL64));
		try (final StringWriter writer = new StringWriter()) {
			marshaller.marshal(example, writer);
		}
	}

	public static void jaxbDeSerialization() throws JAXBException, IOException {
		JAXBContext context = JAXBContext.newInstance(JaxbExample.class);
		final String xml = "" + "<?xml version=\\1.0\\encoding=\\UTF-8\\standalone=\\yes\\?>" + "<example>"
				+ " <str>Some string</str>" + " <number>12.33000000000000</number>" + "</example>";

		final Unmarshaller unmarshaller = context.createUnmarshaller();
		try (final StringReader reader = new StringReader(xml)) {
			final JaxbExample example = (JaxbExample) unmarshaller.unmarshal(reader);
			// Some implementaion here
		}
	}

}