package com.example.fizza

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var selector = 0
    var element1 = 0
    var element2 = 0
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val eleText1 = findViewById<TextView>(R.id.elementText1)
        val eleText2 = findViewById<TextView>(R.id.elementText2)
        val clearBtn = findViewById<ImageView>(R.id.clearBtn)
        val equalBtn = findViewById<ImageView>(R.id.equalBtn)
        val myDialoug = Dialog(this)
        myDialoug.setContentView(R.layout.popup)
        myDialoug.setCancelable(true)
        myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        myDialoug.show()
        clearBtn.setOnClickListener {
            clear()
            selector = 0
            eleText1.text = ""
            eleText2.text = ""
        }
        equalBtn.setOnClickListener{
            setElements(element1,element2)
        }
        oxygen.setOnClickListener{
            oxygen.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Oxygen"
                element1 = 0
            }
            else{
                eleText2.text = "Oxygen"
                element2 = 0
            }
            update()
        }
        hydrogen.setOnClickListener{
            hydrogen.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Hydrogen"
                element1 = 1
            }
            else{
                eleText2.text = "Hydrogen"
                element2 = 1
            }
            update()
        }
        nitrogen.setOnClickListener{
            nitrogen.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Nitrogen"
                element1 = 2
            }
            else{
                eleText2.text = "Nitrogen"
                element2 = 2
            }
            update()
        }
        sulphur.setOnClickListener{
            sulphur.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Sulphur"
                element1 = 3
            }
            else{
                eleText2.text = "Sulphur"
                element2 = 3
            }
            update()
        }
        zinc.setOnClickListener{
            zinc.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Zinc"
                element1 = 4
            }
            else{
                eleText2.text = "Zinc"
                element2 = 4
            }
            update()
        }
        carbon.setOnClickListener{
            carbon.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Carbon"
                element1 = 5
            }
            else{
                eleText2.text = "Carbon"
                element2 = 5
            }
            update()
        }
        iron.setOnClickListener{
            iron.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Iron"
                element1 = 6
            }
            else{
                eleText2.text = "Iron"
                element2 = 6
            }
            update()
        }
        sodium.setOnClickListener{
            sodium.isEnabled = false
            selector++
            if (selector == 1){
                eleText1.text = "Sodium"
                element1 = 7
            }
            else{
                eleText2.text = "Sodium"
                element2 = 7
                //setElements(element1,element2)
            }
            update()
        }
    }
    fun update(){
        if (selector == 2){
            oxygen.isEnabled = false
            hydrogen.isEnabled = false
            nitrogen.isEnabled = false
            sulphur.isEnabled = false
            zinc.isEnabled = false
            carbon.isEnabled = false
            iron.isEnabled = false
            sodium.isEnabled = false
        }
    }
    fun clear(){
        oxygen.isEnabled = true
        hydrogen.isEnabled = true
        nitrogen.isEnabled = true
        sulphur.isEnabled = true
        zinc.isEnabled = true
        carbon.isEnabled = true
        iron.isEnabled = true
        sodium.isEnabled = true
        setElements(10,10)
    }
@SuppressLint("SetTextI18n")
fun setElements(ele1: Int, ele2: Int){
    val ans = findViewById<TextView>(R.id.elementTextAns)
    if (ele1 == 10 && ele2 == 10){
        ans.text = ""
    }
    else{
        when (ele1) {
            0 -> { //Oxygen
                when (ele2) {
                    1 -> {
                        ans.text = "Water"
                    }
                    2 -> {
                        ans.text = "Nitrogen Oxide"
                    }
                    3 -> {
                        ans.text = "Sulphur Oxide"
                    }
                    4 -> {
                        ans.text = "Zinc Oxide"
                    }
                    5 -> {
                        ans.text = "Carbon Dioxide"
                    }
                    6 -> {
                        ans.text = "Iron Dioxide"
                    }
                    7 -> {
                        ans.text = "Oxidation"
                    }
                }
            }
            1 -> { // Hydrogen
                when (ele2) {
                    0 -> {
                        ans.text = "Water"
                    }
                    2 -> {
                        ans.text = "Ammonia"
                    }
                    3 -> {
                        ans.text = "Hydrogen Sulphide"
                    }
                    4 -> {
                        ans.text = "Zinc Hydride"
                    }
                    5 -> {
                        ans.text = "Hydrocarbons"
                    }
                    6 -> {
                        ans.text = "Iron Hydride"
                    }
                    7 -> {
                        ans.text = "Sodium Hydride"
                    }
                }
            }
            2 -> { // Nitrogen
                when (ele2) {
                    0 -> { // Oxygen
                        ans.text = "Nitrogen Oxide"
                    }
                    1 -> { // Hydrogen
                        ans.text = "Ammonia"
                    }
                    3 -> { // Sulphur
                        ans.text = "Sulfur Mono-nitride"
                    }
                    4 -> { // Zinc
                        ans.text = "Zinc Nitride"
                    }
                    5 -> { // Carbon
                        ans.text = "Carbon Nitrides"
                    }
                    6 -> { // Iron
                        ans.text = "Iron Nitrides"
                    }
                    7 -> { // Sodium
                        ans.text = "Sodium Nitride"
                    }
                }
            }
            3 -> { // Sulphur
                when (ele2) {
                    0 -> { // Oxygen
                        ans.text = "Sulphur Oxide"
                    }
                    1 -> { // Hydrogen
                        ans.text = "Hydrogen Sulfide"
                    }
                    2 -> { // Nitrogen
                        ans.text = "Sulfur Mono-nitride"
                    }
                    4 -> { // Zinc
                        ans.text = "Zinc Sulfide"
                    }
                    5 -> { // Carbon
                        ans.text = "Carbon Disulphide"
                    }
                    6 -> { // Iron
                        ans.text = "Iron Sulfide"
                    }
                    7 -> { // Sodium
                        ans.text = "Sodium Sulfide"
                    }
                }
            }
            4 -> { // Zinc
                when (ele2) {
                    0 -> { // Oxygen
                        ans.text = "Zinc Oxide"
                    }
                    1 -> { // Hydrogen
                        ans.text = "Zinc Hydride"
                    }
                    2 -> { // Nitrogen
                        ans.text = "Sulfur Mono-nitride"
                    }
                    3 -> { // Sulphur
                        ans.text = "Zinc Sulfide"
                    }
                    5 -> { // Carbon
                        ans.text = "Carbon Monoxide"
                    }
                    6 -> { // Iron
                        ans.text = "No Reaction"
                    }
                    7 -> { // Sodium
                        ans.text = "Sodium Zinc-ate"
                    }
                }
            }
            5 -> { // Carbon
                when (ele2) {
                    0 -> { // Oxygen
                        ans.text = "Carbon Dioxide"
                    }
                    1 -> { // Hydrogen
                        ans.text = "Hydrocarbons"
                    }
                    2 -> { // Nitrogen
                        ans.text = "Carbon Nitrides"
                    }
                    3 -> { // Sulphur
                        ans.text = "Carbon Disulphide"
                    }
                    4 -> { // Zinc
                        ans.text = "Carbon Monoxide"
                    }
                    6 -> { // Iron
                        ans.text = "Alloy"
                    }
                    7 -> { // Sodium
                        ans.text = "Sodium Carbide\n&\nSodium Carbonate"
                    }
                }
            }
            6 -> { // Iron
                when (ele2) {
                    0 -> { // Oxygen
                        ans.text = "Iron Oxide"
                    }
                    1 -> { // Hydrogen
                        ans.text = "Iron Hydride"
                    }
                    2 -> { // Nitrogen
                        ans.text = "Iron Nitrides"
                    }
                    3 -> { // Sulphur
                        ans.text = "Iron Sulfide"
                    }
                    4 -> { // Zinc
                        ans.text = "No Reaction"
                    }
                    5 -> { // Carbon
                        ans.text = "Alloy"
                    }
                    7 -> { // Sodium
                        ans.text = "No Reaction"
                    }
                }
            }
            7 -> { // Sodium
                when (ele2) {
                    0 -> { // Oxygen
                        ans.text = "Sodium Oxide"
                    }
                    1 -> { // Hydrogen
                        ans.text = "Sodium Hydride"
                    }
                    2 -> { // Nitrogen
                        ans.text = "Sodium Nitride"
                    }
                    3 -> { // Sulphur
                        ans.text = "Sodium Sulfide"
                    }
                    4 -> { // Zinc
                        ans.text = "sodium zinc-ate"
                    }
                    5 -> { // Carbon
                        ans.text = "Sodium Carbide\n&\nSodium Carbonate"
                    }
                    6 -> { // Iron
                        ans.text = "No Reaction"
                    }
                }
            }
        }

    }
}
}    /*
    Oxygen = 0
    Hydrogen = 1
    nitrogen = 2
    sulphur = 3
    zinc = 4
    carbon = 5
    iron = 6
    sodium = 7
    chlorine = 8
    aluminum = 9
    */
