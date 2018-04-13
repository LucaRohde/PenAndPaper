package de.dpma.penandpaper.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Language {
	// property file is: package/name/language.properties
	private static final String BUNDLE_NAME = "language";
	public static Locale local;

	public static String getString(String key) {
		try {
			return ResourceBundle.getBundle(BUNDLE_NAME, local).getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getString(String key, Object... params) {
		try {
			return MessageFormat.format(ResourceBundle.getBundle(BUNDLE_NAME, local).getString(key), params);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static String getString(String key, Locale local, Object... params) {
		try {
			return MessageFormat.format(ResourceBundle.getBundle(BUNDLE_NAME, local).getString(key), params);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
