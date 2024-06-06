	
	$(document).ready(function()
	{
    	$("#menu1").click(function()
    	{
        	$("#circleblock1").slideToggle("slow");
    	});
	});
	

  $(document).ready(function()
  {
      $("#menu2").click(function()
      {
          $("#circleblock2").slideToggle("slow");
      });
  });
  
















	var movimg=new Array();

movimg["img1"]=new Image(100,105);
movimg["img1"].src="../images/cartoon.gif";

movimg["img2"]=new Image(100,105);
movimg["img2"].src="../images/cartoon1.gif";

movimg["img3"]=new Image(100,105);
movimg["img3"].src="../images/cartoon2.gif";

movimg["img4"]=new Image(100,105);
movimg["img4"].src="../images/cartoon3.gif";

movimg["img5"]=new Image(100,105);
movimg["img5"].src="../images/front1.jpg";

movimg["img6"]=new Image(100,105);
movimg["img6"].src="../images/front.jpg";

var nm=new Array("img1","img2","img3","img4","img5","img6");

var i=0;
var im;

function changeimage()
{
 im=nm[i];
 
    if(i==5)
  {
     i=0;
   }  
  else{
       i++;
         }
      document.test.src=movimg[im].src;

      setTimeout("changeimage()",3000);
}

