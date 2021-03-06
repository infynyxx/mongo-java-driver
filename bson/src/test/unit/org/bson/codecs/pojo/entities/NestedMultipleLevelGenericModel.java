/*
 * Copyright 2017 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bson.codecs.pojo.entities;

public final class NestedMultipleLevelGenericModel {
    private Integer intField;
    private MultipleLevelGenericModel<String> nested;

    public NestedMultipleLevelGenericModel() {
    }

    public NestedMultipleLevelGenericModel(final Integer intField, final MultipleLevelGenericModel<String> nested) {
        this.intField = intField;
        this.nested = nested;
    }

    public Integer getIntField() {
        return intField;
    }

    public void setIntField(final Integer intField) {
        this.intField = intField;
    }

    public MultipleLevelGenericModel<String> getNested() {
        return nested;
    }

    public void setNested(final MultipleLevelGenericModel<String> nested) {
        this.nested = nested;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NestedMultipleLevelGenericModel that = (NestedMultipleLevelGenericModel) o;

        if (getIntField() != null ? !getIntField().equals(that.getIntField()) : that.getIntField() != null) {
            return false;
        }
        if (getNested() != null ? !getNested().equals(that.getNested()) : that.getNested() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = getIntField() != null ? getIntField().hashCode() : 0;
        result = 31 * result + (getNested() != null ? getNested().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NestedMultipleLevelGenericModel{"
                + "intField=" + intField
                + ", nested=" + nested
                + "}";
    }
}
