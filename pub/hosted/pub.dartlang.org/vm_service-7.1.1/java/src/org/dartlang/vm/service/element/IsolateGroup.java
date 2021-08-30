/*
 * Copyright (c) 2015, the Dart project authors.
 *
 * Licensed under the Eclipse Public License v1.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dartlang.vm.service.element;

// This is a generated file.

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * An {@link IsolateGroup} object provides information about an isolate group in the VM.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class IsolateGroup extends Response {

  public IsolateGroup(JsonObject json) {
    super(json);
  }

  /**
   * The id which is passed to the getIsolateGroup RPC to reload this isolate.
   */
  public String getId() {
    return getAsString("id");
  }

  /**
   * Specifies whether the isolate group was spawned by the VM or embedder for internal use. If
   * `false`, this isolate group is likely running user code.
   */
  public boolean getIsSystemIsolateGroup() {
    return getAsBoolean("isSystemIsolateGroup");
  }

  /**
   * A list of all isolates in this isolate group.
   */
  public ElementList<IsolateRef> getIsolates() {
    return new ElementList<IsolateRef>(json.get("isolates").getAsJsonArray()) {
      @Override
      protected IsolateRef basicGet(JsonArray array, int index) {
        return new IsolateRef(array.get(index).getAsJsonObject());
      }
    };
  }

  /**
   * A name identifying this isolate group. Not guaranteed to be unique.
   */
  public String getName() {
    return getAsString("name");
  }

  /**
   * A numeric id for this isolate, represented as a string. Unique.
   */
  public String getNumber() {
    return getAsString("number");
  }
}
