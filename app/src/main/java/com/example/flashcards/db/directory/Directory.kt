package com.example.flashcards.db.directory

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity(tableName = "flashcard_directories_table")
class Directory(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val creationDate: String?
)

/*
@Entity
data class DirectoryFlashcard(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val directoryId: Int,
    val flashcardId: Int
)

data class DirectoryWithFlashcards(
    @Embedded val directory: Directory,
    @Relation(
        parentColumn = "id",
        entityColumn = "directoryId",
        entity = DirectoryFlashcard::class,
        projection = "flashcardId"
    ) val flashcardIdList: List<Int>
)*/