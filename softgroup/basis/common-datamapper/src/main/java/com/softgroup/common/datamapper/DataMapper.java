package com.softgroup.common.datamapper;

import com.fasterxml.jackson.databind.JavaType;
import com.sun.deploy.ref.AppModel;
//import jdk.internal.org.objectweb.asm.TypeReference;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.InputStream;
import java.util.Map;

/**
 * @author vlischyshyn
 */
public interface DataMapper {

	Map<?, ?> convertToMap(Object value);

	<T> T convert(Object map, Class<T> dataType);

	<T> T convert(Object map,JavaType dataType);

	<T> T  mapData(String data, Class<T> dataType);

	<T> T  mapData(String data, TypeReference dataType);

	<T> T mapData(byte[] message, Class<T> dataType);

	<T> T readValue(InputStream src, Class<T> valueType);

	String dataToString(Object data);

	String objectToString(Object data);

}
