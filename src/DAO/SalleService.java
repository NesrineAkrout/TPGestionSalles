package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

import metier.Salle;

 
public class SalleService implements IDao<Salle> {
 
	private List<Salle> salles;
	
	public SalleService() {
		salles = new ArrayList<Salle>();
		
	}
    public boolean create(Salle o) {
    	
    	/*for (Salle s : salles)
    	{
    	if (o.equals(s))
    		return false;
    	else
    		{System.out.println("in");*/
    		return salles.add(o);
    	//}
		//return false;
    	
}
	
    @Override
	public boolean update(Salle o) {
		
		/*for(Salle s : salles){
			if(s.getId() == o.getId()){
				s.setCode(o.getCode());
				s.setLibelle(o.getLibelle());
				return true;
			}
		}
		return false;*/
		for(int i = 0 ; i < salles.size(); i++)
		{
			   Salle s=salles.get(i);
			   if(s.getId() == o.getId()){
					s.setCode(o.getCode());
					s.setLibelle(o.getLibelle());
					return true;
				}
		}
	    return false;
	}
 
	@Override
	public boolean delete(Salle o) {
		return salles.remove(o);
	}
 
	
	public List<Salle> findAll() {
		return salles;
	}
	
    
	public Salle findById(int id) {
		for (Salle s : salles) {
			if (s.getId() == id)
				return s;
		}
		return null;
	}

	
}
