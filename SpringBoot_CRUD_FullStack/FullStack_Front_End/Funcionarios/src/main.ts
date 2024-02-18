//import { appConfig } from './app/app.config';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app/app.module';

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));

/* 
bootstrapApplication(AppComponent)
  .catch((err) => console.error(err));

platformBrowserDynamic().bootstrapModule(AppModule)
.catch(err => console.error(err));

bootstrapApplication(AppComponent, {
  providers: [provideHttpClient()],
}).catch((err) => console.error(err));
*/