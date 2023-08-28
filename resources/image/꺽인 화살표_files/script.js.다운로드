var ShareEntryWithSNS = {
    services: ['twitter', 'facebook', 'kakaostory'],
    actionUrl: '/plugin/sendSNS_Message',
    popupSize: {
        normal: {
            w: 800,
            h: 500
        },
        small: {
            w: 472,
            h: 340
        }
    },
    share: function (service, entryId, entryTitle, entryURL, isMobile) {
        if (service && entryId && entryTitle) {
            for (var i = 0, s; s = this.services[i]; i++) {
                if (service == s) {
                    this.post(service, entryId, entryTitle, entryURL, isMobile);
                    break;
                }
            }
        }
    },
    post: function (service, entryId, entryTitle, entryURL, isMobile) {
        var twitterURL = 'https://twitter.com/intent/tweet';
        var facebookURL = 'https://www.facebook.com/sharer.php';
        if (isMobile) facebookURL = 'https://m.facebook.com/sharer.php'
        var kakaostoryURL = 'https://story.kakao.com/share'

        var popupSize = this.popupSize;
        var popupWidth = popupSize.normal.w;
        var popupHeight = popupSize.normal.h;

        var title = encodeURIComponent(entryTitle);
        var message = title + ' ' + entryURL;

        var url = '';

        switch (service) {
            case 'twitter':
                url = twitterURL + '?text=' + (isMobile ? encodeURIComponent(message) : message);
                break;
            case 'facebook':
                url = facebookURL + '?u=' + encodeURIComponent(entryURL) + '&t=' + (isMobile ? encodeURIComponent(message) : message);
                break;
            case 'kakaostory':
                url = kakaostoryURL + '?url=' + encodeURIComponent(entryURL);
                break;
        }

        window.open(url, service, 'width=' + popupWidth + ', height=' + popupHeight + ',resizable=yes,scrollbars=yes');
    }
};
