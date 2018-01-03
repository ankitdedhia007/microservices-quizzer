package com.microservices.tutorial;

import java.util.Date;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * 
 *
 */
@ApplicationPath("/trivia")
@Path("")
public class TriviaApp extends Application {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDirectory(@Context UriInfo uri) {
		Link selfLink = Link.fromUri(uri.getBaseUri()).rel("self").type(MediaType.APPLICATION_JSON).build();
		Link questionsLink = Link.fromUri(uri.getBaseUri() + "questions").rel("questions")
				.type(MediaType.APPLICATION_JSON).build();

		return Response.ok().lastModified(new Date())
//				.header("trivia-version", RepositoryUtils.getGitRepositoryState().getBuildVersion())
				.location(uri.getRequestUri()).links(selfLink, questionsLink).build();
	}
}