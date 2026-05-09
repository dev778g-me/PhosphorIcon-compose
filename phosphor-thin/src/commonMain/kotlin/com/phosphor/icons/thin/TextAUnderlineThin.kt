package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.TextAUnderlineThin: ImageVector
    get() {
        if (_TextAUnderlineThin != null) {
            return _TextAUnderlineThin!!
        }
        _TextAUnderlineThin = ImageVector.Builder(
            name = "Thin.TextAUnderlineThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 168f)
                lineToRelative(-64f, -136f)
                lineToRelative(-64f, 136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(173.18f, 128f)
                lineTo(82.82f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 216f)
                lineTo(216f, 216f)
            }
        }.build()

        return _TextAUnderlineThin!!
    }

@Suppress("ObjectPropertyName")
private var _TextAUnderlineThin: ImageVector? = null
