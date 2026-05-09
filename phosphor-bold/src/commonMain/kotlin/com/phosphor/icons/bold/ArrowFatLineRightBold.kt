package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowFatLineRightBold: ImageVector
    get() {
        if (_ArrowFatLineRightBold != null) {
            return _ArrowFatLineRightBold!!
        }
        _ArrowFatLineRightBold = ImageVector.Builder(
            name = "Bold.ArrowFatLineRightBold",
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
                moveTo(136f, 32f)
                lineToRelative(96f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 176f)
                lineTo(40f, 80f)
            }
        }.build()

        return _ArrowFatLineRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLineRightBold: ImageVector? = null
