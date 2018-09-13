package java7.locale;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		
		Locale currentLocale = Locale.getDefault();
		 
		System.out.println(currentLocale.getDisplayLanguage());
		System.out.println(currentLocale.getDisplayCountry());
		 
		System.out.println(currentLocale.getLanguage());
		System.out.println(currentLocale.getCountry());
		 		
		System.out.println(System.getProperty("user.language"));
		System.out.println(System.getProperty("user.country"));

	}
}
