package com.myworld.microservices.itemstockservice.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myworld.microservices.itemstockservice.entity.ItemStock;

/**
 * @author Jegatheesh <br>
 *         Created on 25-May-2019
 *
 */
public class Util {

	public static void getInsertStatement(Class<?> className) {
		List<String> variables = new ArrayList<>();
		Field[] allFields = className.getDeclaredFields();
		for (Field field : allFields) {
			if (Modifier.isPrivate(field.getModifiers())) {
				variables.add(field.getName().charAt(0)
						+ field.getName().substring(1).replaceAll("([A-Z])", "_$1").toLowerCase());
			}
		}
		String table = className.getSimpleName().replaceAll("([A-Z])", "_$1").toLowerCase();
		System.out.println("insert into " + table.substring(1, table.length()) + " ("
				+ variables.stream().collect(Collectors.joining(", ")) + ") values()");
	}

	public static void main(String[] args) {
		getInsertStatement(ItemStock.class);
	}

}
