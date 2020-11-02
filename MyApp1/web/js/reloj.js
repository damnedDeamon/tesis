(function (){
   var actualizarHora = function(){
        var fecha = new Date(),
                hora = fecha.getHours(),
                ampm,
                minuto = fecha.getMinutes(),
                segundo = fecha.getSeconds(),
                diaSemana = fecha.getDay(),
                dia = fecha.getDate(),
                mes = fecha.getMonth(),
                anio = fecha.getFullYear();
        
   
        var pHoras = document.getElementById('horas'),
            pAMPM = document.getElementById('ampm'),   
            pMinutos = document.getElementById('minutos'),
            pSegundos = document.getElementById('segundo'),
            pDiaSemana = document.getElementById('diaSemana'),
            pDia = document.getElementById('dia'),
            pMes = document.getElementById('mes'),
            pAnio = document.getElementById('anio');
    
        var semana = ['Domingo','Lunes','Martes','Miercoles','Jueves','Viernes','Sabado'];
        pDiaSemana.textContent = semana[diaSemana]; 
        
        pDia.textContent = dia;
        
        var meses = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];
        pMes.textContent = meses[mes]; 
        
        pAnio.textContent = anio;
        
        if(hora >= 12){
            hora = hora - 12;
            ampm = 'PM';
            
        }else{
            ampm = 'AM';
        }
        
        if(hora == 0){
            hora = 12;
        }
        
        
        
        if(minuto < 10){ minuto = "0" + minuto };
        
        if(segundo < 10){ segundo = "0" + segundo };
        
        if(hora < 10){ hora = "0" + hora };
        
        pHoras.textContent = hora;
        pAMPM.textContent = ampm;
        pMinutos.textContent = minuto;
        pSegundos.textContent = segundo;
        
   };
   
   
   
   actualizarHora();
   var intervalo = setInterval(actualizarHora, 1000);
}())