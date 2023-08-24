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

        
    </style>

</head>
<body>
<%@ include file="views/common/header.jsp" %>
    <div class="all">
        <form action="">

            <!------------------------------content_h------------------------------->
            <br><br>
            <div id="content_h">
                <p id="title">여행지 추천 글쓰기</p>
            </div> <br>
    
            <!------------------------------content_b------------------------------->
            <div id="content_b">
                
    
                    <input type="text" id="writeTitle" placeholder="제목을 입력해주세요." required>
                    <!-- 스마트에디터 -->
                    <div id="smarteditor">
                   <textarea name="ir1" id="ir1" rows="10" cols="150">에디터에 기본으로 삽입할 글(수정 모드)이 없다면 이 value 값을 지정하지 않으시면 됩니다.</textarea>
                       <script type="text/javascript">
						var oEditors = [];
						nhn.husky.EZCreator.createInIFrame({
						 oAppRef: oEditors,
						 elPlaceHolder: "ir1",
						 sSkinURI: "resources/smarteditor/SmartEditor2Skin.html",
						 fCreator: "createSEditor2"
						});
						</script>
                   
                   </div>
        
        <div   style="border: none;">
            <table class="table table-borderless"  style="border: none;">
                <tbody>
                    <tr>
                        
                        <td><input type="text" class="form-control" name="time" placeholder="시간" style="border: none;"></td>
                    </tr>
                    <tr>
                        
                        <td><input type="text" class="form-control" name="holiday" placeholder="휴무일" style="border: none;"></td>
                    </tr>
                    <tr>
                        
                        <td><input type="text" class="form-control" name="address" placeholder="주소" style="border: none;"></td>
                    </tr>
                    <tr>
                        
                        <td><input type="text" class="form-control" name="transportation" placeholder="교통 정보" style="border: none;"></td>
                    </tr>
                </tbody>
            </table>
        </div>
   
</div>
    
            <!------------------------------content_f------------------------------->
            <div id="content_f" align="right">
                <button type="reset" id="writeBtn" class="btn btn-secondary">초기화</button>
                <button type="button" id="writeBtn" class="btn btn-secondary">뒤로가기</button>
                <button type="submit" id="writeBtn" class="btn btn-secondary">작성하기</button>
            </div>

        </form>


    </div>



<%@ include file="views/common/footer.jsp" %>


</body>
</html>