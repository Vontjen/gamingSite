



function getURLParameter(name) {
    return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search) || [null, ''])[1].replace(/\+/g, '%20')) || null;
}

gameid = getURLParameter('gameId');
userid = getURLParameter('userId');

console.log(gameid);
console.log(userid);

$.getJSON('/api/game/'+gameid, function (game) {
    let $tname = $("#name");
    let $tdev = $("#dev");
    let $tpub = $("#pub");
    let $tpage = $("#page");
    let $tdesc = $("#desc");
    let $tplatforms = $("#platforms");
    let $tgenres = $("#genres");

    $tpage.append($('<td>').append($("<img>").attr("src","data:image/png;base64," + game.picture)));


    //todo vragen hoe ik een urlparameter persist over een userSession
    $tname.append($('<td>').text(game.name));
    $tdev.append($('<td>').text(game.developer.name));
    $tpub.append($('<td>').text(game.publisher.name));
    $tdesc.append($('<td>').text(game.description));
    $tplatforms.append($('<td>').text(game.platforms));
    $tgenres.append($('<td>').text(game.genres));




});

if(userid !== null){
$.getJSON('/api/gamedata/all', function (gamedata) {
    let $tdata = $('#userGameData');

    for(data of gamedata){

        console.log(data.user.id);
        if(data.user.id == userid && data.game.id== gameid){

            console.log(data.propertiesList);

            for(properties of data.propertiesList){
                $tdata.append($('<th>').text(properties.propertyName))
                .append($('<td>').text(properties.propertyValue));}


        }

    }

})}




