package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TagChevronFill: ImageVector
    get() {
        if (_TagChevronFill != null) {
            return _TagChevronFill!!
        }
        _TagChevronFill = ImageVector.Builder(
            name = "Filled.TagChevronFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(246.66f, 132.44f)
                lineTo(201f, 200.88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 187.72f, 208f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.66f, -12.44f)
                lineTo(70.39f, 128f)
                lineToRelative(-45f, -67.56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 48f)
                horizontalLineTo(187.72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201f, 55.12f)
                lineToRelative(45.63f, 68.44f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 246.66f, 132.44f)
                close()
            }
        }.build()

        return _TagChevronFill!!
    }

@Suppress("ObjectPropertyName")
private var _TagChevronFill: ImageVector? = null
