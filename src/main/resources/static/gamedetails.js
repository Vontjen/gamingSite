



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

    $tpage.append($('<td>').append($("<img>").attr("src","data:image/png;base64," + game.picture)));



    $tname.append($('<td>').text(game.name));
    $tdev.append($('<td>').text(game.developer.name));
    $tpub.append($('<td>').text(game.publisher.name));



});

