$(function(){
    
    $('.nav-item>a').on('click',function(){
        if (!$('.nav').hasClass('nav-mini')) {
            if ($(this).next().css('display') == "none") {
                $('.nav-item').children('ul').slideUp(300);
                $(this).next('ul').slideDown(300);
                $(this).parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
            }else{
                $(this).next('ul').slideUp(300);
                $('.nav-item.nav-show').removeClass('nav-show');
            }
        }
    });
    //nav-mini
    $('#mini').on('click',function(){
        if (!$('.nav').hasClass('nav-mini')) {
            $('.nav-item.nav-show').removeClass('nav-show');
            $('.nav-item').children('ul').removeAttr('style');
            $('.nav').addClass('nav-mini');
            if(window.PIE){
                $('.main').css('padding-left', '60px');
            }
        }else{
            $('.nav').removeClass('nav-mini');
            if(window.PIE){
                $('.main').css('padding-left', '230px');
            }
        }
    });

    $('.nav-item ul a').on('click', function(){
        $('.nav-item li a').removeClass('active');
        $(this).addClass('active');
    });

    $('#first').click();
});