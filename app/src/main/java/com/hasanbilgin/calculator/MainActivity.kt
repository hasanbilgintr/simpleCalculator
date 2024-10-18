package com.hasanbilgin.calculator

import android.os.Bundle
import android.view.View
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
        firstNum = ""
        secondNum = ""
        operation = '_'
        isSecondNum = false
        resultString = ""
        isHaveDot = false
        didItEnd = false
        binding.processEdittext.setText("0")
        binding.resultEdittext.setText("0")
    }

    fun deleteOnclick(view: View) {
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
                binding.processEdittext.setText(firstNum + " " + operation + "")
            }
        }
    }

    fun charDeleteOnClick(view: View) {
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
        } else {
            binding.processEdittext.setText("0");
        }
    }

    fun addCoupleZeroOnClick(view: View) {
        //düzeltilcek
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
    }

    fun twoOnClick(view: View) {
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
    }

    fun threeOnClick(view: View) {
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
    }

    fun fourOnClick(view: View) {
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
    }

    fun fiveOnClick(view: View) {
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
    }

    fun sixOnClick(view: View) {
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
    }

    fun sevenOnClick(view: View) {
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
    }

    fun eightOnClick(view: View) {
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
    }

    fun nineOnClick(view: View) {
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


    fun xFaktorOnClick(view: View) {
        //kontrol ller eklencek
        binding.processEdittext.setText(firstNum+"!")
        val firstNumInt = firstNum.toInt()
        var sonuc = 1
        for (i in 1..firstNumInt) {
            sonuc *= i
        }
        binding.resultEdittext.setText(sonuc.toString())
    }

    fun xAboveOnClick(view: View) {
    }


    //kare
    fun xSquareOnClick(view: View) {
    }

    //karekök
    fun xSquareRootOnClick(view: View) {
    }

    //-+
    fun multiplyByMinusOneOnClick(view: View) {
    }


    fun dotOnClick(view: View) {
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
                        binding.resultEdittext.setText(isDouble(firstNum.toDouble() * secondNum.toDouble()))
                    }

                    '/' -> {
                        binding.resultEdittext.setText(isDouble(firstNum.toDouble() / secondNum.toDouble()))
                    }

                    '_' -> binding.resultEdittext.setText("Error");
                }
            }
        }

    }
}