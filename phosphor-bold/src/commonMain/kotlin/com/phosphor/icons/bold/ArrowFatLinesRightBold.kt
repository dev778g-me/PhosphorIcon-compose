package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ArrowFatLinesRightBold: ImageVector
    get() {
        if (_ArrowFatLinesRightBold != null) {
            return _ArrowFatLinesRightBold!!
        }
        _ArrowFatLinesRightBold = ImageVector.Builder(
            name = "Bold.ArrowFatLinesRightBold",
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
                lineToRelative(-16f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(16f, 0f)
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 176f)
                lineTo(80f, 80f)
            }
        }.build()

        return _ArrowFatLinesRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesRightBold: ImageVector? = null
