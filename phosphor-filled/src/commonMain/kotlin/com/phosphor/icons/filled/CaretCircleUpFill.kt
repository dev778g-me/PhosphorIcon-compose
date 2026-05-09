package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CaretCircleUpFill: ImageVector
    get() {
        if (_CaretCircleUpFill != null) {
            return _CaretCircleUpFill!!
        }
        _CaretCircleUpFill = ImageVector.Builder(
            name = "Filled.CaretCircleUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(173.66f, 149.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(128f, 115.31f)
                lineTo(93.66f, 149.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineToRelative(40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(40f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173.66f, 149.66f)
                close()
            }
        }.build()

        return _CaretCircleUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _CaretCircleUpFill: ImageVector? = null
