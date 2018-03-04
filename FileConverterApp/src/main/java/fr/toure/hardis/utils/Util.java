package fr.toure.hardis.utils;

import org.apache.commons.lang3.StringUtils;

import fr.toure.hardis.model.Color;

public class Util {
	public static final String JSON_EXTENSION = ".json";
	public static final String XML_EXTENSION = ".xml";
	public static final String INCORRECT_VALUE = "Incorrect value";
	
	/**
	 * Contrôle du numero de la reference
	 * @param numReference le numero de la reference a controler
	 * @return true si le controle est ok, false sinon
	 */
	public static boolean checkNumReference(String numReference){
		return numReference.length() == 10 && StringUtils.isNumeric(numReference);
	}
	
	/**
	 * Controle de la couleur
	 * @param color la couleur a controler
	 * @return true si la couleur est ok, false sinon
	 */
	public static boolean checkColor(String color){
		return Color.isKnown(color);
	}
}
