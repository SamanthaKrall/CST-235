package Milestone;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Animal {
	List <Animals> animal = new ArrayList<Animals>();
	
	public Animal(){
		animal.add(new Animals((int)1,"Wubs", "Orange", (int)6, "Domestic Longhair", "Stomach", "None", "Anti Inflammatory", "05/13/12", "05/14/12", "05/17/12"));
		animal.add(new Animals((int)2,"Shadow", "Black", (int)6, "Domestic", "None", "None", "None", "05/13/12", "05/14/12","05/17/12"));
		animal.add(new Animals((int)3,"Zorc", "Black", (int)6, "Domestic", "Overweight", "Non Social", "Diet", "05/13/12", "05/14/12","05/17/12"));
		animal.add(new Animals((int)4,"Bob", "White with Black Spots", (int)6, "Domestic", "None", "None", "None", "05/13/12", "05/14/12","05/17/12"));
		animal.add(new Animals((int)5,"Zetsu", "Black", (int)8, "Domestic", "None", "None", "None", "05/13/12", "05/14/12","05/17/12"));
		animal.add(new Animals((int)6,"Amelia", "Black", (int)4, "Norwegian Elkhound", "Underbite", "None", "None", "05/13/16", "05/14/16","05/17/16"));
		
	
	
	}

	public List<Animals> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animals> animal) {
		this.animal = animal;
	}

}
