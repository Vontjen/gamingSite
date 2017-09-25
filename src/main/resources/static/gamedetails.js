



function getURLParameter(name) {
    return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search) || [null, ''])[1].replace(/\+/g, '%20')) || null;
}

param = getURLParameter('gameId');
console.log(param);

$.getJSON('/api/game/'+param, function (game) {
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
    // for (genre of game.genres){
    //     $tgenres.append().text(genre+", ")
    // }



});

