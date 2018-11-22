

<#import "parts/common.ftl" as c>
<@c.page>
<h1>Welcome to Tester, ${name}</h1>
<table class="table table-bordered table-hover">

    <thead class="thead-dark">
        <tr>
            <th>#</th>
            <th scope="col" class="col-md-8">Название</th>
            <th scope="col" class="col-md-2" >Количество вопросов</th>
        </tr>
    </thead>

    <tbody>
    <#list tests as test>
        <tr>
            <th scope="row">${test.id}</th>
            <td>${test.name}</td>
            <td>${test.amountQuestions}</td>
        </tr>
    </#list>
    </tbody>
</table>

</@c.page>