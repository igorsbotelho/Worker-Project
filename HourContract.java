package entitites;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;

public class HourContract {
	
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	
	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double totalValue() {
		return valuePerHour * hours;
	}
	
}
