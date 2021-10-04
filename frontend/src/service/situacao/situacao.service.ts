import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SituacaoService {

  constructor(private http: HttpClient  ) { }

  public readonly BASE_URL: string  = '/situacao';

    public listarSituacao(): Observable<any[]> {
      return this.http.get<any[]>('${environment.apiUrl}${this.BASE_URL }');
    }

}
