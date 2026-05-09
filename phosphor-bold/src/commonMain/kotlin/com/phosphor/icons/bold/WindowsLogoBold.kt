package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.WindowsLogoBold: ImageVector
    get() {
        if (_WindowsLogoBold != null) {
            return _WindowsLogoBold!!
        }
        _WindowsLogoBold = ImageVector.Builder(
            name = "Bold.WindowsLogoBold",
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
                moveTo(92f, 108f)
                lineToRelative(0f, -46.91f)
                lineToRelative(-60f, 10.91f)
                lineToRelative(0f, 36f)
                lineToRelative(60f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 108f)
                lineToRelative(0f, -68f)
                lineToRelative(-76f, 13.82f)
                lineToRelative(0f, 54.18f)
                lineToRelative(76f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 148f)
                lineToRelative(0f, 46.91f)
                lineToRelative(-60f, -10.91f)
                lineToRelative(0f, -36f)
                lineToRelative(60f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 148f)
                lineToRelative(0f, 68f)
                lineToRelative(-76f, -13.82f)
                lineToRelative(0f, -54.18f)
                lineToRelative(76f, 0f)
                close()
            }
        }.build()

        return _WindowsLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _WindowsLogoBold: ImageVector? = null
