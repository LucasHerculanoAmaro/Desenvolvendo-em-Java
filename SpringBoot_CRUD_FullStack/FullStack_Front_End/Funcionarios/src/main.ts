import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app/app.module';
import { HttpClientModule, provideHttpClient } from '@angular/common/http';
import { importProvidersFrom, mergeApplicationConfig } from '@angular/core';


bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error(err));
/* 
platformBrowserDynamic().bootstrapModule(AppModule)
.catch(err => console.error(err));

bootstrapApplication(AppComponent, {
  providers: [provideHttpClient()],
}).catch((err) => console.error(err));
*/