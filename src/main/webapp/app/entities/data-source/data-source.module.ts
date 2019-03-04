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
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArcadeanalyticsSharedModule } from '../../shared';
import {
    DataSourceService,
    DataSourcePopupService,
    DataSourceComponent,
    DataSourceDetailComponent,
    DataSourceDialogComponent,
    DataSourcePopupComponent,
    DataSourceDeletePopupComponent,
    DataSourceDeleteDialogComponent,
    dataSourceRoute,
    dataSourcePopupRoute,
    DataSourceResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...dataSourceRoute,
    ...dataSourcePopupRoute,
];

@NgModule({
    imports: [
        ArcadeanalyticsSharedModule,
        RouterModule.forChild(ENTITY_STATES)
    ],
    declarations: [
        DataSourceComponent,
        DataSourceDetailComponent,
        DataSourceDialogComponent,
        DataSourceDeleteDialogComponent,
        DataSourcePopupComponent,
        DataSourceDeletePopupComponent,
    ],
    entryComponents: [
        DataSourceComponent,
        DataSourceDialogComponent,
        DataSourcePopupComponent,
        DataSourceDeleteDialogComponent,
        DataSourceDeletePopupComponent,
    ],
    providers: [
        DataSourceService,
        DataSourcePopupService,
        DataSourceResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArcadeanalyticsDataSourceModule {}
