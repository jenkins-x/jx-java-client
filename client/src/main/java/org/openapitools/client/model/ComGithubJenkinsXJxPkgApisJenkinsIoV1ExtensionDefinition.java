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
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference;
import org.openapitools.client.model.ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter;

/**
 * ExtensionDefinition defines an Extension
 */
@ApiModel(description = "ExtensionDefinition defines an Extension")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-28T12:38:15.775957Z[Europe/London]")
public class ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference> children = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GIVEN = "given";
  @SerializedName(SERIALIZED_NAME_GIVEN)
  private String given;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter> parameters = null;

  public static final String SERIALIZED_NAME_SCRIPT_FILE = "scriptFile";
  @SerializedName(SERIALIZED_NAME_SCRIPT_FILE)
  private String scriptFile;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private List<String> when = null;

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition children(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference> children) {
    this.children = children;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition addChildrenItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference> getChildren() {
    return children;
  }

  public void setChildren(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinitionChildReference> children) {
    this.children = children;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition given(String given) {
    this.given = given;
    return this;
  }

   /**
   * Get given
   * @return given
  **/
  @ApiModelProperty(value = "")
  public String getGiven() {
    return given;
  }

  public void setGiven(String given) {
    this.given = given;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition parameters(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition addParametersItem(ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionParameter> parameters) {
    this.parameters = parameters;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition scriptFile(String scriptFile) {
    this.scriptFile = scriptFile;
    return this;
  }

   /**
   * Get scriptFile
   * @return scriptFile
  **/
  @ApiModelProperty(value = "")
  public String getScriptFile() {
    return scriptFile;
  }

  public void setScriptFile(String scriptFile) {
    this.scriptFile = scriptFile;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition when(List<String> when) {
    this.when = when;
    return this;
  }

  public ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition addWhenItem(String whenItem) {
    if (this.when == null) {
      this.when = new ArrayList<String>();
    }
    this.when.add(whenItem);
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @ApiModelProperty(value = "")
  public List<String> getWhen() {
    return when;
  }

  public void setWhen(List<String> when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition = (ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition) o;
    return Objects.equals(this.children, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.children) &&
        Objects.equals(this.description, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.description) &&
        Objects.equals(this.given, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.given) &&
        Objects.equals(this.name, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.name) &&
        Objects.equals(this.namespace, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.namespace) &&
        Objects.equals(this.parameters, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.parameters) &&
        Objects.equals(this.scriptFile, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.scriptFile) &&
        Objects.equals(this.uuid, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.uuid) &&
        Objects.equals(this.when, comGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, description, given, name, namespace, parameters, scriptFile, uuid, when);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubJenkinsXJxPkgApisJenkinsIoV1ExtensionDefinition {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    given: ").append(toIndentedString(given)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    scriptFile: ").append(toIndentedString(scriptFile)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

