function validate(){
	var uname = document.getElementById('uname');
	var pwd = document.getElementById('pwd');
	if (uname == '' || pwd == ''){
		alert("Username or password is empty!");
		return false;
	}
	else {
		return true;
	}
}