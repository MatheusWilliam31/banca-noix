<<<<<<< HEAD
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SelectItem } from 'primeng';
import { environment } from 'src/environments/environment';
=======
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SelectItem } from 'primeng';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f

@Injectable({
  providedIn: 'root'
})

<<<<<<< HEAD
=======

>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f
export class SituacaoService { 
    public readonly BASE_URL: string = '/situacao';

    constructor(private http: HttpClient){}

    public listar(): Observable<SelectItem[]> {
        return this.http.get<SelectItem[]>(`${environment.apiUrl}${this.BASE_URL}`);
    }
<<<<<<< HEAD
}
=======
}

>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f
