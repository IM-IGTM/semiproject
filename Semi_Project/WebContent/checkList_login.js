function check(){
	
	let regPWInput = document.myForm.regPW;
	let regPW2Input = document.myForm.regPW2;



	if (notEquals(regPWInput, regPW2Input)) {
		alert('비밀번호를 다시 확인하세요');


	 return regPWInput.value != regPWInput2.value;
	}	

	
	
	
	return true;
	
}