
import { FullCalendarModule } from '@fullcalendar/angular';
import { EventoRoutingModule } from './module/evento/evento-routing.module';
import { EventoModule } from './module/evento/evento.module';
import { UsuarioRoutingModule } from './module/usuario/usuario-routing.module';
import { UsuarioModule } from './module/usuario/usuario.module';
import { DiarioErrosComponent } from './components/diario-erros/diario-erros.component';
import { AppFooterComponent } from './components/footer/app.footer.component';
import { AppTopbarComponent } from './components/topbar/app.topbar.component';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';
import { environment } from '../environments/environment';
import { HttpClientModule } from '@angular/common/http';
import { PageNotificationModule, BreadcrumbModule, MenuModule, ErrorStackModule } from '@nuvem/primeng-components';
import { ErrorModule, SecurityModule, VersionTagModule } from '@nuvem/angular-base';
import { BlockUIModule } from 'ng-block-ui';
import { CarouselModule } from 'primeng';
import { CarouselComponent } from './module/evento/components/evento/carousel/carousel.component';

@NgModule({
    declarations: [
        AppComponent,
        AppTopbarComponent,
        AppFooterComponent,
        DiarioErrosComponent,
     
    ],
    imports: [
        BlockUIModule.forRoot({
            message: "Carregando..."
        }),
        BrowserModule,
        BrowserAnimationsModule,
        AppRoutingModule,
        SharedModule,
        HttpClientModule,
        PageNotificationModule,
        BreadcrumbModule,
        ErrorStackModule,
        ErrorModule,
        VersionTagModule,
        SecurityModule.forRoot(environment.auth),
        MenuModule,
        UsuarioModule,
        UsuarioRoutingModule,
        EventoModule,
        EventoRoutingModule,
        FullCalendarModule,
        MenuModule,
        
    ],

    providers: [
        { provide: LocationStrategy, useClass: HashLocationStrategy }
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
