<?php

//RouteCoordDistances::loadDistanceTable();
//RouteCoordDistances::calcDistances();

//var_dump($etas);
include("header.php");

?>
 

<!--<div id="boxes">
 
 
    <div id="dialog" class="window">
        Are you still here?
        <br /> 
        <!-- close button is defined as close class 
        <a href="#" class="close">I'm here!</a>    
        
 
    </div>
 
    <div id="mask"></div>
</div> -->


<div data-role="page" id="eta">
    <div  data-role="header" class="ui-bar" data-inline="true"> 
        <h1>RPI Shuttle Tracking</h1>
        <a href="#" data-role="button" id="refresh">Refresh</a> 
            
    </div>
<div data-role="content" id="etalist">
    <div id="before" data-role="collapsible">
    <h3>Before</h3>   
    </div>
    <div id="favorite" data-role="collapsible">   
    </div>
    <div id="west" data-role="collapsible">
    </div>
    <div id="east" data-role="collapsible">
    </div>
</div>
<? 
include("footer.php"); 
?>

</body>
</html>