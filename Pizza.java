package com.nestedclass;

public class Pizza {
	private String name;
	
	private boolean isExtraSauce;
	private boolean isSalad;
	
	
	private Pizza(Builder builder) {
		this.name=builder.name;
		this.isExtraSauce=builder.isExtraSauce;
		this.isSalad=builder.isSalad;
	
	}
	public String getName(){
		return name;
	}
	
	
	public boolean isExtraSauce() {
		return isExtraSauce;
	}
	public boolean isSalad() {
		return isSalad;
	}

	public static class Builder{
		private String name;
		private boolean isExtraSauce;
		private boolean isSalad;
		
		Builder(String name ){
			this.name=name;
			
		}
		public Builder withExtraSauce(boolean isExtraSauce) {
			this.isExtraSauce=isExtraSauce;
			return this;
		}
		public Builder withSalad(boolean isSalad) {
			this.isSalad=isSalad;
			return this;
		}
		public Pizza build() {
			return new Pizza(this);
		}
	}

}
