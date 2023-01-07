function myFun(...i){
    //console.log(i.length);
    let sum=0;
    for(let j=0;j<i.length;j++){
        sum=sum+i[j];
    }
    console.log(sum);
}
myFun(10);
myFun(10,20);
myFun(10,20,30);
myFun(10,20,30,40);
