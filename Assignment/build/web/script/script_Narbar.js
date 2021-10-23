/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function hamDropdown() {
    document.querySelector(".noidung_dropdown").classList.toggle("hienThi");
}

window.onclick = function (e) {
    if (!e.target.matches('.nut_dropdown')) {
        var noiDungDropdown = document.querySelector(".noidung_dropdown");
        if (noiDungDropdown.classList.contains('hienThi')) {
            noiDungDropdown.classList.remove('hienThi');
        }
    }
};