package com.microservices.tutorial.util;

import java.util.Properties;

/**
 * Data class representing the Git repository state when the JAR was built.
 * 
 */
public class GitRepositoryState {

	private String tags; // =${git.tags} // comma separated tag names
	private String branch; // =${git.branch}
	private String dirty; // =${git.dirty}
	private String remoteOriginUrl; // =${git.remote.origin.url}

	private String commitId; // =${git.commit.id.full} OR ${git.commit.id}
	private String commitIdAbbrev; // =${git.commit.id.abbrev}
	private String describe; // =${git.commit.id.describe}
	private String describeShort; // =${git.commit.id.describe-short}
	private String commitUserName; // =${git.commit.user.name}
	private String commitUserEmail; // =${git.commit.user.email}
	private String commitMessageFull; // =${git.commit.message.full}
	private String commitMessageShort; // =${git.commit.message.short}
	private String commitTime; // =${git.commit.time}
	private String closestTagName; // =${git.closest.tag.name}
	private String closestTagCommitCount; // =${git.closest.tag.commit.count}

	private String buildUserName; // =${git.build.user.name}
	private String buildUserEmail; // =${git.build.user.email}
	private String buildTime; // =${git.build.time}
	private String buildHost; // =${git.build.host}
	private String buildVersion; // =${git.build.version}

	public GitRepositoryState(Properties properties) {
		this.tags = String.valueOf(properties.get("git.tags"));
		this.branch = String.valueOf(properties.get("git.branch"));
		this.dirty = String.valueOf(properties.get("git.dirty"));
		this.remoteOriginUrl = String.valueOf(properties.get("git.remote.origin.url"));

		this.commitId = String.valueOf(properties.get("git.commit.id"));
		this.commitIdAbbrev = String.valueOf(properties.get("git.commit.id.abbrev"));
		this.describe = String.valueOf(properties.get("git.commit.id.describe"));
		this.describeShort = String.valueOf(properties.get("git.commit.id.describe-short"));
		this.commitUserName = String.valueOf(properties.get("git.commit.user.name"));
		this.commitUserEmail = String.valueOf(properties.get("git.commit.user.email"));
		this.commitMessageFull = String.valueOf(properties.get("git.commit.message.full"));
		this.commitMessageShort = String.valueOf(properties.get("git.commit.message.short"));
		this.commitTime = String.valueOf(properties.get("git.commit.time"));
		this.closestTagName = String.valueOf(properties.get("git.closest.tag.name"));
		this.closestTagCommitCount = String.valueOf(properties.get("git.closest.tag.commit.count"));

		this.buildUserName = String.valueOf(properties.get("git.build.user.name"));
		this.buildUserEmail = String.valueOf(properties.get("git.build.user.email"));
		this.buildTime = String.valueOf(properties.get("git.build.time"));
		this.buildHost = String.valueOf(properties.get("git.build.host"));
		this.buildVersion = String.valueOf(properties.get("git.build.version"));
	}

	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch
	 *            the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @return the dirty
	 */
	public String getDirty() {
		return dirty;
	}

	/**
	 * @param dirty
	 *            the dirty to set
	 */
	public void setDirty(String dirty) {
		this.dirty = dirty;
	}

	/**
	 * @return the remoteOriginUrl
	 */
	public String getRemoteOriginUrl() {
		return remoteOriginUrl;
	}

	/**
	 * @param remoteOriginUrl
	 *            the remoteOriginUrl to set
	 */
	public void setRemoteOriginUrl(String remoteOriginUrl) {
		this.remoteOriginUrl = remoteOriginUrl;
	}

	/**
	 * @return the commitId
	 */
	public String getCommitId() {
		return commitId;
	}

	/**
	 * @param commitId
	 *            the commitId to set
	 */
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	/**
	 * @return the commitIdAbbrev
	 */
	public String getCommitIdAbbrev() {
		return commitIdAbbrev;
	}

	/**
	 * @param commitIdAbbrev
	 *            the commitIdAbbrev to set
	 */
	public void setCommitIdAbbrev(String commitIdAbbrev) {
		this.commitIdAbbrev = commitIdAbbrev;
	}

	/**
	 * @return the describe
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * @param describe
	 *            the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	/**
	 * @return the describeShort
	 */
	public String getDescribeShort() {
		return describeShort;
	}

	/**
	 * @param describeShort
	 *            the describeShort to set
	 */
	public void setDescribeShort(String describeShort) {
		this.describeShort = describeShort;
	}

	/**
	 * @return the commitUserName
	 */
	public String getCommitUserName() {
		return commitUserName;
	}

	/**
	 * @param commitUserName
	 *            the commitUserName to set
	 */
	public void setCommitUserName(String commitUserName) {
		this.commitUserName = commitUserName;
	}

	/**
	 * @return the commitUserEmail
	 */
	public String getCommitUserEmail() {
		return commitUserEmail;
	}

	/**
	 * @param commitUserEmail
	 *            the commitUserEmail to set
	 */
	public void setCommitUserEmail(String commitUserEmail) {
		this.commitUserEmail = commitUserEmail;
	}

	/**
	 * @return the commitMessageFull
	 */
	public String getCommitMessageFull() {
		return commitMessageFull;
	}

	/**
	 * @param commitMessageFull
	 *            the commitMessageFull to set
	 */
	public void setCommitMessageFull(String commitMessageFull) {
		this.commitMessageFull = commitMessageFull;
	}

	/**
	 * @return the commitMessageShort
	 */
	public String getCommitMessageShort() {
		return commitMessageShort;
	}

	/**
	 * @param commitMessageShort
	 *            the commitMessageShort to set
	 */
	public void setCommitMessageShort(String commitMessageShort) {
		this.commitMessageShort = commitMessageShort;
	}

	/**
	 * @return the commitTime
	 */
	public String getCommitTime() {
		return commitTime;
	}

	/**
	 * @param commitTime
	 *            the commitTime to set
	 */
	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}

	/**
	 * @return the closestTagName
	 */
	public String getClosestTagName() {
		return closestTagName;
	}

	/**
	 * @param closestTagName
	 *            the closestTagName to set
	 */
	public void setClosestTagName(String closestTagName) {
		this.closestTagName = closestTagName;
	}

	/**
	 * @return the closestTagCommitCount
	 */
	public String getClosestTagCommitCount() {
		return closestTagCommitCount;
	}

	/**
	 * @param closestTagCommitCount
	 *            the closestTagCommitCount to set
	 */
	public void setClosestTagCommitCount(String closestTagCommitCount) {
		this.closestTagCommitCount = closestTagCommitCount;
	}

	/**
	 * @return the buildUserName
	 */
	public String getBuildUserName() {
		return buildUserName;
	}

	/**
	 * @param buildUserName
	 *            the buildUserName to set
	 */
	public void setBuildUserName(String buildUserName) {
		this.buildUserName = buildUserName;
	}

	/**
	 * @return the buildUserEmail
	 */
	public String getBuildUserEmail() {
		return buildUserEmail;
	}

	/**
	 * @param buildUserEmail
	 *            the buildUserEmail to set
	 */
	public void setBuildUserEmail(String buildUserEmail) {
		this.buildUserEmail = buildUserEmail;
	}

	/**
	 * @return the buildTime
	 */
	public String getBuildTime() {
		return buildTime;
	}

	/**
	 * @param buildTime
	 *            the buildTime to set
	 */
	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}

	/**
	 * @return the buildHost
	 */
	public String getBuildHost() {
		return buildHost;
	}

	/**
	 * @param buildHost
	 *            the buildHost to set
	 */
	public void setBuildHost(String buildHost) {
		this.buildHost = buildHost;
	}

	/**
	 * @return the buildVersion
	 */
	public String getBuildVersion() {
		return buildVersion;
	}

	/**
	 * @param buildVersion
	 *            the buildVersion to set
	 */
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	/**
	 * Returns just the major and minor version
	 * 
	 * @return
	 */
	public String getMajorMinorVersion() {
		int indexOfSeparator = this.buildVersion.indexOf('.');
		indexOfSeparator = this.buildVersion.lastIndexOf('.', indexOfSeparator);
		return this.buildVersion.substring(0, indexOfSeparator);
	}

}