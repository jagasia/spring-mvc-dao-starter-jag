package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

@Component
public class VehicleDao {
	@PersistenceContext
	EntityManager em;
	
	public void create(Vehicle vehicle)
	{
		em.persist(vehicle);
	}
	public void update(Vehicle vehicle)
	{
		em.merge(vehicle);
	}
	
	public List<Vehicle> read()
	{
		TypedQuery<Vehicle> query = em.createQuery("select v from Vehicle v", Vehicle.class);
		return query.getResultList();
	}
	public Vehicle read(int id)
	{
		return em.find(Vehicle.class, id);
	}
	public void delete(int id)
	{
		Vehicle v=read(id);
		em.remove(v);
	}
	public List<Vehicle> findVehiclesByType(String type)
	{
		Query query = em.createQuery("select v from Vehicle v where v.type=?");
		query.setParameter(1, type);
		return query.getResultList();
	}
}
