/*
 * Jenkins X
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary;
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary;

/**
 * ReleaseSpec is the specification of the Release
 */
@ApiModel(description = "ReleaseSpec is the specification of the Release")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec {
  public static final String SERIALIZED_NAME_COMMITS = "commits";
  @SerializedName(SERIALIZED_NAME_COMMITS)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary> commits = null;

  public static final String SERIALIZED_NAME_GIT_CLONE_URL = "gitCloneUrl";
  @SerializedName(SERIALIZED_NAME_GIT_CLONE_URL)
  private String gitCloneUrl;

  public static final String SERIALIZED_NAME_GIT_HTTP_URL = "gitHttpUrl";
  @SerializedName(SERIALIZED_NAME_GIT_HTTP_URL)
  private String gitHttpUrl;

  public static final String SERIALIZED_NAME_GIT_OWNER = "gitOwner";
  @SerializedName(SERIALIZED_NAME_GIT_OWNER)
  private String gitOwner;

  public static final String SERIALIZED_NAME_GIT_REPOSITORY = "gitRepository";
  @SerializedName(SERIALIZED_NAME_GIT_REPOSITORY)
  private String gitRepository;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> issues = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PULL_REQUESTS = "pullRequests";
  @SerializedName(SERIALIZED_NAME_PULL_REQUESTS)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> pullRequests = null;

  public static final String SERIALIZED_NAME_RELEASE_NOTES_U_R_L = "releaseNotesURL";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES_U_R_L)
  private String releaseNotesURL;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec commits(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary> commits) {
    this.commits = commits;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec addCommitsItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary>();
    }
    this.commits.add(commitsItem);
    return this;
  }

   /**
   * Get commits
   * @return commits
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary> getCommits() {
    return commits;
  }

  public void setCommits(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1CommitSummary> commits) {
    this.commits = commits;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec gitCloneUrl(String gitCloneUrl) {
    this.gitCloneUrl = gitCloneUrl;
    return this;
  }

   /**
   * Get gitCloneUrl
   * @return gitCloneUrl
  **/
  @ApiModelProperty(value = "")
  public String getGitCloneUrl() {
    return gitCloneUrl;
  }

  public void setGitCloneUrl(String gitCloneUrl) {
    this.gitCloneUrl = gitCloneUrl;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec gitHttpUrl(String gitHttpUrl) {
    this.gitHttpUrl = gitHttpUrl;
    return this;
  }

   /**
   * Get gitHttpUrl
   * @return gitHttpUrl
  **/
  @ApiModelProperty(value = "")
  public String getGitHttpUrl() {
    return gitHttpUrl;
  }

  public void setGitHttpUrl(String gitHttpUrl) {
    this.gitHttpUrl = gitHttpUrl;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec gitOwner(String gitOwner) {
    this.gitOwner = gitOwner;
    return this;
  }

   /**
   * Get gitOwner
   * @return gitOwner
  **/
  @ApiModelProperty(value = "")
  public String getGitOwner() {
    return gitOwner;
  }

  public void setGitOwner(String gitOwner) {
    this.gitOwner = gitOwner;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec gitRepository(String gitRepository) {
    this.gitRepository = gitRepository;
    return this;
  }

   /**
   * Get gitRepository
   * @return gitRepository
  **/
  @ApiModelProperty(value = "")
  public String getGitRepository() {
    return gitRepository;
  }

  public void setGitRepository(String gitRepository) {
    this.gitRepository = gitRepository;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec issues(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> issues) {
    this.issues = issues;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec addIssuesItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary>();
    }
    this.issues.add(issuesItem);
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> getIssues() {
    return issues;
  }

  public void setIssues(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> issues) {
    this.issues = issues;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec pullRequests(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> pullRequests) {
    this.pullRequests = pullRequests;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec addPullRequestsItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary pullRequestsItem) {
    if (this.pullRequests == null) {
      this.pullRequests = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary>();
    }
    this.pullRequests.add(pullRequestsItem);
    return this;
  }

   /**
   * Get pullRequests
   * @return pullRequests
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> getPullRequests() {
    return pullRequests;
  }

  public void setPullRequests(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1IssueSummary> pullRequests) {
    this.pullRequests = pullRequests;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec releaseNotesURL(String releaseNotesURL) {
    this.releaseNotesURL = releaseNotesURL;
    return this;
  }

   /**
   * Get releaseNotesURL
   * @return releaseNotesURL
  **/
  @ApiModelProperty(value = "")
  public String getReleaseNotesURL() {
    return releaseNotesURL;
  }

  public void setReleaseNotesURL(String releaseNotesURL) {
    this.releaseNotesURL = releaseNotesURL;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec = (ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec) o;
    return Objects.equals(this.commits, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.commits) &&
        Objects.equals(this.gitCloneUrl, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.gitCloneUrl) &&
        Objects.equals(this.gitHttpUrl, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.gitHttpUrl) &&
        Objects.equals(this.gitOwner, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.gitOwner) &&
        Objects.equals(this.gitRepository, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.gitRepository) &&
        Objects.equals(this.issues, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.issues) &&
        Objects.equals(this.name, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.name) &&
        Objects.equals(this.pullRequests, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.pullRequests) &&
        Objects.equals(this.releaseNotesURL, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.releaseNotesURL) &&
        Objects.equals(this.version, comGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commits, gitCloneUrl, gitHttpUrl, gitOwner, gitRepository, issues, name, pullRequests, releaseNotesURL, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1ReleaseSpec {\n");
    
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    gitCloneUrl: ").append(toIndentedString(gitCloneUrl)).append("\n");
    sb.append("    gitHttpUrl: ").append(toIndentedString(gitHttpUrl)).append("\n");
    sb.append("    gitOwner: ").append(toIndentedString(gitOwner)).append("\n");
    sb.append("    gitRepository: ").append(toIndentedString(gitRepository)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    releaseNotesURL: ").append(toIndentedString(releaseNotesURL)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

