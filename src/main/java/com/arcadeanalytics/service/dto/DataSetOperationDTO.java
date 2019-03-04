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
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the DataSetOperation entity.
 */
public class DataSetOperationDTO implements Serializable {

    private Long id;

    @NotNull
    private LocalDate createdAt;

    @NotNull
    private String operation;

    private Long datasetId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Long getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(Long dataSetId) {
        this.datasetId = dataSetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DataSetOperationDTO dataSetOperationDTO = (DataSetOperationDTO) o;
        if (dataSetOperationDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dataSetOperationDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DataSetOperationDTO{" +
                "id=" + getId() +
                ", createdAt='" + getCreatedAt() + "'" +
                ", operation='" + getOperation() + "'" +
                "}";
    }
}
