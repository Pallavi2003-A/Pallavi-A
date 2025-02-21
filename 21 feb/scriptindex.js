var z=document.getElementById('col')
z.innerHTML='I am from JS'


var health=20

if(health>80){
z.innerHTML='great health'
z.style='color:green; opacity:1'
}
else{
    z.innerHTML='health!!!'
    z.style='color:red; opacity:0.5'
}



var x=document.getElementById('abc')
console.log(x.innerHTML)

if(x.innerHTML=='titles'){
    console.log(true)
}

var health=20

if(health>80){
x.innerHTML='great health'
}
else{
    x.innerHTML='health!!!'
    x.style='color:red'
}
