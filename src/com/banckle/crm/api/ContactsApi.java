package com.banckle.crm.api;

import com.banckle.client.ApiException;
import com.banckle.client.ApiInvoker;

import com.banckle.crm.model.ContactDto;
import com.banckle.crm.model.PersonFullDto;
import com.banckle.crm.model.ExecutionResult;
import com.banckle.crm.model.ContactFullDto;
import com.banckle.crm.model.PersonDto;
import com.banckle.crm.model.CompanyFullDto;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class ContactsApi {
  String basePath = "https://crm.banckle.com/api/v1.0";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public List<ContactDto> getContacts () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/contacts".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<ContactDto>) ApiInvoker.deserialize(response, "List", ContactDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Failed to find contact by name" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult createDealByContactId (String contactId, Map<String, String> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(contactId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/{contactId}/adddeals".replaceAll("\\{format\\}","json").replaceAll("\\{" + "contactId" + "\\}", apiInvoker.escapeString(contactId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Failed to find contact by name" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult createDealByContactName (String contactName, Map<String, String> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(contactName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/{contactName}/deals".replaceAll("\\{format\\}","json").replaceAll("\\{" + "contactName" + "\\}", apiInvoker.escapeString(contactName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Contact does not exist" model: <none>
  public ContactFullDto getContact (String id) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContactFullDto) ApiInvoker.deserialize(response, "", ContactFullDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Contact does not exist" model: <none>
  public ExecutionResult deleteContact (String id) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Contact does not exist" model: <none>
  public ContactFullDto getContactByName (String name) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/byname/{name}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "name" + "\\}", apiInvoker.escapeString(name.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ContactFullDto) ApiInvoker.deserialize(response, "", ContactFullDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 400 reason: "Company name is not set" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult createCompany (Map<String, Object> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/company".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Company does not exist" model: <none>
  public CompanyFullDto getCompanyByName (String companyName) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(companyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/company/{companyName}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyName" + "\\}", apiInvoker.escapeString(companyName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (CompanyFullDto) ApiInvoker.deserialize(response, "", CompanyFullDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Company does not exist" model: <none>
  public List<PersonDto> getEmployeesByCompanyName (String companyName) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(companyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/company/{companyName}/employees".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyName" + "\\}", apiInvoker.escapeString(companyName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<PersonDto>) ApiInvoker.deserialize(response, "List", PersonDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Company does not exist" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult createEmployee (String companyName, Map<String, Object> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(companyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/company/{companyName}/employees".replaceAll("\\{format\\}","json").replaceAll("\\{" + "companyName" + "\\}", apiInvoker.escapeString(companyName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 400 reason: "Company name is not set" model: <none>
  //error info- code: 404 reason: "Company does not exist" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult updateCompany (String id, Map<String, Object> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(id == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/company/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult createPerson (Map<String, Object> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/person".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Person does not exist" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult updatePerson (String id, Map<String, Object> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(id == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/person/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Person does not exist" model: <none>
  public PersonFullDto getPersonByName (String personName) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(personName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/person/{personName}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "personName" + "\\}", apiInvoker.escapeString(personName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PersonFullDto) ApiInvoker.deserialize(response, "", PersonFullDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Person does not exist" model: <none>
  public List<PersonDto> getColleaguesByPersonName (String personName) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(personName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/person/{personName}/colleagues".replaceAll("\\{format\\}","json").replaceAll("\\{" + "personName" + "\\}", apiInvoker.escapeString(personName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<PersonDto>) ApiInvoker.deserialize(response, "List", PersonDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "Person does not exist" model: <none>
  //error info- code: 500 reason: "Failed to save data" model: <none>
  public ExecutionResult createColleague (String personName, Map<String, Object> body) throws ApiException {
    Object postBody = body;
    // verify required params are set
    if(personName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/person/{personName}/colleagues".replaceAll("\\{format\\}","json").replaceAll("\\{" + "personName" + "\\}", apiInvoker.escapeString(personName.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ExecutionResult) ApiInvoker.deserialize(response, "", ExecutionResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ContactDto> getContactsByTag (String tag) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(tag == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/contacts/tags/{tag}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "tag" + "\\}", apiInvoker.escapeString(tag.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<ContactDto>) ApiInvoker.deserialize(response, "List", ContactDto.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

