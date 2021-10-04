import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SelectItem } from 'primeng';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CargoService { 
    private readonly BASE_URL: string = '/cargos';

    constructor(private http: HttpClient){}

    private listar(): Observable<SelectItem[]> {
        return this.http.get<SelectItem[]>(`${environment.apiUrl}${this.BASE_URL}`);
    }
}