package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Vehicle;
import model.VehicleService;

@Controller
public class MyController 
{
	@Autowired
	VehicleService vs;
	
	@RequestMapping("/")
	public String show(ModelMap modelMap)
	{		
		List<Vehicle> vehicles = vs.read();
		Vehicle vehicle = vs.read(147);
		modelMap.addAttribute("vehicles", vehicles);
		modelMap.addAttribute("vehicle",vehicle);
		return "vehicle";
	}
	
	@RequestMapping("/select")
	public String select(@RequestParam("id") int id, ModelMap modelMap)
	{
		List<Vehicle> vehicles = vs.read();
		Vehicle vehicle = vs.read(id);
		modelMap.addAttribute("vehicle",vehicle);
		modelMap.addAttribute("vehicles", vehicles);
		return "vehicle";
	}
}
