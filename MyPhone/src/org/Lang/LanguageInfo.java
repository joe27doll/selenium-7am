package org.Lang;

import org.Phone.PhoneInfo;

public class LanguageInfo {
    public void tamilLanguage()
    {
    	System.out.println("Tamil is Tamil Language");
    }
    public void englishLanguage()
    {
    	System.out.println("English is English Language");
    }
    public void hindiLanguage()
    {
    	System.out.println("Hindi is Hindi Lan");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo p =new PhoneInfo();
		StateDetails s=new StateDetails();
		LanguageInfo t=new LanguageInfo();
		t.tamilLanguage();
		t.englishLanguage();
		t.hindiLanguage();
		s.southIndia();
		s.northIndia();
	}

}
