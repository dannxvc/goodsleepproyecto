(function (){
    let navbar = document.querySelector('#mantenimiento');
    let flecha_abajo = document.querySelector('#flecha_abajo');
    flecha_abajo.addEventListener('click', ()=> {
        navbar.classList.toggle('open');
    });
})()