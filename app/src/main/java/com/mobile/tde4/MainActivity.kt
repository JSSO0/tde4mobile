package com.mobile.tde4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val questionOne = findViewById<RadioButton>(R.id.questionOne)
        val questionTwo = findViewById<RadioButton>(R.id.questionTwo)
        val questionThree = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = 0
        questionOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta correta!", Toast.LENGTH_SHORT).show()
                questionCount  += 1
                val intent = Intent(this, QuestionTwo::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)
                startActivity(intent)
            }
        }

        questionTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta errada, se o Goku não tivesse era a certa!",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, QuestionTwo::class.java)

                startActivity(intent)
            }
        }

        questionThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "ai ta de Zoeira...", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionTwo::class.java)

                startActivity(intent)
            }
        }
    }
}

class QuestionTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_two)

        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)
        val question4 = findViewById<RadioButton>(R.id.question4)
        val question5 = findViewById<RadioButton>(R.id.question5)
        val question6 = findViewById<RadioButton>(R.id.question6)

        question6.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta correta!Parabéns por entender", Toast.LENGTH_SHORT)
                    .show()
                questionCount  += 1
                val intent = Intent(this, QuestionThree::class.java)

                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question4.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta errada, SNK tem história boa, mas...",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, QuestionThree::class.java)

                startActivity(intent)
            }
        }

        question5.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Aqui, é um assunto delicado", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionThree::class.java)

                startActivity(intent)
            }
        }
    }
}

class QuestionThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_three)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        val question1 = findViewById<RadioButton>(R.id.question7)
        val question2 = findViewById<RadioButton>(R.id.question8)
        val question3 = findViewById<RadioButton>(R.id.question9)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionFour::class.java)
                startActivity(intent)
            }

        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionFour::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionFour::class.java)
                startActivity(intent)

            }
        }
    }
}

class QuestionFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_four)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!Assim, eu não gosto, mas né...",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionFive::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Antes poderia ser, mas hoje em dia...", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionFive::class.java)
                startActivity(intent)

            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Nem considero isso um anime.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionFive::class.java)
                startActivity(intent)
            }
        }
    }
}

class QuestionFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_five)
        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionSix::class.java)
                startActivity(intent)
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionSix::class.java)
                startActivity(intent)

            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionSix::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }
    }
}

class QuestionSix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_six)
        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionSeven::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionSeven::class.java)
                startActivity(intent)
            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Resposta Errada", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionSeven::class.java)
                startActivity(intent)
            }
        }
    }
}

class QuestionSeven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_seven)
        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!Assim, eu não gosto, mas né...",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionEight::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Antes poderia ser, mas hoje em dia...", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionEight::class.java)
                startActivity(intent)

            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Nem considero isso um anime.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionEight::class.java)
                startActivity(intent)
            }
        }
    }
}

class QuestionEight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_eight)
        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!Assim, eu não gosto, mas né...",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionNine::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Antes poderia ser, mas hoje em dia...", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionNine::class.java)
                startActivity(intent)

            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Nem considero isso um anime.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionNine::class.java)
                startActivity(intent)
            }
        }
    }
}

class QuestionNine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_nine)
        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!Assim, eu não gosto, mas né...",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, QuestionTen::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Antes poderia ser, mas hoje em dia...", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, QuestionTen::class.java)
                startActivity(intent)


            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Nem considero isso um anime.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuestionTen::class.java)
                startActivity(intent)
            }
        }
    }
}

class QuestionTen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_ten)
        val question1 = findViewById<RadioButton>(R.id.questionOne)
        val question2 = findViewById<RadioButton>(R.id.questionTwo)
        val question3 = findViewById<RadioButton>(R.id.questionThree)
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        question1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(
                    this,
                    "Resposta correta!Assim, eu não gosto, mas né...",
                    Toast.LENGTH_SHORT
                ).show()
                questionCount  += 1

                val intent = Intent(this, ResultTest::class.java)
                intent.putExtra("QUESTION_COUNT", questionCount)

                startActivity(intent)
                System.out.println(questionCount);
            }
        }

        question2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Antes poderia ser, mas hoje em dia...", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, ResultTest::class.java)
                startActivity(intent)

            }
        }

        question3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Nem considero isso um anime.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ResultTest::class.java)
                startActivity(intent)
            }
        }
    }
}
class ResultTest: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_question)

        val totalQuestions = 10
        var questionCount = intent.getIntExtra("QUESTION_COUNT", 0)

        val percentualAcertos = (questionCount.toDouble() / totalQuestions) * 100

        val resultMessage = when {
            percentualAcertos < 50 -> ("Poxa você não foi muito bem. Mais sorte na próxima tentativa" +"\n"+ "Acertos: $questionCount" +"\n"+ "Erros: ${totalQuestions - questionCount}")
            percentualAcertos == 50.0 -> ("Muito bem, você está no caminho certo, vamos melhorar" +"\n"+ "Acertos: $questionCount" +"\n"+ "Erros: ${totalQuestions - questionCount}")
            else -> ("Uau, você é espetacular. Me curvo a sua sabedoria" +"\n"+ "Acertos: $questionCount" +"\n"+ "Erros: ${totalQuestions - questionCount}")
        }
        val textViewResult = findViewById<TextView>(R.id.result_message)
        textViewResult.text = resultMessage



    }
}