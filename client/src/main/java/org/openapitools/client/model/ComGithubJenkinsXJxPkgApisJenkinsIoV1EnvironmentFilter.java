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

/**
 * EnvironmentFilter specifies the environments to apply the role binding to
 */
@ApiModel(description = "EnvironmentFilter specifies the environments to apply the role binding to")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter {
  public static final String SERIALIZED_NAME_EXCLUDES = "excludes";
  @SerializedName(SERIALIZED_NAME_EXCLUDES)
  private List<String> excludes = null;

  public static final String SERIALIZED_NAME_INCLUDES = "includes";
  @SerializedName(SERIALIZED_NAME_INCLUDES)
  private List<String> includes = null;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter excludes(List<String> excludes) {
    this.excludes = excludes;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter addExcludesItem(String excludesItem) {
    if (this.excludes == null) {
      this.excludes = new ArrayList<String>();
    }
    this.excludes.add(excludesItem);
    return this;
  }

   /**
   * Get excludes
   * @return excludes
  **/
  @ApiModelProperty(value = "")
  public List<String> getExcludes() {
    return excludes;
  }

  public void setExcludes(List<String> excludes) {
    this.excludes = excludes;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter includes(List<String> includes) {
    this.includes = includes;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter addIncludesItem(String includesItem) {
    if (this.includes == null) {
      this.includes = new ArrayList<String>();
    }
    this.includes.add(includesItem);
    return this;
  }

   /**
   * Get includes
   * @return includes
  **/
  @ApiModelProperty(value = "")
  public List<String> getIncludes() {
    return includes;
  }

  public void setIncludes(List<String> includes) {
    this.includes = includes;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter comGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter = (ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter) o;
    return Objects.equals(this.excludes, comGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter.excludes) &&
        Objects.equals(this.includes, comGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter.includes) &&
        Objects.equals(this.kind, comGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludes, includes, kind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1EnvironmentFilter {\n");
    
    sb.append("    excludes: ").append(toIndentedString(excludes)).append("\n");
    sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

