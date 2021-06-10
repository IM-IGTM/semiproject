function check(){
	
	let aInput = document.myForm.a;


	if (isNotNumber(aInput)) {
		alert('숫자만 입력하세요');

		aInput.value = "";
		aInput.focus();

		return false;
	}	

	
	
	
	return true;
	
}