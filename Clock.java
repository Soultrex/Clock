//Autor: Luis Ángel Barriga Chávez. A01633169
//Nombre de la clase: Clock.java
//Fecha: 03/Febrero/2019
//Comentarios u observaciones: El main no esta porque lo trasladamos a la clase UsarClock.java.

public class Clock{
private int 	hr,
		min,
		sec;

	public Clock(){
		this(12,0,0);
	}

	public Clock(int hr, int min, int sec){
		this.setTime(hr, min, sec);
	}

	public void setTime(int hr, int min, int sec){
		if(hr>=0 && hr<24){
			this.hr=hr;
		}else{
			this.hr=5;
		}
		
		if(min>=0 && min<60){
			this.min=min;
		}else{
			this.min=5;
		}

		if(sec>=0 && sec<60){
			this.sec=sec;
		}else{
			this.sec=5;
		}

	}

	public int getHours(){
		return this.hr;
	}

	public int getMinutes(){
		return this.min;
	}

	public int getSeconds(){
		return this.sec;
	}

	public void printTime(){
		System.out.println(this.hr+":"+this.min+":"+this.sec);
	}

	public void incrementHours(){
		this.hr=++this.hr%24; 
	}
	public void incrementMinutes(){
		this.min=++this.min%60;
		if(this.min==0){
			this.incrementHours();
		}
	}
	public void incrementSeconds(){
		this.sec=++this.sec%60;
		if(this.sec==0){
			this.incrementMinutes();
		}
	}

	public boolean equeals(Clock reloj){
		return this.hr==reloj.hr && this.min==reloj.min && this.sec==reloj.sec;
	}

	public void makeCopy(Clock reloj){
		this.hr=reloj.hr;
		this.min=reloj.min;
		this.sec=reloj.sec;
	}

	public Clock getCopy(){ //clona el reloj que lo llamo
		return new Clock(this.hr, this.min, this.sec);
	}

}