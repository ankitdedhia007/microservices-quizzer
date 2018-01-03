package com.microservices.tutorial.util;

import java.io.IOException;
import java.util.Properties;

/**
 * Since the repository utilities are meant to be a library, this class's only
 * purpose is to return the version information for the file.
 *
 */
public class RepositoryUtils {

	static private GitRepositoryState gitRepositoryState;

	/**
	 * * Main application that returns the version information.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		getGitRepositoryState();

		if (gitRepositoryState != null) {
			System.out.println("RepositoryUtils version " + gitRepositoryState.getBuildVersion() + " Git SHA "
					+ gitRepositoryState.getCommitIdAbbrev());
		} else {
			System.out.println("Could not get repository state.");
			System.exit(-1);
		}
	}

	/**
	 * * Gets the repository state for this artifact.
	 *
	 * @return
	 */
	static public GitRepositoryState getGitRepositoryState() {
		if (RepositoryUtils.gitRepositoryState == null) {
			try {
				Properties properties = new Properties();
				properties.load(RepositoryUtils.class.getClassLoader().getResourceAsStream("git.properties"));
				RepositoryUtils.gitRepositoryState = new GitRepositoryState(properties);
			} catch (IOException ioe) {
				System.out.println("Could not get repository state : " + ioe);
			}
		}
		return RepositoryUtils.gitRepositoryState;
	}
}