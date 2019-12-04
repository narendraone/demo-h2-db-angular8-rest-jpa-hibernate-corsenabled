import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { EmployeeService } from './employee.service';
import { Employee } from './employee.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'demo-ui';
  employeeForm: FormGroup;
  message: string;
  empList: Employee[];

  constructor(private employeeService: EmployeeService) {}

  ngOnInit() {
    this.employeeForm = new FormGroup({

      'fName': new FormControl(null, [Validators.required]),
      'lName': new FormControl(null, [Validators.required])

    });
  }

  onSubmit() {
   
    console.log(this.employeeForm.value);

    let emp: Employee = this.employeeForm.value;
    console.log(emp);

    this.employeeService.saveEmp(emp)
    .subscribe((xx)=>{
      if(xx){
        this.message = "Added Successfully!";
      }
    });
  }

  fetchAllEmp() {
    this.employeeService.getAllEmp()
    .subscribe((yy)=>{
      console.log(yy);
      this.empList = yy;
    });
  }



}
