package com.hasanbilgin.calculator

import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hasanbilgin.calculator.databinding.ActivityMainBinding

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
        //        processString = ""
        //        binding.processEdittext.setText(processString)
        //        resultString = ""
        //        binding.resultEdittext.setText(resultString)
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
        operation = '+'
        isSecondNum = true
        binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
    }

    fun subOnClick(view: View) {
        operation = '-'
        isSecondNum = true
        binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
    }

    fun multiplyOnClick(view: View) {
        operation = 'x'
        isSecondNum = true
        binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
    }

    fun divOnClick(view: View) {
        operation = '/'
        isSecondNum = true
        binding.processEdittext.setText(firstNum + " " + operation + " " + secondNum)
    }


    fun xSquareOnClick(view: View) {
    }

    fun xSquareRootOnClick(view: View) {
    }

    fun multiplyByMinusOneOnClick(view: View) {
    }

    fun dotOnClick(view: View) {
        //        if (!isThereDot) {
        //            processString = binding.processEdittext.text.toString() + "."
        //            binding.processEdittext.setText(processString)
        //            isThereDot = true
        //        }
    }

    fun resultOnClick(view: View) {
        //resultString = binding.processEdittext.text.toString()
        //result = firstNum.toString().toDouble()

        //        if (firstNum != null && secondNum != null) {
        //            when (operation) {
        //                '+' -> result = (firstNum!! + secondNum!!).toString().toDouble()
        //                '-' -> result = (firstNum!! - secondNum!!).toString().toDouble()
        //                '*' -> result = (firstNum!! * secondNum!!).toString().toDouble()
        //                '/' -> result = (firstNum!! / secondNum!!).toString().toDouble()
        //                //else -> dayString = ""
        //            }
        //            println(result)
        //            binding.resultEdittext.setText(result.toString())
        //        }


        if (firstNum != "" && secondNum != "") {

            when (operation) {
                '+' -> {
                    result = firstNum.toDouble() + secondNum.toDouble()
                    binding.resultEdittext.setText(result.toString())
                }

                '-' -> {
                    result = firstNum.toDouble() + secondNum.toDouble()
                    binding.resultEdittext.setText(result.toString())
                }
                '*' -> {
                    result = firstNum.toDouble() + secondNum.toDouble()
                    binding.resultEdittext.setText(result.toString())
                }
                '/' -> {
                    result = firstNum.toDouble() + secondNum.toDouble()
                    binding.resultEdittext.setText(result.toString())
                }
                '_' -> binding.resultEdittext.setText("Error");
            }
        }


    }
}