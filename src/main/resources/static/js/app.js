function validate(){
	var uname = document.getElementById("username");
	var pwd = document.getElementById("password");
	if (uname == '' || pwd == '') {
		alert("Username or password is empty!");
		return false;
	}
	else {
		return true;
	}
}