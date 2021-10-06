<<<<<<< HEAD
=======
<<<<<<< HEAD
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SelectItem } from 'primeng';
import { environment } from 'src/environments/environment';
=======
import { HttpClient } from '@angular/common/http';
>>>>>>> 801d201c4ab3496d6622a64aa20d9068e7082577
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SelectItem } from 'primeng';
import { environment } from 'src/environments/environment';
<<<<<<< HEAD
=======
import { Observable } from 'rxjs';

>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f
>>>>>>> 801d201c4ab3496d6622a64aa20d9068e7082577

@Injectable({
  providedIn: 'root'
})

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f
>>>>>>> 801d201c4ab3496d6622a64aa20d9068e7082577
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
<<<<<<< HEAD
=======

>>>>>>> b3af717f94a0aab7b2981a33d4b70bda470b628f
>>>>>>> 801d201c4ab3496d6622a64aa20d9068e7082577
