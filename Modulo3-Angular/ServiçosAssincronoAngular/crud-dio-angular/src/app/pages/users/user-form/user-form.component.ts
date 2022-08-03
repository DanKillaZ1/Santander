import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  userForm: FormGroup;
  

  constructor(private fb: FormBuilder, private userService: UserService, private actRourer: ActivatedRoute, private router: Router) {
    this.userForm = this.fb.group({
      id: '',
      name: '',
      sobrenome: '',
      idade: '',
      profissao: '',
    })
  }

  ngOnInit(): void {
    this.actRourer.params.subscribe(params => {
    });

  createUser() {
    this.userService.postUser(this.userForm.value).subscribe(resul =>{
      console.log('Usuario ${resul.name} criado com sucesso !');
    });
  }
  actionbutton() {
    

}  
  }
}

function createUser() {
  throw new Error('Function not implemented.');
}
function actionbutton() {
  throw new Error('Function not implemented.');
}

