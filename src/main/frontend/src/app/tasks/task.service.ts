
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Task} from './task.model';



@Injectable()
export class TaskService {
  constructor(private httpClient: HttpClient) {

  }

  getTasks(){
    return this.httpClient.get<Task[]>('/api/tasks');
  }
}
