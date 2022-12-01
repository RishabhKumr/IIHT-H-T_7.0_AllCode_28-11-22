class Employee{
    constructor(company){
        this.company = company;
    }
}

//chid classes
class Developer extends Employee{
    constructor(empName,Dept,Posn,jd,loca,email,empId,salary)
    {
        super();
        this.empName = empName;
        this.Dept = Dept;
        this.Posn = Posn;
        this.jd = jd;
        this.loca = loca;
        this.email = email;
        this.empId = empId; 
        this.salary = salary
    }
}
class HR extends Employee{
    constructor(empName,Dept,Posn,jd,loca,email,empId,salary)
    {
        super();
        this.empName = empName;
        this.Dept = Dept;
        this.Posn = Posn;
        this.jd = jd;
        this.loca = loca;
        this.email = email;
        this.empId = empId; 
        this.salary = salary
    }
}
class Finance extends Employee{
    constructor(empName,Dept,Posn,jd,loca,email,empId,salary)
    {
        super();
        this.empName = empName;
        this.Dept = Dept;
        this.Posn = Posn;
        this.jd = jd;
        this.loca = loca;
        this.email = email;
        this.empId = empId; 
        this.salary = salary
    }
}
class Sales extends Employee{
    constructor(empName,Dept,Posn,jd,loca,email,empId,salary)
    {
        super();
        this.empName = empName;
        this.Dept = Dept;
        this.Posn = Posn;
        this.jd = jd;
        this.loca = loca;
        this.email = email;
        this.empId = empId; 
        this.salary = salary
    }
}
class Sales extends Employee{
    constructor(empName,Dept,Posn,jd,loca,email,empId,salary)
    {
        super();
        this.empName = empName;
        this.Dept = Dept;
        this.Posn = Posn;
        this.jd = jd;
        this.loca = loca;
        this.email = email;
        this.empId = empId; 
        this.salary = salary
    }
}
class QA extends Employee{
    constructor(empName,Dept,Posn,jd,loca,email,empId,salary)
    {
        super();
        this.empName = empName;
        this.Dept = Dept;
        this.Posn = Posn;
        this.jd = jd;
        this.loca = loca;
        this.email = email;
        this.empId = empId; 
        this.salary = salary
    }
}
let dev = new Developer()