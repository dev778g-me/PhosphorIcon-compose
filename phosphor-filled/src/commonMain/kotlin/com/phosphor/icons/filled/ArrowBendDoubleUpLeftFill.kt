package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowBendDoubleUpLeftFill: ImageVector
    get() {
        if (_ArrowBendDoubleUpLeftFill != null) {
            return _ArrowBendDoubleUpLeftFill!!
        }
        _ArrowBendDoubleUpLeftFill = ImageVector.Builder(
            name = "Filled.ArrowBendDoubleUpLeftFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(85.66f, 146.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineToRelative(-48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                lineToRelative(48f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85.66f, 61.66f)
                lineTo(43.31f, 104f)
                close()
                moveTo(136f, 96.3f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.66f, -5.66f)
                lineToRelative(-48f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 152f)
                verticalLineTo(112.37f)
                arcTo(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcTo(104.15f, 104.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 96.3f)
                close()
            }
        }.build()

        return _ArrowBendDoubleUpLeftFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDoubleUpLeftFill: ImageVector? = null
