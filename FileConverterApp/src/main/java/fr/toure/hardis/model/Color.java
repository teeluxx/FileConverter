package fr.toure.hardis.model;

public enum Color {
	R,
	G,
	B;
	
	public static boolean isKnown(String color){
		if(Color.R.name().equals(color)
				|| Color.G.name().equals(color)
				|| Color.B.name().equals(color))
			return true;
		else
			return false;
	}
}
