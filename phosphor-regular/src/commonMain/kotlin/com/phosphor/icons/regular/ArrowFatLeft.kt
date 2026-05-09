package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowFatLeft: ImageVector
    get() {
        if (_ArrowFatLeft != null) {
            return _ArrowFatLeft!!
        }
        _ArrowFatLeft = ImageVector.Builder(
            name = "Regular.ArrowFatLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 32f)
                lineTo(24f, 128f)
                lineToRelative(96f, 96f)
                verticalLineTo(176f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(120f)
                close()
            }
        }.build()

        return _ArrowFatLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLeft: ImageVector? = null
