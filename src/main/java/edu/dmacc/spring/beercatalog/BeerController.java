package edu.dmacc.spring.beercatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeerController {
	@Autowired BeerDao dao;
	private static final String[] countries = { "France", "United States", "Germany", "England", "U/K", "Japan" };
	private static final String[] beertypes = { "Pilsner", "IPA", "Lager", "Stout", "Porter", "Wheat", "Sour" };

	@RequestMapping(value = "/form")
	public ModelAndView beer() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("beerForm");
		modelAndView.addObject("beer", new Beer());
		modelAndView.addObject("countries", countries);
		modelAndView.addObject("beertypes", beertypes);
		return modelAndView;
	}
	@RequestMapping(value = "/result")
	public ModelAndView processUser(Beer beer){
		System.out.println("In processUser");
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Value in getName"+ beer.getName());
		dao.insertBeer(beer);
		modelAndView.setViewName("beerResult");
		modelAndView.addObject("b", beer);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll( ){
		ModelAndView modelAndView = new ModelAndView();
		List<Beer> allBeers = dao.getAllBeers();
		modelAndView.setViewName("viewAllBeers");
		modelAndView.addObject("all", allBeers);
		return modelAndView;
	}

	
	@Bean
	public BeerDao dao(){
		BeerDao bean = new BeerDao();
		return bean;
	}

}
