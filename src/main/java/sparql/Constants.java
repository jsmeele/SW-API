package sparql;

public class Constants {
	final static String PREFIX =
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"+
			"PREFIX myOnt: <http://www.semanticweb.org/Art_Ontology#>"+
			"PREFIX dbpr: <http://dbpedia.org/resource/>";
	
	final static String SPARQLENDPOINT = "http://localhost:3030/art/sparql"; 
	
	final static String QueryTest =
//			PREFIX +
//			"SELECT *"+
//			"WHERE {"+
//			" ?s ?p dbpr:Amsterdam ."+ //" myOnt:Portrait rdfs:subClassOf ?o ."+
//			" } limit 5";
	
			"PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
			"PREFIX owl: <http://www.w3.org/2002/07/owl#> " +
			"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> " +
			"PREFIX dbpedia-owl: <http://dbpedia.org/ontology/> " +
			"PREFIX dbpprop: <http://dbpedia.org/property/> " +
			"PREFIX dbpres: <http://dbpedia.org/resource/> " +
			"PREFIX myOnt: <http://www.semanticweb.org/smeele/ontologies/2014/9/Art_Ontology_V2#> " +
			"PREFIX dbpedia: <http://dbpedia.org/resource/> " +
			"PREFIX foaf: <http://xmlns.com/foaf/0.1/>" +
			"PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>" +
			"" +
			"SELECT DISTINCT ?museum ?name ?lat ?long " +
			"WHERE " +
			"{ " +
			  "SERVICE <http://dbpedia.org/sparql> " +
			  "{ " +
			    "?museum rdf:type dbpedia-owl:Museum ; " +
			      "dbpedia-owl:location dbpedia:Amsterdam ;" +
			"      " +
			    "OPTIONAL { ?museum rdfs:label ?name ;" +
			      			"geo:lat ?lat ;" +
			      			"geo:long ?long ." +
			    "}" +
			    "Filter(lang(?name) = \"en\") ." +
			  "} " +
			"}" ;
}
