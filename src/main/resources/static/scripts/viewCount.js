var localCount = window.localStorage, pageCount1;
window.addEventListener('load', function(){
    if(!localCount.getItem("pageCount")){
        localCount.setItem('pageCount', 1);
    } else {
        pageCount1 = localCount.getItem("pageCount");
        pageCount1 = parseInt(pageCount1) + 1;
        localCount.setItem('pageCount', pageCount1 );
    }
    console.log('Number of total page views: ', localCount.getItem("pageCount"));
});

var sessionCount = window.sessionStorage, pageCount2;
window.addEventListener('load', function(){
    if(!sessionCount.getItem("pageCount")){
        sessionCount.setItem('pageCount', 1);
    } else {
        pageCount2 = sessionCount.getItem("pageCount");
        pageCount2 = parseInt(pageCount2) + 1;
        sessionCount.setItem('pageCount', pageCount2 );
    }
    console.log('Number of page views this session: ', sessionCount.getItem("pageCount"));
});