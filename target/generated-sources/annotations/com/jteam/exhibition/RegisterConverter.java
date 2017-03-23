/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.jteam.exhibition;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link com.jteam.exhibition.Register}.
 *
 * NOTE: This class has been automatically generated from the {@link com.jteam.exhibition.Register} original class using Vert.x codegen.
 */
public class RegisterConverter {

  public static void fromJson(JsonObject json, Register obj) {
    if (json.getValue("email") instanceof String) {
      obj.setEmail((String)json.getValue("email"));
    }
    if (json.getValue("group_leader") instanceof String) {
      obj.setGroup_leader((String)json.getValue("group_leader"));
    }
    if (json.getValue("group_member") instanceof String) {
      obj.setGroup_member((String)json.getValue("group_member"));
    }
    if (json.getValue("group_name") instanceof String) {
      obj.setGroup_name((String)json.getValue("group_name"));
    }
    if (json.getValue("group_number") instanceof String) {
      obj.setGroup_number((String)json.getValue("group_number"));
    }
    if (json.getValue("id") instanceof Number) {
      obj.setId(((Number)json.getValue("id")).longValue());
    }
    if (json.getValue("mo_phone") instanceof String) {
      obj.setMo_phone((String)json.getValue("mo_phone"));
    }
    if (json.getValue("school") instanceof String) {
      obj.setSchool((String)json.getValue("school"));
    }
    if (json.getValue("school_profession") instanceof String) {
      obj.setSchool_profession((String)json.getValue("school_profession"));
    }
  }

  public static void toJson(Register obj, JsonObject json) {
    if (obj.getEmail() != null) {
      json.put("email", obj.getEmail());
    }
    if (obj.getGroup_leader() != null) {
      json.put("group_leader", obj.getGroup_leader());
    }
    if (obj.getGroup_member() != null) {
      json.put("group_member", obj.getGroup_member());
    }
    if (obj.getGroup_name() != null) {
      json.put("group_name", obj.getGroup_name());
    }
    if (obj.getGroup_number() != null) {
      json.put("group_number", obj.getGroup_number());
    }
    json.put("id", obj.getId());
    if (obj.getMo_phone() != null) {
      json.put("mo_phone", obj.getMo_phone());
    }
    if (obj.getSchool() != null) {
      json.put("school", obj.getSchool());
    }
    if (obj.getSchool_profession() != null) {
      json.put("school_profession", obj.getSchool_profession());
    }
  }
}