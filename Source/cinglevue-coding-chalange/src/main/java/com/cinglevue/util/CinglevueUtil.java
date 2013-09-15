package com.cinglevue.util;

public final class CinglevueUtil {

	/**
	 * Util method for generate the SQL String.
	 * 
	 */
	public static String genarateFilterSQL(String search, String sortBy, String direc) {

		String query = "SELECT S FROM StudentResults S WHERE S.school LIKE '%" + search + "%' ORDER BY S."
				+ StaticConstant.COLUMNS[Integer.parseInt(sortBy)] + " " + direc;

		return query;
	}
}
