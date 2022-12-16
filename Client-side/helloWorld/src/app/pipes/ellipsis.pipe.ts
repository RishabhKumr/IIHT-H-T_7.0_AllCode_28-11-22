import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ellipsis'
})
export class EllipsisPipe implements PipeTransform {

  transform(value: String, ...args: unknown[]): unknown {
    if(value.length > 5){
      return value.substring(0,5)+"..."
    }
    return value;
  }

}
