/* global fechaComplet, correo, correo1 */
var correo11;
const getRemainTime = deadline => {
    let now = new Date(),
        remainTime = (new Date(deadline) - now + 1000) / 1000,
        remainSeconds = ('0' + Math.floor(remainTime % 60)).slice(-2),
        remainMinutes = ('0' + Math.floor(remainTime / 60 % 60)).slice(-2),
        remainHours = ('0' + Math.floor(remainTime / 3600 % 24)).slice(-2),
        remainDays = Math.floor(remainTime / (3600 * 24));
  
    return {
        remainTime,
        remainSeconds,
        remainMinutes,
        remainHours,
        remainDays
    };
};

const countDown = (deadline, elem) =>{
  const elemento = document.getElementById(elem);
  
  const timerUpdate = setInterval(() =>{
 
  let t = getRemainTime(deadline);
  elemento.innerHTML = `${t.remainDays}d:${t.remainHours}h:${t.remainMinutes}m:${t.remainSeconds}s`;
  
  if(t.remainTime <= 1 && t.remainTime > -1){
     clearInterval(timerUpdate);
     cambia_de_pagina();
  }
  }, 1000);
};
        
countDown(fechaComplet, 'tiempo');
