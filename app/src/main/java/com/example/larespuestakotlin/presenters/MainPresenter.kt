package com.example.larespuestakotlin.presenters

class MainPresenter(private val view: MainActivityView) {

    private val answers = arrayOf(42, -10, 0, 100, 1000)
    private val answer = 42

    fun findAnswer(){
        var output = "Puede que nunca lo sepamos"
        if(searchAnswer() == answer){
            output = answer.toString()
        }
        view.printMessage("La respuesta a la vida, al universo a todo es:\n" +
                "\n $output")
    }

    private fun searchAnswer(): Int {
        return answers.find { it == answer } ?: -1
        /*
        val value = answers.find { it == answer }
        return if (value != null){
            value
        }else{
            -1
        }*/
    }

}

interface MainActivityView{
    fun printMessage(message: String)
}