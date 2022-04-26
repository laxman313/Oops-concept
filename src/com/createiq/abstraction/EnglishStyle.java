package com.createiq.abstraction;

public abstract class EnglishStyle extends Furniture {
	private String Style;
	private int date;
	public EnglishStyle(String name, String model, int legs, int century, String style, int date) {
		super(name, model, legs, century);
		Style = style;
		this.date = date;
	}
	public void getDetails() {
		super.details();
		System.out.println("Style name "+Style);
		} @Override
		public String getModel() {
			// TODO Auto-generated method stub
			return super.getModel();
		}

}
