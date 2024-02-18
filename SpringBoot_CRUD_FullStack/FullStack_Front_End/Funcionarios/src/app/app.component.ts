import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-root',   
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    standalone: true
})

export class AppComponent implements OnInit {
  title = 'Funcionarios';

  constructor() {}

  ngOnInit(): void {
    
  }

}
