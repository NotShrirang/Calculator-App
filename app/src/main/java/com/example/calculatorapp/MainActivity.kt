package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Calculator {
    var num1 = 0.0
    var num2 = 0.0
    var sign = 0
    fun add () : Double {
       return num1+num2
    }
    fun sub () :Double {
        return num1-num2
    }
    fun mul () :Double {
        return num1*num2
    }
    fun div () :Double {
        return (num1/num2.toFloat())
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textBox: TextView = findViewById(R.id.textView)
        val intButton0: Button = findViewById(R.id.button0)
        val intButton1: Button = findViewById(R.id.button1)
        val intButton2: Button = findViewById(R.id.button2)
        val intButton3: Button = findViewById(R.id.button3)
        val intButton4: Button = findViewById(R.id.button4)
        val intButton5: Button = findViewById(R.id.button5)
        val intButton6: Button = findViewById(R.id.button6)
        val intButton7: Button = findViewById(R.id.button7)
        val intButton8: Button = findViewById(R.id.button8)
        val intButton9: Button = findViewById(R.id.button9)
        val intButtonDot: Button = findViewById(R.id.buttonPt)
        val intButtonC: Button = findViewById(R.id.buttonC)
        val intButtonAdd: Button = findViewById(R.id.buttonplus)
        val intButtonSub: Button = findViewById(R.id.buttonminus)
        val intButtonMul: Button = findViewById(R.id.buttonMul)
        val intButtonDiv: Button = findViewById(R.id.buttonDiv)
        val intButtonEquals: Button = findViewById(R.id.buttonequals)
        val calc = Calculator()
        intButton0.setOnClickListener {
            val res = "${textBox.text}${intButton0.text}"
            textBox.text = res
        }
        intButton1.setOnClickListener {
            val res = "${textBox.text}${intButton1.text}"
            textBox.text = res
        }
        intButton2.setOnClickListener {
            val res = "${textBox.text}${intButton2.text}"
            textBox.text = res
        }
        intButton3.setOnClickListener {
            val res = "${textBox.text}${intButton3.text}"
            textBox.text = res
        }
        intButton4.setOnClickListener {
            val res = "${textBox.text}${intButton4.text}"
            textBox.text = res
        }
        intButton5.setOnClickListener {
            val res = "${textBox.text}${intButton5.text}"
            textBox.text = res
        }
        intButton6.setOnClickListener {
            val res = "${textBox.text}${intButton6.text}"
            textBox.text = res
        }
        intButton7.setOnClickListener {
            val res = "${textBox.text}${intButton7.text}"
            textBox.text = res
        }
        intButton8.setOnClickListener {
            val res = "${textBox.text}${intButton8.text}"
            textBox.text = res
        }
        intButton9.setOnClickListener {
            val res = "${textBox.text}${intButton9.text}"
            textBox.text = res
        }
        intButtonDot.setOnClickListener {
            val res = "${textBox.text}${intButtonDot.text}"
            textBox.text = res
        }
        intButtonC.setOnClickListener {
            textBox.text = ""
            calc.sign = 0
            calc.num1 = 0.0
            calc.num2 = 0.0
        }
        intButtonAdd.setOnClickListener {
            var res = textBox.text.toString()
            if(res == "") {
                val toast = Toast.makeText(this, "Please enter number first!", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                if (calc.sign == 0) {
                    calc.sign = 1
                    calc.num1 = res.toDouble()
                    res = ""
                }
            }
            textBox.text = res
        }
        intButtonSub.setOnClickListener {
            var res = textBox.text.toString()
            if(res == "") {
                val toast = Toast.makeText(this, "Please enter number first!", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                if (calc.sign == 0) {
                    calc.sign = 2
                    calc.num1 = res.toDouble()
                    res = ""
                }
            }
            textBox.text = res
        }
        intButtonMul.setOnClickListener {
            var res = textBox.text.toString()
            if(res == "") {
                val toast = Toast.makeText(this, "Please enter number first!", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                if (calc.sign == 0) {
                    calc.sign = 3
                    calc.num1 = res.toDouble()
                    res = ""
                }
            }
            textBox.text = res
        }
        intButtonDiv.setOnClickListener {
            var res = textBox.text.toString()
            if(res == "") {
                val toast = Toast.makeText(this, "Please enter number first!", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                if (calc.sign == 0) {
                    calc.sign = 4
                    calc.num1 = res.toDouble()
                    res = ""
                }
            }
            textBox.text = res
        }
        intButtonEquals.setOnClickListener {
            val res = textBox.text.toString()
            if(res == "") {
                val toast = Toast.makeText(this, "Please enter number first!", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                if ((calc.sign == 0)) {
                    val toast = Toast.makeText(this, "Invalid!", Toast.LENGTH_SHORT)
                    toast.show()
                }
                when (calc.sign) {
                    1 -> {
                        calc.num2 = "${textBox.text}".toDouble()
                        textBox.text = calc.add().toString()
                        calc.sign = 0
                        calc.num1 = 0.0
                        calc.num2 = 0.0
                    }
                    2 -> {
                        calc.num2 = "${textBox.text}".toDouble()
                        textBox.text = calc.sub().toString()
                        calc.sign = 0
                        calc.num1 = 0.0
                        calc.num2 = 0.0
                    }
                    3 -> {
                        calc.num2 = "${textBox.text}".toDouble()
                        textBox.text = calc.mul().toString()
                        calc.sign = 0
                        calc.num1 = 0.0
                        calc.num2 = 0.0
                    }
                    4 -> {
                        calc.num2 = "${textBox.text}".toDouble()
                        if (calc.num2 == 0.0) {
                            val toast = Toast.makeText(this, "Can't divide by zero!", Toast.LENGTH_SHORT)
                            toast.show()
                        }
                        else {
                            textBox.text = calc.div().toString()
                        }
                        calc.sign = 0
                        calc.num1 = 0.0
                        calc.num2 = 0.0
                    }
                    else -> {
                        val toast = Toast.makeText(this, "Invalid!", Toast.LENGTH_SHORT)
                        toast.show()
                    }
                }
            }
        }
    }
}