package default_pack;

public class UDate {
	private  int date,month,year;
	public boolean two,valid;
	public int days;
	
	public static final int SHORT_DATE = 1;
	public static final int LONG_DATE = 2;
	public static final int NORMAL_DATE = 3;
	
	private static final String[] MONTH_NAMES = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	
	public static int dateStyle = NORMAL_DATE;
	
	
	public UDate(int date,int month,int year,int format) throws MyException {
		two = this.checkYear(year);
		
		days = this.checkMonth(month);
		
		if(this.checkDays(date)){
			this.year= year;
			this.month = month;
			this.date = date;
			this.setStyle(format);
		}
		else{
			throw new MyException("invalid date");
		}
		
		
		
		
		
	}
	
	public void setStyle(int format){
		this.dateStyle = format;
		
	}
	
	public String toString(){
		switch(this.dateStyle){
		case NORMAL_DATE : return this.date +" "+ this.MONTH_NAMES[this.month-1].substring(3)+" "+this.year;
		
		case SHORT_DATE : return this.date +" "+ this.month+" "+this.date;
		
		case LONG_DATE : return this.date +" "+ this.MONTH_NAMES[this.month-1]+" "+this.year;
		
		default : return this.date +" "+ this.MONTH_NAMES[this.month-1]+" "+this.year;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UDate other = (UDate) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public boolean checkYear(int year){
		return((year % 100==0 && year%400==0)||(year % 100!= 0 && year %4 ==0));
	}
	
	public int checkMonth(int month){
		if(month<=7){
			if(month == 2){
				if(this.two){
					return 29;
				}
				else{
					return 28;
				}
				
			}
			
			if(month%2 == 0){
				return 30;
			}
			else{
				return 31;
			}
			
			
		}
		
		else{
			if(month%2 == 0){
				return 31;
			}
			else{
				return 30;
			}
		}
		
	}
	
	public boolean checkDays(int date){
		if(date>=1 && date<=this.days){
			return true;
		}
		else{
			return false;
		}
	}

}
