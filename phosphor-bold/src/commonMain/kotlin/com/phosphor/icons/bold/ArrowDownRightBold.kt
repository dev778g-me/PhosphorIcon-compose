package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowDownRightBold: ImageVector
    get() {
        if (_ArrowDownRightBold != null) {
            return _ArrowDownRightBold!!
        }
        _ArrowDownRightBold = ImageVector.Builder(
            name = "Bold.ArrowDownRightBold",
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
                moveTo(64f, 64f)
                lineTo(192f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 192f)
                lineToRelative(104f, 0f)
                lineToRelative(0f, -104f)
            }
        }.build()

        return _ArrowDownRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightBold: ImageVector? = null
