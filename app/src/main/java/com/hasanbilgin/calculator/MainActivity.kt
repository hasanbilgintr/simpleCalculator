package com.hasanbilgin.calculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hasanbilgin.calculator.databinding.ActivityMainBinding
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    //    var processString: String? = null
    //    var result: Double? = null
    //    var resultString: String? = null
    //    var isThereDot: Boolean = false
    //    var firstNum: Double = 0.0
    //    var firstNumOk: Boolean? = null
    //    var secondNum: Double = 0.0
    //    var secondNumOk: Boolean? = null
    //    var operation: Char? = null

    var firstNum: String = ""
    var secondNum: String = ""
    var operation: Char = '_'
    var isSecondNum: Boolean = false
    var result: Double = 0.0
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

    //        number1 = binding.editText.text.toString().toDoubleOrNull()
    //        number2 = binding.editText2.text.toString().toDoubleOrNull()
    //
    //        if (number1 == null || number2 == null) {
    //            binding.resultText.text = "Hata!"
    //        } else {
    //            result = number1!! + number2!!
    //            binding.resultText.text = "Sonuç: $result"
    //        }

    fun xFaktorOnClick(view: View) {
    }

    fun xAboveOnClick(view: View) {
    }

    fun allDeleteOnClick(view: View) {
        firstNum = ""
        secondNum = ""
        operation = '_'
        isSecondNum = false
        result = 0.0
        resultString = ""
        isHaveDot = false
        binding.processEdittext.setText("0")
        binding.resultEdittext.setText("0")
        //eksik birşeyler var
    }

    fun deleteOnclick(view: View) {
    }

    fun charDeleteOnClick(view: View) {
    }

    fun addZeroOnClick(view: View) {
        if (binding.processEdittext.text.toString() != "0") {
            if (!isSecondNum) {
                firstNum += "0"
                binding.processEdittext.setText(firstNum);
            } else if (secondNum != "") {
                secondNum += "0"
                binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
            }
        }
    }

    fun addCoupleZeroOnClick(view: View) {
        if (binding.processEdittext.text.toString() != "0") {
            if (!isSecondNum) {
                firstNum += "00"
                binding.processEdittext.setText(firstNum);
            } else if (secondNum != "") {
                secondNum += "00"
                binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum);
            }
        }
    }

    fun oneOnClick(view: View) {
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

    fun twoOnClick(view: View) {
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

    fun threeOnClick(view: View) {
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

    fun fourOnClick(view: View) {
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

    fun fiveOnClick(view: View) {
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

    fun sixOnClick(view: View) {
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

    fun sevenOnClick(view: View) {
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

    fun eightOnClick(view: View) {
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

    fun nineOnClick(view: View) {
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

    fun sumOnClick(view: View) {
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

    fun subOnClick(view: View) {
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

    fun multiplyOnClick(view: View) {
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

    fun divOnClick(view: View) {
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

    fun xSquareOnClick(view: View) {
    }

    fun xSquareRootOnClick(view: View) {
    }

    fun multiplyByMinusOneOnClick(view: View) {
    }

    fun dotOnClick(view: View) {
        if (isSecondNum) {
            if (secondNum != "") {
                if (!isHaveDot) {
                    secondNum = secondNum + "."
                    isHaveDot = true
                    binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
                }
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
    }

    fun isDouble(double: Double): String {
        didItEnd = true
        resultString = (double.toInt()).toString()
        if (resultString + ".0" == double.toString()) {
            return resultString
        } else {
            return double.toString()
        }
    }

    fun resultOnClick(view: View) {
        //0.1 düzeltildi...+
        if (!didItEnd) {
            if (firstNum != "" && secondNum != "") {
                when (operation) {
                    '+' -> {
                        result = (BigDecimal(firstNum) + BigDecimal(secondNum)).toDouble()
                        binding.resultEdittext.setText(isDouble(result))
                    }

                    '-' -> {
                        result = (BigDecimal(firstNum) - BigDecimal(secondNum)).toDouble()
                        binding.resultEdittext.setText(isDouble(result))
                    }

                    'x' -> {
                        result = (BigDecimal(firstNum) * BigDecimal(secondNum)).toDouble()
                        binding.resultEdittext.setText(isDouble(result))
                    }

                    '/' -> {
                        result = (BigDecimal(firstNum) / BigDecimal(secondNum)).toDouble()
                        binding.resultEdittext.setText(isDouble(result))
                    }

                    '_' -> binding.resultEdittext.setText("Error");
                }
            }
        }

    }
}