import { NgModule } from '@angular/core';
import { CpfPipe } from '@nuvem/angular-base';
import { PRIMENG_IMPORTS } from './primeng-imports';

@NgModule({
    imports: [
        PRIMENG_IMPORTS
    ],
    providers: [],
    exports: [
        PRIMENG_IMPORTS
    ]
})
export class SharedModule { }
