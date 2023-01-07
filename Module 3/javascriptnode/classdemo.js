class Employeee{
    constructor(){
        this.empno=0;
        this.name=null;
        this.salary=0;
    }
    sayHello(){
        console.log("employee saying hello");
    }
    setEmployee(eno,ename,esal){
        this.empno=eno;
        this.name=ename;
        this.salary=esal;
    }
    displayEmployee(){
        console.log("EmpNo: "+this.empno);
        console.log("Name: "+this.name);
        console.log("Salary: "+this.salary);
    }
}
let empObj=new Employeee();
empObj.sayHello();

empObj.setEmployee(101,"Sanjana",95000);
empObj.displayEmployee();