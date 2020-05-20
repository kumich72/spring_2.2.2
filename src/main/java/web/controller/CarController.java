package web.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

	@RequestMapping(value = "cars", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView printCars() {
		//
//		List<Comment> comments = commentService.findComments();
//		ModelAndView result = new ModelAndView("/comments");
//		result.addObject("comments", comments);
//		return result;
		CarService carService = new CarServiceImp() ;
 		List<Car> cars = carService.getRandomCars();
		ModelAndView result = new ModelAndView("/cars");
        result.addObject("cars", cars);
		return result;
	}

}
