<jsp:useBean id="signup" class="SignupDB"></jsp:useBean>
<jsp:setProperty property="*" name="signup"/>
You have enterted below details:<br>
<jsp:getProperty property="name" name="signup"/><br>
<jsp:getProperty property="PhoneNumber" name="signup"/><br>
<jsp:getProperty property="Age" name="signup" /><br>
<jsp:getProperty property="Emaill" name="signup"/><br>
<jsp:getProperty property="password" name="signup"/><br>
