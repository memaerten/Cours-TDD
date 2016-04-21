package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nb= Integer.parseInt(arabe);
		String converti="";
		while(nb%10==9) {
			nb=nb/10;
			converti="I"+converti;
			nb=nb+10;
		}
		while(nb >= 10) {
			nb=nb-10;
			converti=converti+"X";
		}
		
		while(nb%5==4) {
			nb=nb/5;
			converti="I"+converti;
			nb=nb+5;
		}
		while(nb >= 5) {
			nb=nb-5;
			converti=converti+"V";
		}
		while(nb <= 3 && nb>0) {
			nb=nb-1;
			converti= converti+"I";
		}
		System.out.println(arabe + " : " + converti);
		return converti;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}