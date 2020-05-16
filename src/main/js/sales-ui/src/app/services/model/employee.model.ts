import { EmployeePosition } from './employeeposition.model';
import { Location } from './location.model';



export class Employee {
    id: number;
    name: string;
    email: string;
    location: Location;
    position: EmployeePosition;
}