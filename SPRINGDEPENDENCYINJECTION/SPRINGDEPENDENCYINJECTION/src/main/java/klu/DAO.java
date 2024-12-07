package klu;

import org.springframework.beans.factory.annotation.Autowired;

public class DAO {
	Faculty F;
	Student S;
	
	public DAO(Faculty F)
	{
		this.F = F;
	}
	
	@Autowired
	public void setS(Student S)
	{
		this.S = S;
	}

	@Override
	public String toString() {
		return "DAO [F=" + F + ", S=" + S + "]";
	}
}
