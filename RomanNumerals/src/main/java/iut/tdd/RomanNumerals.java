package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nb= Integer.parseInt(arabe);
		String converti="";
		while (nb > 0) {
			if(nb <= 3) {
				converti= converti+"I";
				nb=nb-1;
				//System.out.println(converti);
			}
			
		}
		return converti;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
