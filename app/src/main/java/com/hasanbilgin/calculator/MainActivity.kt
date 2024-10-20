package com.hasanbilgin.calculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hasanbilgin.calculator.databinding.ActivityMainBinding
import java.math.BigDecimal
import kotlin.time.times

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var firstNum: String = ""
    var secondNum: String = ""
    var operation: Char = '_'
    var isSecondNum: Boolean = false
    var resultString: String = ""
    var isHaveDot: Boolean = false
    var didItEnd: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun allDeleteOnClick(view: View) {
        try {
            firstNum = ""
            secondNum = ""
            operation = '_'
            isSecondNum = false
            resultString = ""
            isHaveDot = false
            didItEnd = false
            binding.processEdittext.setText("0")
            binding.resultEdittext.setText("0")
        } catch (e: Exception) {
        }
    }

    fun deleteOnclick(view: View) {
        try {
            if (!didItEnd) {
                if (!isSecondNum) {
                    firstNum = ""
                    isHaveDot = false
                    didItEnd = false
                    binding.processEdittext.setText("0")
                } else {
                    secondNum = ""
                    isHaveDot = false
                    didItEnd = false
                    binding.processEdittext.setText(firstNum + " " + operation + " ")
                }
            }
        } catch (e: Exception) {

        }
    }

    fun charDeleteOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (!isSecondNum) {
                    if (firstNum.length > 1) {
                        val firstNumLast = firstNum.last()
                        if (firstNumLast == '.') {
                            isHaveDot = false
                        }
                        firstNum = firstNum.dropLast(1)
                        binding.processEdittext.setText(firstNum)
                    } else {
                        firstNum = ""
                        isHaveDot = false
                        binding.processEdittext.setText("0")
                    }
                } else {
                    if (secondNum.length > 1) {
                        val secondNumLast = secondNum.last()
                        if (secondNumLast == '.') {
                            isHaveDot = false
                        }
                        secondNum = secondNum.dropLast(1)
                        binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                    } else {
                        secondNum = ""
                        isHaveDot = false
                        binding.processEdittext.setText(firstNum + " " + operation + " ")
                    }
                }
            }
        } catch (e: Exception) {

        }
    }

    fun addZeroOnClick(view: View) {
        try {
            if (binding.processEdittext.text.toString() != "0") {
                if (!isSecondNum) {
                    firstNum += "0"
                    binding.processEdittext.setText(firstNum);
                } else if (secondNum != "") {
                    secondNum += "0"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            } else {
                binding.processEdittext.setText("0");
            }
        } catch (e: Exception) {

        }
    }

    fun addCoupleZeroOnClick(view: View) {
        try {
            if (binding.processEdittext.text.toString() != "0") {
                if (!isSecondNum) {
                    firstNum += "00"
                    binding.processEdittext.setText(firstNum);
                } else if (secondNum != "") {
                    secondNum += "00"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun oneOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "1"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "1"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun twoOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "2"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "2"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun threeOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "3"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "3"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun fourOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "4"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "4"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun fiveOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "5"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "5"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun sixOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "6"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "6"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun sevenOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "7"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "7"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun eightOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "8"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "8"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun nineOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (binding.processEdittext.text.toString() == "0") {
                    binding.processEdittext.setText("");
                }
                if (!isSecondNum) {
                    firstNum += "9"
                    binding.processEdittext.setText(firstNum);
                } else {
                    secondNum += "9"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun sumOnClick(view: View) {
        try {
            if (firstNum != "") {
                if (!didItEnd) {
                    operation = '+'
                    isSecondNum = true
                    isHaveDot = false
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                } else {
                    operation = '+'
                    isSecondNum = true
                    isHaveDot = false
                    didItEnd = false
                    firstNum = binding.resultEdittext.text.toString()
                    secondNum = ""
                    binding.processEdittext.setText(firstNum + " " + operation);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun subOnClick(view: View) {
        try {
            if (firstNum != "") {
                if (!didItEnd) {
                    operation = '-'
                    isSecondNum = true
                    isHaveDot = false
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                } else {
                    operation = '-'
                    isSecondNum = true
                    isHaveDot = false
                    didItEnd = false
                    firstNum = binding.resultEdittext.text.toString()
                    secondNum = ""
                    binding.processEdittext.setText(firstNum + " " + operation);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun multiplyOnClick(view: View) {
        try {
            if (firstNum != "") {
                if (!didItEnd) {
                    operation = 'x'
                    isSecondNum = true
                    isHaveDot = false
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                } else {
                    operation = 'x'
                    isSecondNum = true
                    isHaveDot = false
                    didItEnd = false
                    firstNum = binding.resultEdittext.text.toString()
                    secondNum = ""
                    binding.processEdittext.setText(firstNum + " " + operation);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun divOnClick(view: View) {
        try {
            if (firstNum != "") {
                if (!didItEnd) {
                    operation = '/'
                    isSecondNum = true
                    isHaveDot = false
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                } else {
                    operation = '/'
                    isSecondNum = true
                    isHaveDot = false
                    didItEnd = false
                    firstNum = binding.resultEdittext.text.toString()
                    secondNum = ""
                    binding.processEdittext.setText(firstNum + " " + operation);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun xFaktorOnClick(view: View) {
        try {
            if (!isSecondNum && operation == '_' && firstNum != "") {
                if (firstNum.toInt() < 21 && firstNum.toInt() > 0) {
                    didItEnd = true
                    binding.processEdittext.setText(firstNum + "!")
                    var sonuc: Long = 1
                    for (i in 1..firstNum.toInt()) {
                        sonuc *= i
                        println(sonuc)
                    }
                    binding.resultEdittext.setText(sonuc.toString())
                } else {
                    Toast.makeText(this@MainActivity, "En Fazla 20 Girilebilir", Toast.LENGTH_SHORT).show()
                }
            }
        } catch (e: Exception) {

        }
    }

    fun xAboveOnClick(view: View) {
        try {
            if (firstNum != "") {
                if (!didItEnd) {
                    operation = '^'
                    isSecondNum = true
                    isHaveDot = false
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                } else {
                    operation = '^'
                    isSecondNum = true
                    isHaveDot = false
                    didItEnd = false
                    firstNum = binding.resultEdittext.text.toString()
                    secondNum = ""
                    binding.processEdittext.setText(firstNum + " " + operation);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun xSquareOnClick(view: View) {
        try {
            if (!isSecondNum && operation == '_' && firstNum != "") {
                didItEnd = true
                binding.processEdittext.setText(firstNum + " * " + firstNum)
                binding.resultEdittext.setText(isDouble((firstNum.toBigDecimal() * firstNum.toBigDecimal()).toDouble()))
            }
        } catch (e: Exception) {

        }
    }

    fun xSquareRootOnClick(view: View) {
        try {
            if (!isSecondNum && operation == '_' && firstNum != "") {
                didItEnd = true
                binding.processEdittext.setText("√(" + firstNum + ")")
                binding.resultEdittext.setText(isDouble(Math.sqrt(firstNum.toDouble())))
            }
        } catch (e: Exception) {

        }
    }

    fun threeZeroButtonOnClick(view: View) {
        try {
            if (binding.processEdittext.text.toString() != "0") {
                if (!isSecondNum) {
                    firstNum += "000"
                    binding.processEdittext.setText(firstNum);
                } else if (secondNum != "") {
                    secondNum += "000"
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
                }
            }
        } catch (e: Exception) {

        }
    }

    fun dotOnClick(view: View) {
        try {
            if (binding.processEdittext.text.toString() != "0") {
                if (isSecondNum) {
                    if (secondNum != "") {
                        if (!isHaveDot) {
                            secondNum = secondNum + "."
                            isHaveDot = true
                            binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                        }
                    } else {
                        secondNum = "0" + "."
                        isHaveDot = true
                        binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                    }
                } else {
                    if (firstNum != "") {
                        if (!isHaveDot) {
                            firstNum = firstNum + "."
                            isHaveDot = true
                            binding.processEdittext.setText(firstNum)
                        }
                    }
                }
            } else {
                firstNum = "0" + "."
                isHaveDot = true
                binding.processEdittext.setText(firstNum)
            }
        } catch (e: Exception) {

        }
    }

    fun isDouble(double: Double): String {
        try {
            didItEnd = true
            resultString = (double.toInt()).toString()
            if (resultString + ".0" == double.toString()) {
                return resultString
            } else {
                return double.toString()
            }
        } catch (e: Exception) {
            return "Error"
        }
    }

    fun resultOnClick(view: View) {
        try {
            if (!didItEnd) {
                if (firstNum != "" && secondNum != "") {
                    when (operation) {
                        '+' -> {
                            binding.resultEdittext.setText(isDouble((firstNum.toBigDecimal() + secondNum.toBigDecimal()).toDouble()))
                        }

                        '-' -> {
                            binding.resultEdittext.setText(isDouble((firstNum.toBigDecimal() - secondNum.toBigDecimal()).toDouble()))
                        }

                        'x' -> {
                            binding.resultEdittext.setText(isDouble((firstNum.toBigDecimal() * secondNum.toBigDecimal()).toDouble()))
                        }

                        '/' -> {
                            binding.resultEdittext.setText(isDouble(firstNum.toDouble() / secondNum.toDouble()))
                        }

                        '^' -> {
                            binding.resultEdittext.setText(isDouble(Math.pow(firstNum.toDouble(), secondNum.toDouble())))
                        }

                        '_' -> binding.resultEdittext.setText("Error");
                    }
                }
            }
        } catch (e: Exception) {

        }
    }
}