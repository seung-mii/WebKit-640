const http = require("http");
const express = require("express");
const app = express();
const cors = require("cors");
const router = express.Router();
// ejs 뷰엔진을 사용하기 위한 설정 - 뷰템플릿
app.set("views", __dirname + "/views"); // prefix - 폴더 지정
app.set("view engine", "ejs"); // suffix - 확장자
process.env.PORT = 3000;
app.set("port", process.env.PORT || 3001);
// cors 미들웨어 설정
app.use(cors());
// bodyParser 미들웨어 설정 부분.
app.use(express.json()); // application/json
// application/x-www-form-urlencoded
app.use(express.urlencoded({extended:true}))
// static 미들웨어 설정 - express에 내장.
app.use(express.static(__dirname + "/public"));


/////// router
router.route("/home").get((req, res) => {
  res.writeHead(200, {"Content-Type": "text/html; charset=utf8"});
  res.write("<h1>길동이의 홈페이지</h1>");
  res.end(); 
});

router.route("/login").post((req, res) => {
    console.log("POST - /login");
    console.log(req.body);
    res.redirect("/");
});

app.use("/", router);
//오류 핸들러 모듈 사용
var expressErrorHandler = require('express-error-handler');
//모든 라우터 처리 후 404 오류 페이지 처리
var errorHandler = expressErrorHandler({
    static : {
        '404':'./public/404.html'
    }
});
app.use(expressErrorHandler.httpError(404) );
app.use(errorHandler );
// 서버 실행
const server = http.createServer(app);
server.listen(app.get("port"), () => {
  console.log("Node.js 서버 실행 중 ... http://localhost:" + app.get("port"));
});