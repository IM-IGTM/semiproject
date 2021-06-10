function check() {

	let regPWInput = document.myForm.regPW;
	let regPW2Input = document.myForm.regPW2;
	let regPhoneNumberInput = document.myForm.regPhoneNumber;


	if(isEmpty(regPWInput) || lessThan(regPWInput, 8)){
		alert('비번 양식에 맞춰 주세요(8글자 이상)');
		
		regPWInput.value = "";
		regPWInput.focus();
		
		return false;
		
	}
	
	
	
if (notContains(regPWInput, "QWERTYUIOPLKJHGFDSAZXCVBNM")
	|| notContains(regPWInput, "1234567890")) {
		alert('대문자, 숫자 포함시켜 입력하세요');

		regPWInput.value = "";
		regPWInput.focus();

		return false;

	}






	if(notEquals(regPWInput, regPW2Input)){
		alert('비번 재확인 실패');
		
		regPW2Input.value = "";
		regPW2Input.focus();
		
		return false;
	}

	if (isNotNumber(regPhoneNumberInput)) {
		alert('숫자만 입력하세요');

		regPhoneNumberInput.value = "";
		regPhoneNumberInput.focus();

		return false;
	}	










	return true;
}