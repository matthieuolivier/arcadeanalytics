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
import { Component, OnInit } from '@angular/core';
import { BsModalRef } from 'ngx-bootstrap';

@Component({
    selector: 'jhi-metrics-modal',
    templateUrl: './metrics-modal.component.html'
})
export class JhiMetricsMonitoringModalComponent implements OnInit {

    threadDumpFilter: any;
    threadDump: any;
    threadDumpAll = 0;
    threadDumpBlocked = 0;
    threadDumpRunnable = 0;
    threadDumpTimedWaiting = 0;
    threadDumpWaiting = 0;

    constructor(public bsModalRef: BsModalRef) {}

    ngOnInit() {
        this.threadDump.forEach((value) => {
            if (value.threadState === 'RUNNABLE') {
                this.threadDumpRunnable += 1;
            } else if (value.threadState === 'WAITING') {
                this.threadDumpWaiting += 1;
            } else if (value.threadState === 'TIMED_WAITING') {
                this.threadDumpTimedWaiting += 1;
            } else if (value.threadState === 'BLOCKED') {
                this.threadDumpBlocked += 1;
            }
        });

        this.threadDumpAll = this.threadDumpRunnable + this.threadDumpWaiting +
            this.threadDumpTimedWaiting + this.threadDumpBlocked;
    }

    getBadgeClass(threadState) {
        if (threadState === 'RUNNABLE') {
            return 'badge-success';
        } else if (threadState === 'WAITING') {
            return 'badge-info';
        } else if (threadState === 'TIMED_WAITING') {
            return 'badge-warning';
        } else if (threadState === 'BLOCKED') {
            return 'badge-danger';
        }
    }

    dismiss() {
        this.bsModalRef.hide();
    }
}
