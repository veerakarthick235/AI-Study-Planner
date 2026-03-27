let isLoginMode = true;

function toggleMode(){

isLoginMode = !isLoginMode;

document.getElementById("authTitle").innerText =
isLoginMode ? "Login" : "Register";

document.getElementById("toggleText").innerText =
isLoginMode ? "Don't have an account?" : "Already have an account?";

document.getElementById("authMessage").innerText = "";

}


async function handleAuth(){

const username = document.getElementById("username").value
const password = document.getElementById("password").value

const messageEl = document.getElementById("authMessage")

if(!username || !password){

messageEl.innerText="Please fill all fields"
return

}

const endpoint = isLoginMode ? "/api/auth/login" : "/api/auth/register"

try{

const response = await fetch("http://localhost:8080"+endpoint,{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({username,password})

})

const text = await response.text()

if(response.ok){

messageEl.style.color="lightgreen"

messageEl.innerText=text

if(isLoginMode){

localStorage.setItem("loggedInUser",username)

setTimeout(()=>{
window.location.href="index.html"
},1000)

}else{

setTimeout(toggleMode,1500)

}

}else{

messageEl.style.color="red"
messageEl.innerText=text

}

}catch(err){

messageEl.innerText="Server connection failed"

}

}