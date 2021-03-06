package eu.ensup.webservice;

import java.util.List;

import org.codehaus.jettison.json.JSONObject;

import eu.ensup.domaine.Course;

public interface ICourseService
{

	/**
	 * Associe un cours à un étudiant.
	 * @param course Le cours à associer.
	 * @param id L'id de l'étudiant à qui associer le cours.
	 */
	void associateCourse(JSONObject courseAssociation);

	/**
	 * Retourne tous les cours de la base de données.
	 * @return La liste des cours de la base de données.
	 */
	List<Course> getAllCourses();

}