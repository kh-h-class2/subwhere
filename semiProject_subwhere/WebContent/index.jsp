<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>여행지 추천 글쓰기</title>
    
    <!-- w3schools 부트스트랩 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

    <!-- 스마트에디터 -->
<script type="text/javascript" src="resources/smarteditor/js/service/HuskyEZCreator.js" charset="utf-8"></script>

    
    <!-- 부트스트랩 -->
    <link
      rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    />

<style>
        div * {box-sizing: border-box;}


        .all {
            margin: auto;
            width: 1200px;
            height: 1400px;
            
        }

        #info{
            color: #222;
            font-weight: 700;
            font-size: 13px;
            
        }
        .table-responsive {
            margin-top: 20px;
        }
        
        .table th, .table td {
            vertical-align: middle;
        }


        input.form-control {
            border: none;
        }

       
        input.form-control::placeholder {
            font-size: 16px;
            font-weight: bold;
            color: #555;
        }

       
        table.table {
            border: none;
        }

        
        table.table tbody tr td {
            border-top: none;
        }

        /* ---------------content_h----------------- */
        #content_h {
            width: 100%;
            height: 50px;
            color: gray;
            font-size: 25px;
            font-weight: bold;
            margin-left: 50px;
        }

        /* ---------------content_b----------------- */
        #content_b {
            padding-left: 50px;
        }

        #content_b #writeTitle {
            width: 1127px;
            height: 30px;
            border: 1px solid lightgray;
        }

        
        /* ---------------content_b----------------- */
        #content_f {
            width: 100%;
            height: 50px;
            padding-top: 12px;
        }

        /*--미리보기--*/
		    .uploaded-image {
		        max-width: 100px;
		        max-height: 100px;
		        margin: 5px;
		        border: 1px solid #ccc;
		    }

            .input-file-button{
                padding: 6px 25px;
                background-color:#007fff ;
                border-radius: 4px;
                color: white;
                cursor: pointer;
                }
</style>


</head>
<%@ include file="views/common/header.jsp" %>
<body>








</body>
<%@ include file="views/common/footer.jsp" %>
</html>