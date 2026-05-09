package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ArrowBendDoubleUpRightFill: ImageVector
    get() {
        if (_ArrowBendDoubleUpRightFill != null) {
            return _ArrowBendDoubleUpRightFill!!
        }
        _ArrowBendDoubleUpRightFill = ImageVector.Builder(
            name = "Filled.ArrowBendDoubleUpRightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.66f, 109.66f)
                lineToRelative(-48f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(212.69f, 104f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 229.66f, 109.66f)
                close()
                moveTo(181.66f, 98.34f)
                lineTo(133.66f, 50.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 56f)
                lineTo(120f, 96.3f)
                arcTo(104.15f, 104.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -87.63f)
                lineTo(120f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineToRelative(48f, -48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 181.66f, 98.34f)
                close()
            }
        }.build()

        return _ArrowBendDoubleUpRightFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDoubleUpRightFill: ImageVector? = null
