package Autos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nitesh Perla
 *
 */
@Entity
@Table(name="Auto23")
public class Auto {
	@Id
	@Column(name="AUTO_ID")
	private int autoId;
	@Column(name="AUTO_REGNO")
	private String redgno;
	@Column(name="AUTO_OWNER_NAME")
	private String ownerName;
	@Column(name="AUTO_YEAR")
	private int year;
	public Auto()
	{
		super();
	}
	public int getAutoId() {
		return autoId;
	}
	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}
	public String getRedgno() {
		return redgno;
	}
	public void setRedgno(String redgno) {
		this.redgno = redgno;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
