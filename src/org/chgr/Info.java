package org.cghr;
import java.util.Date;

public class Info {

	public static void main(String[] args) {
		System.out.println("Hola, la teua data és: ");
		System.out.println(getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		return new Date();
	}

}
