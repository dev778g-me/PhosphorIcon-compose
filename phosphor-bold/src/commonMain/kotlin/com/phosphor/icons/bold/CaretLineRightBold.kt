package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CaretLineRightBold: ImageVector
    get() {
        if (_CaretLineRightBold != null) {
            return _CaretLineRightBold!!
        }
        _CaretLineRightBold = ImageVector.Builder(
            name = "Bold.CaretLineRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 48f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 48f)
                lineTo(184f, 208f)
            }
        }.build()

        return _CaretLineRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineRightBold: ImageVector? = null
