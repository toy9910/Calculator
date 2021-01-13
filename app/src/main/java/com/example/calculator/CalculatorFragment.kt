package com.example.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.layout_calculator.*
import kotlinx.android.synthetic.main.layout_calculator.view.*
import java.lang.StringBuilder
import java.util.*

class CalculatorFragment : Fragment(), View.OnClickListener {
    var dataBuffer = StringBuilder()
    lateinit var stringTokenizer : StringTokenizer
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
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    fun evaluate(stack: Stack<String>) : String? {
        var result : String? = null
        while(stack.size > 2) {
            val operand2 = stack.pop().toDouble()
            val operation = stack.pop()
            val operand1 = stack.pop().toDouble()
            when(operation) {
                "+" -> {
                    val result = operand1 + operand2
                    stack.push(result.toString())
                }
                "-" -> {
                    val result = operand1 - operand2
                    stack.push(result.toString())
                }
            }
        }
        result = stack.pop()
        return result
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btn_0 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("0")
                dataBuffer.append("0")
            }
            R.id.btn_00 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("00")
                dataBuffer.append("00")
            }
            R.id.btn_1 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("1")
                dataBuffer.append("1")
            }
            R.id.btn_2 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("2")
                dataBuffer.append("2")
            }
            R.id.btn_3 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("3")
                dataBuffer.append("3")
            }
            R.id.btn_4 -> {
                if(tv_result.text == "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("4")
                dataBuffer.append("4")
            }
            R.id.btn_5 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("5")
                dataBuffer.append("5")
            }
            R.id.btn_6 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("6")
                dataBuffer.append("6")
            }
            R.id.btn_7 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("7")
                dataBuffer.append("7")
            }
            R.id.btn_8 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("8")
                dataBuffer.append("8")
            }
            R.id.btn_9 -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append("9")
                dataBuffer.append("9")
            }
            R.id.btn_point -> {
                if(tv_result.text != "") {
                    tv_result.setText("")
                    formula.setText("")
                }
                formula.append(".")
                dataBuffer.append(".")
            }
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
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 * operand2
                            stack.push(result.toString())
                        }
                        "/" -> {
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 / operand2
                            stack.push(result.toString())
                        }
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
                    stack.push(data)
                }
                stack.push("+")
                formula.append("+")
                dataBuffer.delete(0,dataBuffer.length)
            }
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
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 * operand2
                            stack.push(result.toString())
                        }
                        "/" -> {
                            val operand2 = data.toDouble()
                            val operand1 = stack.pop().toDouble()
                            val result = operand1 / operand2
                            stack.push(result.toString())
                        }
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
                    stack.push(data)
                }
                stack.push("-")
                formula.append("-")
                dataBuffer.delete(0,dataBuffer.length)
            }
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
                    stack.push(data)
                }
                formula.append("*")
                dataBuffer.delete(0,dataBuffer.length)
                stack.push("*")
            }
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
                    stack.push(data)
                }
                formula.append("/")
                dataBuffer.delete(0,dataBuffer.length)
                stack.push("/")
            }
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
                        val operand2 = data.toDouble()
                        val operand1 = stack.pop().toDouble()
                        val result = operand1 * operand2
                        stack.push(result.toString())
                    }
                    "/" -> {
                        val operand2 = data.toDouble()
                        val operand1 = stack.pop().toDouble()
                        val result = operand1 / operand2
                        stack.push(result.toString())
                    }
                    else -> {
                        stack.push(operation)
                        stack.push(data)
                    }
                }
                tv_result.setText(evaluate(stack))
                dataBuffer.delete(0,dataBuffer.length)
                stack.clear()
            }
        }

    }


}