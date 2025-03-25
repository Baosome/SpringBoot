const navBarBtn = document.querySelector(".toggleNavBar");
const mainNavBar = document.querySelector(".mainBar");
const content = document.querySelector(".content");

navBarBtn.addEventListener("click", ()=> {
   mainNavBar.classList.toggle("closeNav");
   content.classList.toggle("closeContent")
});