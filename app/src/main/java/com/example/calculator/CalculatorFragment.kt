package com.example.calculator

import android.os.Bundle
<<<<<<< HEAD
=======
import android.util.Log
>>>>>>> d7b0ceb (제곱 기능 추가)
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.layout_calculator.*
import kotlinx.android.synthetic.main.layout_calculator.view.*
import java.lang.StringBuilder
import java.util.*
<<<<<<< HEAD

class CalculatorFragment : Fragment(), View.OnClickListener {
    var dataBuffer = StringBuilder()
    lateinit var stringTokenizer : StringTokenizer
=======
import kotlin.math.pow

class CalculatorFragment : Fragment(), View.OnClickListener {
    var dataBuffer = StringBuilder() // 숫자 저장 공간
>>>>>>> d7b0ceb (제곱 기능 추가)
    val stack = Stack<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.layout_calculator,container,false)
        root.btn_0.setOnClickListener(this)
        root.btn_00.setOnClickListener(this)
        root.btn_1.setOnClickListener(this)
        root.btn_2.setOnClickListener(this)
        root.btn_3.setOnClickListener(this)
        root.btn_4.setOnClickListener(this)
        root.btn_5.setOnClickListener(this)
        root.btn_6.setOnClickListener(this)
        root.btn_7.setOnClickListener(this)
        root.btn_8.setOnClickListener(this)
        root.btn_9.setOnClickListener(this)
        root.btn_add.setOnClickListener(this)
        root.btn_divide.setOnClickListener(this)
        root.btn_subtract.setOnClickListener(this)
        root.btn_point.setOnClickListener(this)
        root.btn_multiply.setOnClickListener(this)
        root.btn_erase.setOnClickListener(this)
        root.btn_erase_all.setOnClickListener(this)
        root.btn_result.setOnClickListener(this)
<<<<<<< HEAD
=======
        root.btn_square.setOnClickListener(this)
>>>>>>> d7b0ceb (제곱 기능 추가)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

<<<<<<< HEAD

=======
>>>>>>> d7b0ceb (제곱 기능 추가)
    fun evaluate(stack: Stack<String>) : String? {
        var result : String? = null
        while(stack.size > 2) {
            val operand2 = stack.pop().toDouble()
            val operation = stack.pop()
            val operand1 = stack.pop().toDouble()
            when(operation) {
                "+" -> {
<<<<<<< HEAD
=======
                    Log.e("TEST", "hello!!!!")
>>>>>>> d7b0ceb (제곱 기능 추가)
                    val result = operand1 + operand2
                    stack.push(result.toString())
                }
                "-" -> {
                    val result = operand1 - operand2
                    stack.push(result.toString())
                }
            }
        }
<<<<<<< HEAD
        result = stack.pop()
=======
        result = stack.peek()
>>>>>>> d7b0ceb (제곱 기능 추가)
        return result
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btn_0 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) { // = 연산 이후 숫자를 누르면 식 초기화
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("0")
                dataBuffer.append("0")
            }
            R.id.btn_00 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("00")
                dataBuffer.append("00")
            }
            R.id.btn_1 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("1")
                dataBuffer.append("1")
            }
            R.id.btn_2 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("2")
                dataBuffer.append("2")
            }
            R.id.btn_3 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("3")
                dataBuffer.append("3")
            }
            R.id.btn_4 -> {
<<<<<<< HEAD
                if(tv_result.text == "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("4")
                dataBuffer.append("4")
            }
            R.id.btn_5 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("5")
                dataBuffer.append("5")
            }
            R.id.btn_6 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("6")
                dataBuffer.append("6")
            }
            R.id.btn_7 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("7")
                dataBuffer.append("7")
            }
            R.id.btn_8 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("8")
                dataBuffer.append("8")
            }
            R.id.btn_9 -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("9")
                dataBuffer.append("9")
            }
            R.id.btn_point -> {
<<<<<<< HEAD
                if(tv_result.text != "") {
=======
                if(stack.size == 1) {
                    stack.clear()
>>>>>>> d7b0ceb (제곱 기능 추가)
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append(".")
                dataBuffer.append(".")
            }
<<<<<<< HEAD
            R.id.btn_add -> {
                var data = ""
                if(dataBuffer.isEmpty())
                        data = stack.pop()
                else
                    data = dataBuffer.toString()

                if(stack.size > 0) {
                    val operation = stack.pop()
                    when(operation) {
                        "*" -> {
=======
            R.id.btn_add -> { // + 연산
                var data = ""
                if(dataBuffer.isEmpty()) { // = 계산 후 이어서 계산할 때
                    data = stack.pop()
                    formula.setText(data)
                }
                else // + 누르기 전에 입력한 수
                    data = dataBuffer.toString()

                if(stack.size > 0) { // + 앞에 식이 존재할 경우
                    val operation = stack.pop() // + 앞 연산자
                    when(operation) {
                        "*" -> { // 해당 연산자의 앞 연산자가 * 일 경우 예) 2*2+ , 4*3+ , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 * operand2
                            stack.push(result.toString())
                        }
<<<<<<< HEAD
                        "/" -> {
=======
                        "/" -> { // 해당 연산자의 앞 연산자가 / 일 경우 예) 8/2+ , 10/5+ , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 / operand2
                            stack.push(result.toString())
                        }
<<<<<<< HEAD
                        "-" -> {
=======
                        "-" -> { // 해당 연산자의 앞 연산자가 - 일 경우 예) 8-2+ , 9-1+ , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            var data2 = "-$data"
                            stack.push("+")
                            stack.push(data2)
                        }
<<<<<<< HEAD
                        else -> {
=======
                        "^" -> { // 해당 연산자의 앞 연산자가 ^ 일 경우 예) 2^3+ , 2+5^2+ , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            var result = operand1.pow(operand2) // ^ 연산 계산
                            if(!stack.isEmpty()) { // ^ 연산의 앞에 연산이 있는 경우 예) 2+5^2+ , 12-3^2+ ...
                                val operation2 = stack.pop() // ^ 바로 앞 연산자
                                when(operation2) {
                                    "+" -> {
                                        stack.push(operation2)
                                        stack.push(result.toString())
                                    }
                                    "-" -> {
                                        stack.push("+")
                                        stack.push("-$result")
                                    }
                                    "*" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result *= operand3
                                        stack.push(result.toString())
                                    }
                                    "/" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result /= operand3
                                        stack.push(result.toString())
                                    }
                                }
                            }
                            else { // ^ 연산 바로 앞에 연산이 없는 경우 예) 2^3+ , 3^2+ , ...
                                stack.push(result.toString())
                            }
                        }
                        else -> { // 해당 연산자의 앞 연산자가 + 일 경우 예) 8+2+ , 10+5+ , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            stack.push(operation)
                            stack.push(data)
                        }
                    }
                }
<<<<<<< HEAD
                else {
=======
                else { // 식의 맨 처음 부분을 입력할 경우
>>>>>>> d7b0ceb (제곱 기능 추가)
                    stack.push(data)
                }
                stack.push("+")
                formula.append("+")
                dataBuffer.delete(0,dataBuffer.length)
            }
<<<<<<< HEAD
            R.id.btn_subtract -> {
                var data = ""
                if(dataBuffer.isEmpty())
                    data = stack.pop()
                else
                    data = dataBuffer.toString()
                if(stack.size > 0) {
                    val operation = stack.pop()
                    when(operation) {
                        "*" -> {
=======
            R.id.btn_subtract -> { // - 연산
                var data = ""
                if(dataBuffer.isEmpty()) // = 계산 후 이어서 계산할 때
                    data = stack.pop()
                else
                    data = dataBuffer.toString() // - 누르기 전에 입력한 수
                if(stack.size > 0) { // - 앞에 식이 존재할 경우
                    val operation = stack.pop()
                    when(operation) {
                        "+" -> { // 해당 연산자의 앞 연산자가 + 일 경우 예) 8+2- , 10+5- , ...
                            stack.push(operation)
                            stack.push(data)
                        }
                        "-" -> { // 해당 연산자의 앞 연산자가 - 일 경우 예) 8-2- , 9-1- , ...
                            var data2 = "-$data"
                            stack.push("+")
                            stack.push(data2)
                        }
                        "*" -> { // 해당 연산자의 앞 연산자가 * 일 경우 예) 8*2- , 10*5- , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 * operand2
                            stack.push(result.toString())
                        }
<<<<<<< HEAD
                        "/" -> {
=======
                        "/" -> { // 해당 연산자의 앞 연산자가 / 일 경우 예) 8/2- , 10/5- , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 / operand2
                            stack.push(result.toString())
                        }
<<<<<<< HEAD
                        "-" -> {
                            var data2 = "-$data"
                            stack.push("+")
                            stack.push(data2)
                        }
                        else -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                    }
                }
                else {
=======
                        "^" -> { // 해당 연산자의 앞 연산자가 ^ 일 경우 예) 2^3- , 2+5^2- , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            var result = operand1.pow(operand2) // ^ 연산 계산
                            if(!stack.isEmpty()) { // ^ 연산의 앞에 연산이 있는 경우 예) 2+5^2- , 12-3^2- , ...
                                val operation2 = stack.pop() // ^ 바로 앞 연산자
                                when(operation2) {
                                    "+" -> {
                                        stack.push(operation2)
                                        stack.push(result.toString())
                                    }
                                    "-" -> {
                                        stack.push("+")
                                        stack.push("-$result")
                                    }
                                    "*" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result *= operand3
                                        stack.push(result.toString())
                                    }
                                    "/" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result /= operand3
                                        stack.push(result.toString())
                                    }
                                }
                            }
                            else { // ^ 연산 바로 앞에 연산이 없는 경우 예) 2^3- , 3^2- , ...
                                stack.push(result.toString())
                            }
                        }
                    }
                }
                else { // 식의 맨 처음 부분을 입력할 경우
>>>>>>> d7b0ceb (제곱 기능 추가)
                    stack.push(data)
                }
                stack.push("-")
                formula.append("-")
                dataBuffer.delete(0,dataBuffer.length)
            }
<<<<<<< HEAD
            R.id.btn_multiply -> {
                var data = ""
                if(dataBuffer.isEmpty())
                    data = stack.pop()
                else
                    data = dataBuffer.toString()
                if(!stack.empty()) {
                    val operation = stack.pop()
                    when(operation) {
                        "-" -> {
=======
            R.id.btn_multiply -> { // * 연산
                var data = ""
                if(dataBuffer.isEmpty()) // = 계산 후 이어서 계산할 때
                    data = stack.pop()
                else // * 누르기 전에 입력한 수
                    data = dataBuffer.toString()
                if(!stack.empty()) { // * 앞에 식이 존재할 경우
                    val operation = stack.pop() // * 앞의 연산자
                    when(operation) {
                        "+" -> { // 해당 연산자의 앞 연산자가 + 일 경우 예) 8+2* , 9+1* , ...
                            stack.push(operation)
                            stack.push(data)
                        }
                        "-" -> { // 해당 연산자의 앞 연산자가 - 일 경우 예) 8-2* , 9-1* , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            var data2 = "-$data"
                            stack.push("+")
                            stack.push(data2)
                        }
<<<<<<< HEAD
                        else -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                    }
                }
                else {
=======
                        "*" -> { // 해당 연산자의 앞 연산자가 * 일 경우 예) 8*2* , 10*5* , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 * operand2
                            stack.push(result.toString())
                        }
                        "/" -> { // 해당 연산자의 앞 연산자가 / 일 경우 예) 8/2* , 10/5* , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 / operand2
                            stack.push(result.toString())
                        }
                        "^" -> { // 해당 연산자의 앞 연산자가 ^ 일 경우 예) 2^3* , 2+5^2* , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            var result = operand1.pow(operand2) // ^ 연산 계산
                            if(!stack.isEmpty()) { // ^ 연산의 앞에 연산이 있는 경우 예) 2+5^2* , 12-3^2* , ...
                                val operation2 = stack.pop() // ^ 바로 앞 연산자
                                when(operation2) {
                                    "+" -> {
                                        stack.push(operation2)
                                        stack.push(result.toString())
                                    }
                                    "-" -> {
                                        stack.push("+")
                                        stack.push("-$result")
                                    }
                                    "*" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result *= operand3
                                        stack.push(result.toString())
                                    }
                                    "/" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result /= operand3
                                        stack.push(result.toString())
                                    }
                                }
                            }
                            else { // ^ 연산 바로 앞에 연산이 없는 경우 예) 2^3* , 3^2* , ...
                                stack.push(result.toString())
                            }
                        }
                    }
                }
                else { // 식의 맨 처음 부분을 입력할 경우
>>>>>>> d7b0ceb (제곱 기능 추가)
                    stack.push(data)
                }
                formula.append("*")
                dataBuffer.delete(0,dataBuffer.length)
                stack.push("*")
            }
<<<<<<< HEAD
            R.id.btn_divide -> {
                var data = ""
                if(dataBuffer.isEmpty())
                    data = stack.pop()
                else
                    data = dataBuffer.toString()
                if(!stack.empty()) {
                    val operation = stack.pop()
                    when(operation) {
                        "-" -> {
=======
            R.id.btn_divide -> { // / 연산
                var data = ""
                if(dataBuffer.isEmpty()) // = 계산 후 이어서 계산할 때
                    data = stack.pop()
                else // / 누르기 전에 입력한 수
                    data = dataBuffer.toString()
                if(!stack.empty()) { // / 앞에 식이 존재할 경우
                    val operation = stack.pop() // / 앞의 연산자
                    when(operation) {
                        "+" -> { // / 앞의 연산자가 + 일 경우 예) 8+2/ , 9+1/ , ...
                            stack.push(operation)
                            stack.push(data)
                        }
                        "-" -> { // / 앞의 연산자가 - 일 경우 예) 8-2/ , 9-1/ , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                            var data2 = "-$data"
                            stack.push("+")
                            stack.push(data2)
                        }
<<<<<<< HEAD
                        else -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                    }
                }
                else {
=======
                        "*" -> { // / 앞의 연산자가 * 일 경우 예) 8*2/ , 10*5/ , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 * operand2
                            stack.push(result.toString())
                        }
                        "/" -> { // / 앞의 연산자가 / 일 경우 예) 8/2/ , 10/5/ , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 / operand2
                            stack.push(result.toString())
                        }
                        "^" -> { // / 앞의 연산자가 ^ 일 경우 예) 2^3/ , 2+5^2/ , ...
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            var result = operand1.pow(operand2)
                            if(!stack.isEmpty()) { // ^ 연산의 앞에 연산이 있는 경우 예) 2+5^2/ , 12-3^2/ , ...
                                val operation2 = stack.pop() // ^ 바로 앞 연산자
                                when(operation2) {
                                    "+" -> {
                                        stack.push(operation2)
                                        stack.push(result.toString())
                                    }
                                    "-" -> {
                                        stack.push("+")
                                        stack.push("-$result")
                                    }
                                    "*" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result *= operand3
                                        stack.push(result.toString())
                                    }
                                    "/" -> {
                                        val operand3 = stack.pop().toDouble()
                                        result /= operand3
                                        stack.push(result.toString())
                                    }
                                }
                            }
                            else { // ^ 연산 바로 앞에 연산이 없는 경우 예) 2^3/ , 3^2/ , ...
                                stack.push(result.toString())
                            }
                        }
                    }
                }
                else { // 식의 맨 처음 부분을 입력할 경우
>>>>>>> d7b0ceb (제곱 기능 추가)
                    stack.push(data)
                }
                formula.append("/")
                dataBuffer.delete(0,dataBuffer.length)
                stack.push("/")
            }
<<<<<<< HEAD
            R.id.btn_erase -> {
                if(dataBuffer.isEmpty())
                    stack.pop()
                else
                    dataBuffer.delete(dataBuffer.length - 1, dataBuffer.length)
                val text_formula = StringBuilder(formula.text)
                text_formula.delete(text_formula.length-1,text_formula.length)
                formula.text = text_formula.toString()
            }
            R.id.btn_erase_all -> {
                formula.setText("")
                tv_result.setText("")
                dataBuffer.delete(0,dataBuffer.length)
                while(!stack.empty()) {
                    stack.pop()
                }
            }
            R.id.btn_result -> {
                var data = dataBuffer.toString()
                val operation = stack.pop()
                when(operation) {
                    "*" -> {
=======
            R.id.btn_erase -> { // 한 칸 지우기
                if(formula.text == ""){}
                else {
                    if (dataBuffer.isEmpty())
                        stack.pop()
                    else
                        dataBuffer.delete(dataBuffer.length - 1, dataBuffer.length)
                    val text_formula = StringBuilder(formula.text)
                    text_formula.delete(text_formula.length - 1, text_formula.length)
                    formula.text = text_formula.toString()
                }
            }
            R.id.btn_erase_all -> { // 모두 지우기
                formula.setText("")
                tv_result.setText("")
                dataBuffer.delete(0,dataBuffer.length)
                stack.clear()
            }
            R.id.btn_result -> { // = 연산
                var data = dataBuffer.toString() // = 누르기 전에 입력한 수
                val operation = stack.pop() // = 바로 앞 연산자
                when(operation) { // 마지막 연산 계산
                    "*" -> { // 마지막 연산이 * 일 경우  예) 2+1+4*3= , 3+5*2= , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                        val operand2 = data.toDouble()
                        val operand1 = stack.pop().toDouble()
                        val result = operand1 * operand2
                        stack.push(result.toString())
                    }
<<<<<<< HEAD
                    "/" -> {
=======
                    "/" -> { // 마지막 연산이 / 일 경우  예) 2+1+4/2= , 3+6/2= , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                        val operand2 = data.toDouble()
                        val operand1 = stack.pop().toDouble()
                        val result = operand1 / operand2
                        stack.push(result.toString())
                    }
<<<<<<< HEAD
                    else -> {
=======
                    "^" -> { // 마지막 연산이 ^ 일 경우  예) 8+2^3= , 4^2= , ...
                        val operand2 = data.toDouble()
                        val operand1 = stack.pop().toDouble()
                        var result = operand1.pow(operand2)
                        if(!stack.isEmpty()) { // ^ 연산 앞에 식이 있을 경우  예) 8+2^3= , 23-4^2= , ...
                            val operation2 = stack.pop()
                            if (operation2 == "-") {
                                stack.push("+")
                                val result_str = "-${result}"
                                stack.push(result_str)
                            } else if (operation2 == "*") {
                                val operand3 = stack.pop().toDouble()
                                result *= operand3
                                stack.push(result.toString())
                            } else if (operation2 == "/") {
                                val operand3 = stack.pop().toDouble()
                                result /= operand3
                                stack.push(result.toString())
                            }
                            else {
                                stack.push(operation2)
                                stack.push(result.toString())
                            }
                        }
                        else { // ^ 연산 앞에 식이 없을 경우  예) 2^3= , 4^2= , ...
                            stack.push(result.toString())
                        }
                    }
                    else -> { // 마지막 연산이 + 또는 - 일 경우  예) 8+2+3= , 4-2= , ...
>>>>>>> d7b0ceb (제곱 기능 추가)
                        stack.push(operation)
                        stack.push(data)
                    }
                }
                tv_result.setText(evaluate(stack))
                dataBuffer.delete(0,dataBuffer.length)
<<<<<<< HEAD
                stack.clear()
            }
        }

    }


=======
            }
            R.id.btn_square -> { // ^ 연산
                var data = ""
                if(dataBuffer.isEmpty()) // = 계산 후 이어서 계산할 때
                    data = stack.pop()
                else // ^ 누르기 전에 입력한 수
                    data = dataBuffer.toString()
                if(!stack.empty()) { // ^ 앞에 식이 존재할 경우
                    val operation = stack.pop() // ^ 앞의 연산자
                    when(operation) {
                        "-" -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                        "+" -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                        "*" -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                        "/" -> {
                            stack.push(operation)
                            stack.push(data)
                        }
                        "^" -> {
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1.pow(operand2)
                            stack.push(result.toString())
                        }
                    }
                }
                else { // 식의 맨 처음 부분을 입력할 경우
                    stack.push(data)
                }
                formula.append("^")
                dataBuffer.delete(0,dataBuffer.length)
                stack.push("^")
            }
        }
    }
>>>>>>> d7b0ceb (제곱 기능 추가)
}