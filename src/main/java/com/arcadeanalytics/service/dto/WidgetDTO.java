package com.arcadeanalytics.service.dto;

/*-
 * #%L
 * Arcade Analytics
 * %%
 * Copyright (C) 2018 - 2019 ArcadeAnalytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the Widget entity.
 */
public class WidgetDTO implements Serializable {

    private Long id;

    @NotNull
    private String name;

    private String type;

    private Boolean hasSnapshot;

    private Boolean isShared;

    private Long dataSetId;

    private Long dataSourceId;

    private Long dashboardId;

    private Long primaryWidgetId;

    private UUID uuid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean isHasSnapshot() {
        return hasSnapshot;
    }

    public void setHasSnapshot(Boolean hasSnapshot) {
        this.hasSnapshot = hasSnapshot;
    }

    public Boolean getShared() {
        return isShared;
    }

    public void setShared(Boolean shared) {
        isShared = shared;
    }

    public Long getDataSetId() {
        return dataSetId;
    }

    public void setDataSetId(Long dataSetId) {
        this.dataSetId = dataSetId;
    }

    public Long getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Long getDashboardId() {
        return dashboardId;
    }

    public void setDashboardId(Long dashboardId) {
        this.dashboardId = dashboardId;
    }

    public Long getPrimaryWidgetId() {
        return primaryWidgetId;
    }

    public void setPrimaryWidgetId(Long primaryWidgetId) {
        this.primaryWidgetId = primaryWidgetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WidgetDTO widgetDTO = (WidgetDTO) o;
        if (widgetDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), widgetDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "WidgetDTO{" +
                "id=" + getId() +
                ", name='" + getName() + "'" +
                ", type='" + getType() + "'" +
                ", hasSnapshot='" + isHasSnapshot() + "'" +
                "}";
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
