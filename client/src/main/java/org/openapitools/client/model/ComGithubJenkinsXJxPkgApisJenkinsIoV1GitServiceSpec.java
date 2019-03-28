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

/**
 * GitServiceSpec is the specification of an GitService
 */
@ApiModel(description = "GitServiceSpec is the specification of an GitService")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec {
  public static final String SERIALIZED_NAME_GIT_KIND = "gitKind";
  @SerializedName(SERIALIZED_NAME_GIT_KIND)
  private String gitKind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec gitKind(String gitKind) {
    this.gitKind = gitKind;
    return this;
  }

   /**
   * Get gitKind
   * @return gitKind
  **/
  @ApiModelProperty(value = "")
  public String getGitKind() {
    return gitKind;
  }

  public void setGitKind(String gitKind) {
    this.gitKind = gitKind;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec name(String name) {
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

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec comGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec = (ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec) o;
    return Objects.equals(this.gitKind, comGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec.gitKind) &&
        Objects.equals(this.name, comGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec.name) &&
        Objects.equals(this.url, comGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitKind, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1GitServiceSpec {\n");
    
    sb.append("    gitKind: ").append(toIndentedString(gitKind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

