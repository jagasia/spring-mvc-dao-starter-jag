package model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vs")
public class VehicleService {
	@Autowired
	VehicleDao vdao;
	public void add(Vehicle vehicle)
	{
		vdao.create(vehicle);
	}
	public void update(Vehicle vehicle)
	{
		vdao.update(vehicle);
	}
	public List<Vehicle> read()
	{
		return vdao.read();
	}
	public Vehicle read(int id)
	{
		return vdao.read(id);
	}
	public void delete(int id)
	{
		vdao.delete(id);
	}
	public List<Vehicle> findVehicleByType(String type)
	{
		return vdao.findVehiclesByType(type);
	}
}
