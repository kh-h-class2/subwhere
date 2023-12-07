<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FAQ 게시글 보기</title>




  

    <style>
        .UJ-wrap{
            width: 1200px;
            height: 800px;
            /* border: 1px solid lightgrey; */
            border-bottom: 0;
            margin: auto;
            margin-top: 50px;
        }

        .UJ-wrap>div{
            width: 100%;
            box-sizing: border-box;
            /* border: 1px solid red ; */
        }


        /* 공지사항 게시글 글씨 부분 */
        #UJ-up{
            height: 5%;
            font-size: 20px;
            color: gray;
            font-weight: bold;
            padding-bottom: 50px;
            border-bottom: 1px solid lightgray;

        }

        #UJ-up>b{
            padding: 30px;
          
        }


        /* --------------------공지사항 제목------------------  */

        #UJ-title{
            height: 10%;
          
        }

        #UJ-title>div{
            height: 100%;
            box-sizing: border-box;
            border-top: 0;
            float: left;
            padding-left: 20px;
        }

        #UJ-title-btn{
            width: 10%;
     
        
        }

        /* 공지사항 부분에서 버튼이라 */
        #UJ-title-btn>button{
            width: 50px;
            height: 30px;
            margin-left: 25px;
            margin-top: 25px;
            background-color: pink;
            color: red;
            border: 0;
            border-radius: 25%;
          
            
        }

        
        
        
        #UJ-notice-title{
            width: 90%;
            padding-top: 15px;
        }
        
        #UJ-content{
            height: 60%;
           border-bottom: 1px solid lightgray;
            
        }
        
        #UJ-content>p{
            padding-top: 40px;
        }
        
        #UJ-btn{
            height: 10%;
            text-align: right;
            padding-right: 20px;
            /* border: 1px solid green; */
           
        }

       

        
        #UJ-reply{
            height: 15% ;
            /* border: 1px solid orange; */
        }




    


    </style>

</head>
<body>
    
    <%@ include file="../common/header.jsp" %>
    
    <div class="UJ-wrap">

		<!-- -------------위로가기 버튼------------ -->
        <div style="position:fixed; bottom: 200px; right: 10%; width: 5px; height: 5px; z-index: 999;">
           <a href="#"><img src="resources/images/upbutton.png" title="위로 가기" style="width: 50px;"></a>
        </div>

        <!-- -------------대한민구석구석 사이트 가기 버튼------------ -->
        <div style="position:fixed; bottom: 140px; right: 10%; width: 5px; height: 5px; z-index: 999;">
           <a href="https://1330chat.visitkorea.or.kr:3000/#/ttalk_main/CHAT1330_160635739001093018/_0300_0100_main.do" target="_blank"><img src="resources/images/movesite.png" title="대한민국구석구석" style="width: 50px;"></a>
        </div>


        <div style="padding-left: 30px;">
            <select onclick="UJEnrollChange();" style="height: 50px; width: 200px; padding-left: 15px;" id="UJ-enrollSelect" >
                       
                <option>작성할 게시글 선택</option>
                <option value="1">공지사항</option>
                <option value="2">FAQ</option>
    
            </select>

        </div>

        <br><br>

        <div id="UJ-up">
            
            <b>[FAQ]</b>
        </div>

        <div id="UJ-title">
            
            <div id="UJ-title-btn">
               
                
            </div>
            

        <form action="" method="post">


            <div id="UJ-notice-title" >
                    <h1>
                        <input type="text" name="noticeTitle" value="관리자가 입력한 제목" style="padding-left: 25px;">

                    </h1>
                    
                </div>
                
        </div>

        <hr>

        <div id="UJ-content">
            <p style="padding-left: 40px;">
               <textarea name="noticeContent"  cols="140" rows="15" style="resize: none; padding-left: 15px;">관리자가 입력한 내용</textarea>
            </p>

        </div>


        <div id="UJ-btn">


         <!------------------------------ 수정/삭제/목록 버튼 ------------------------------>
        
            <br>
            <!-- 로그인을 하고 해당 게시물의 작성자일 경우만 수정/삭제 가능하게 하기 -->
            <a href="" class="btn btn-secondary" > 수정</a>
            <!-- 수정 누르면 수정하는 jsp로 넘어가게 -->

          

        </form>    
             
        
            
            
        </div>
        <hr>
        
        

     


    </div>


<br><br><br><br><br><br>

    <%@ include file="../common/footer.jsp" %>


<br><br><br><br><br><br><br>
</body>
</html>