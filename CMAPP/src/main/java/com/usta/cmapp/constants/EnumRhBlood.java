package com.usta.cmapp.constants;

public enum EnumRhBlood {
	
	ABPOS("AB+","AB POS"),
	ABNEG("AB-","AB NEG"),
	APOS("A+","A POS"),
	ANEG("A-","A NEG"),
	BPOS("B+","B POS"),
	BNEGA("B-","B NEG"),
	OPOS("O+","O POS"),
	ONGE("O-","O NEG");
	
	private String id;
	private String desc;
	
	private EnumRhBlood(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
	
}
