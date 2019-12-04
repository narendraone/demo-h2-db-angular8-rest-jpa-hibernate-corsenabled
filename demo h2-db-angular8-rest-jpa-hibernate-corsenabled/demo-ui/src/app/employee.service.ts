import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  saveEmp(employee: Employee) {
    // Send Http request
    return this.http.post("http://localhost:8080/emp", employee)
  }

  getAllEmp(): Observable<Employee[]> {
    return this.http.get<Employee[]>("http://localhost:8080/emp")
  }
}
