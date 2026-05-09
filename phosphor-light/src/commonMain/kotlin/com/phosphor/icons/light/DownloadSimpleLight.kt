package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.DownloadSimpleLight: ImageVector
    get() {
        if (_DownloadSimpleLight != null) {
            return _DownloadSimpleLight!!
        }
        _DownloadSimpleLight = ImageVector.Builder(
            name = "Light.DownloadSimpleLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 144f)
                lineTo(128f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 144f)
                lineToRelative(0f, 64f)
                lineToRelative(-176f, 0f)
                lineToRelative(0f, -64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 104f)
                lineToRelative(-40f, 40f)
                lineToRelative(-40f, -40f)
            }
        }.build()

        return _DownloadSimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadSimpleLight: ImageVector? = null
