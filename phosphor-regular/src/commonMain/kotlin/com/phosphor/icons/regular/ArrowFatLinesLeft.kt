package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.ArrowFatLinesLeft: ImageVector
    get() {
        if (_ArrowFatLinesLeft != null) {
            return _ArrowFatLinesLeft!!
        }
        _ArrowFatLinesLeft = ImageVector.Builder(
            name = "Regular.ArrowFatLinesLeft",
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
                lineToRelative(-96f, 96f)
                lineToRelative(96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(32f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(-32f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 176f)
                lineTo(216f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 176f)
                lineTo(184f, 80f)
            }
        }.build()

        return _ArrowFatLinesLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesLeft: ImageVector? = null
