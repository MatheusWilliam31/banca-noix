import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SelectItem } from 'primeng';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CargoService { 
<<<<<<< HEAD
    public readonly BASE_URL: string = '/cargo';

    constructor(private http: HttpClient){}

    public listar(): Observable <SelectItem[]> {
=======
    private readonly BASE_URL: string = '/cargos';

    constructor(private http: HttpClient){}

    private listar(): Observable<SelectItem[]> {
>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f
        return this.http.get<SelectItem[]>(`${environment.apiUrl}${this.BASE_URL}`);
    }
}