package io.sandalika.buyer.models

data class Game(
    val id:Number,
    val title:String,
    val thumbnail:String,
    var developer:String
)
















//val assassinsCreed=Game(name = "Assassin's creed Mirage",
//    description = "Assassin's Creed Mirage officially launches on Thursday, Oct. 5, 2023, for PlayStation 4, PlayStation 5, Windows PC, Xbox One, and Xbox Series X/S. ",
//    imageUrl = "data:image/jpeg;base64,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")
//
//val spiderman2=Game(name = "Spider Man 2",
//    description = "Marvel's Spider-Man 2 is a 2023 action-adventure game developed by Insomniac Games and published by Sony Interactive Entertainment.",
//    imageUrl = "https://static.wikia.nocookie.net/ideas/images/8/8e/Spiderman2.png/revision/latest?cb=20210214104529")
//val shadowGambit= Game (
//    name = "Shadow Gambit",
//    description = "Shadow Gambit comes with some good difficulty options which allow players to tailor the experience to their play style" ,
//    imageUrl = "data:image/jpeg;base64,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"
//
//)
//val games= listOf<Game>(assassinsCreed, spiderman2, shadowGambit,assassinsCreed, spiderman2, shadowGambit,assassinsCreed, spiderman2, shadowGambit,assassinsCreed, spiderman2, shadowGambit);
//
