const itemLayout = (() => {

    const stateToLabel = { pending: '판매 대기', active: '판매 중', inactive: '판매 중단' };
    const typeToLabel  = { normal: '일반', deadline: '임박 마감' };


    const showList = (itemWithPaging) => {
        const tbody = document.querySelector("#post-list tbody");

        const posts = itemWithPaging.items;
        const criteria = itemWithPaging.criteria;

        let text = ``;
        posts.forEach((item) => {
            text += `
                <tr>
                    <td>${item.id}</td>
                    <td><a href="/post/detail?id=${item.id}">${item.itemTitle}</a></td>
                    <td>
                 `
            post.tags.forEach((tag) => {
                text += `${tag.tagName}, `
            });
            text = text.substring(0, text.length - 2);
            text += `
                </td>
                <td>${post.memberName}</td>
                <td>${post.createdDatetime}</td>
                <td>${post.postReadCount}</td>
                <td>
            `
            text += `</td>`;
        });
        console.log(criteria.page);
        if(criteria.page === 1) {
            tbody.innerHTML = text;
        }else{
            tbody.innerHTML += text;
        }
        return criteria;
    }

    return {showList: showList};
})();