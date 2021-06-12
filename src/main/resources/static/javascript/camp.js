function getCamping(){
      var select = document.getElementById("location").selectedIndex;
      var option = document.getElementById("location").options;

      $.ajax({
      /*make request to the database to return the selected camping by search*/
           method:'GET',
           url:'http://localhost:8080/camp/'+option[select].text,
           datatype:'json'
      }).done((response) =>{
           var camp= JSON.parse(response);
           let output = `
           <div class="camp_data">

            <h1>${camp.cname}</h1>
           <table style="background-color:white;"><tr>
                <td>
               <img src="${camp.image}"></img>
               </td>
               <td>
                    <ul class="list-group">
                         <li class="list-group-item"><strong>Περιγραφή: </strong>${camp.cdesc}</li>
                         <li class="list-group-item"><strong>Διεύθυνση: </strong>${camp.cadd}</li>
                         <li class="list-group-item"><strong>Τηλέφωνο: </strong>${camp.cphone}</li>
                         <li class="list-group-item"><strong>Email: </strong>${camp.cemail}</li>
                         <li class="list-group-item"><strong>Παροχές: </strong>${camp.cut}</li>
                         <li class="list-group-item">
                            <table id="camp-info">
                                 <tr>
                                     <th>Κατηγορία</th>
                                     <th>Σκηνή</th>
                                     <th>Τροχόσπιτο</th>
                                     <th>Αυτοκινούμενο</th>
                                 </tr>
                                 <tr>
                                     <th>Διαθέσιμες Θέσεις</th>
                                     <td>${camp.aquantity}</td>
                                     <td>${camp.bquantity}</td>
                                     <td>${camp.cquantity}</td>
                                 </tr>
                                 <tr>
                                     <th>Έκταση(σε τ.μ)</th>
                                     <td>${camp.afield}</td>
                                     <td>${camp.bfield}</td>
                                     <td>${camp.cfield}</td>
                                 </tr>
                                 <tr>
                                     <th>Κόστος(σε €)</th>
                                        <td>${camp.acost}</td>
                                        <td>${camp.bcost}</td>
                                        <td>${camp.ccost}</td>
                                    </tr>
                            </table>
                         </li>
                    </ul>
               </div>
               </td>
           </tr></table>
      `;
      /*display the results in campSearch.html-> #selectesByLocation*/
      $('#selectedByLocation').html(output);
      }).catch((err)=>{
           console.log(err);
      });
}