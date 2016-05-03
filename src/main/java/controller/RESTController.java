package controller;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import model.Artist;
import model.Museum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sparql.MuseumSparql;


@RestController
public class RESTController {

	private final AtomicLong artistCounter = new AtomicLong();
	private final AtomicLong museumCounter = new AtomicLong();

	
	/*Simple Test services to experiment with 
	 * 
	 * 
	 * */
    @RequestMapping(value="/getArtist", method=RequestMethod.GET)
    public Artist getArtist(@RequestParam(value="firstname", required=false, defaultValue="Artist") String firstName,
    						@RequestParam(value="lastname", required=false, defaultValue="Test") String lastName,
    						@RequestParam(value="age", required=false, defaultValue="9999") Integer age) 
	{
		return new Artist(artistCounter.incrementAndGet(), firstName, lastName, age);
	}
    
    @RequestMapping(value="/getMuseum", method=RequestMethod.GET)
    public Museum getMuseum(@RequestParam(value="name", required=false, defaultValue="Museum") String name,
    						@RequestParam(value="latitude", required=false, defaultValue="99.9999") Float latitude,
    						@RequestParam(value="longitude", required=false, defaultValue="99.999") Float longitude) 
	{
		return new Museum(museumCounter.incrementAndGet(), name, latitude, longitude);
	}
    
    /*The real services linked with SPARQL 
	 * 
	 * 
	 * */
    @RequestMapping(value="/getMuseums", method=RequestMethod.GET)
    public ArrayList<Museum> getMuseum() 
	{
		return MuseumSparql.getMuseums();
	}
    
}