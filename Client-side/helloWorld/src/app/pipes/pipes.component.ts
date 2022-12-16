import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
  employee = {
    "name":"Lewis hamiltom",
    "BaseSalary":5000000,
    "JoinedOn":Date.now(),
    "Qualification":"Btech",
    "About":"Sir Lewis Carl Davidson Hamilton MBE HonFREng (born 7 January 1985) is a British racing driver currently competing in Formula One for Mercedes.",
    "WinningPercentage":35/100
  }
  constructor() { }

  ngOnInit(): void {
  }

}
