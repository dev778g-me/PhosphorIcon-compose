package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FolderFill: ImageVector
    get() {
        if (_FolderFill != null) {
            return _FolderFill!!
        }
        _FolderFill = ImageVector.Builder(
            name = "Filled.FolderFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 72f)
                horizontalLineTo(131.31f)
                lineTo(104f, 44.69f)
                arcTo(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92.69f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200.62f)
                arcTo(15.41f, 15.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.39f, 216f)
                horizontalLineToRelative(177.5f)
                arcTo(15.13f, 15.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 200.89f)
                verticalLineTo(88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                close()
                moveTo(40f, 56f)
                horizontalLineTo(92.69f)
                lineToRelative(16f, 16f)
                horizontalLineTo(40f)
                close()
            }
        }.build()

        return _FolderFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderFill: ImageVector? = null
