<%@ include file="common/header.jspf" %>
    <title>Welcome Page</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="../myCSS/baoCSS.css">
</head>
<body>
<%--<%@ include file="common/navbar.jspf" %>--%>
<div class="bcontent bcloseContent">
<%@ include file="common/bNavBar.jspf" %>
    <div>
        <div class="container mt-2 mb-2 d-flex justify-content-end">
            <button class = "btn btn-primary">Create Check List</button>
        </div>
        <div class="CheckListMain">
            <div class="CheckListHeader">
                <h2>Title: ${checklistJpa.checkListTitle()}</h2>
                <h6>Version: ${stig.version} Release: ${stig.release}</h6>
                <h5>Description:</h5>
                <h6>${checklistJpa.description()}</h6>
                <h5>Publish Date:</h5>
                <h6>${checklistJpa.publishDate()}</h6>
            </div>
            <c:forEach items ="${vulListJpa}" var = "vul">
                <div class="CheckListDetailContainer">
                    <div class="CheckListInfo">
                        <h4>Vul ID: </h4>
                        <p>${vul.vulID()}</p>
                        <h4>Severity: </h4>
                        <p>${vul.severity()}</p>
                        <h4>Control: </h4>
                        <p>CM-6.5</p>
                    </div>
                    <div class="CheckListDetail">
                        <h5>Title:</h5>
                        <p>${vul.vulTitle()}</p>
                        <hr>
                        <h5>CheckText:</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores at beatae deleniti inventore laudantium molestias, necessitatibus nesciunt officia, quae quo repellat sit vel. Animi blanditiis ea earum ex in magnam obcaecati, officia quae voluptatibus. Amet asperiores atque delectus dicta dolores ea et explicabo facere modi nulla, obcaecati optio pariatur tempore! Accusantium aspernatur atque autem dolore doloribus dolorum ex explicabo, fugiat illo in libero magnam odio, perferendis quae quam quo unde veniam! Aspernatur atque commodi facere itaque, modi porro suscipit. Ab amet at, blanditiis eos est eum laborum laudantium magni molestiae, nihil odio perferendis possimus praesentium quos sint? Ab atque et magni perspiciatis quam rem saepe tempore! Cumque et fuga inventore iusto, laboriosam magnam magni maxime molestiae molestias quis similique, veritatis voluptatem! Alias aperiam commodi cumque debitis eaque ipsam libero magni maxime officia placeat quibusdam quisquam, quo repudiandae sit, sunt ullam veritatis. Alias aperiam at atque enim, eos minima neque nostrum officiis, praesentium quisquam quod, sapiente sequi unde veniam voluptas! Assumenda autem dolorem eos fugit mollitia odio, quasi rem! Corporis culpa ex itaque iusto odio quis ratione reprehenderit soluta vitae, voluptate. Aliquid assumenda, doloribus dolorum est inventore, magnam minus nihil numquam pariatur quo quos ratione reiciendis soluta sunt ut vitae voluptatum!</p>
                        <hr>
                        <h5>Fix Text:</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Animi beatae consequuntur culpa delectus deleniti earum eos esse, expedita explicabo fuga, ipsum libero maxime minus modi molestiae natus necessitatibus nisi omnis optio placeat porro quod quos ratione repellendus rerum sapiente sit tempore temporibus ullam unde vero voluptate voluptates voluptatum? Quam, qui.</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf" %>