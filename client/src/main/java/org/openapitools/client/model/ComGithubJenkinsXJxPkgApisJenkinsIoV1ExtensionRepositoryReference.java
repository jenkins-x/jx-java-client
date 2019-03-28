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
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1ChartRef;

/**
 * ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference {
  public static final String SERIALIZED_NAME_CHART = "chart";
  @SerializedName(SERIALIZED_NAME_CHART)
  private ComGithubJenkinsXJxPkgApisJenkinsIoV1ChartRef chart = null;

  public static final String SERIALIZED_NAME_GITHUB = "github";
  @SerializedName(SERIALIZED_NAME_GITHUB)
  private String github;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference chart(ComGithubJenkinsXJxPkgApisJenkinsIoV1ChartRef chart) {
    this.chart = chart;
    return this;
  }

   /**
   * Get chart
   * @return chart
  **/
  @ApiModelProperty(value = "")
  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ChartRef getChart() {
    return chart;
  }

  public void setChart(ComGithubJenkinsXJxPkgApisJenkinsIoV1ChartRef chart) {
    this.chart = chart;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference github(String github) {
    this.github = github;
    return this;
  }

   /**
   * Get github
   * @return github
  **/
  @ApiModelProperty(value = "")
  public String getGithub() {
    return github;
  }

  public void setGithub(String github) {
    this.github = github;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference url(String url) {
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
    ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference = (ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference) o;
    return Objects.equals(this.chart, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference.chart) &&
        Objects.equals(this.github, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference.github) &&
        Objects.equals(this.url, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chart, github, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionRepositoryReference {\n");
    
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
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

