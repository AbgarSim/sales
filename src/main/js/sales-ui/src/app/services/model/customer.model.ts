import { Location } from './location.model';
import { Timestamp } from 'rxjs';


export class Customer {
    id: number;
    name: string;
    location: Location;
    firstContact: Date;
}