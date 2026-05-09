package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.LightningSlash: ImageVector
    get() {
        if (_LightningSlash != null) {
            return _LightningSlash!!
        }
        _LightningSlash = ImageVector.Builder(
            name = "Regular.LightningSlash",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.12f, 65.16f)
                lineToRelative(45.88f, -49.16f)
                lineToRelative(-16f, 80f)
                lineToRelative(64f, 24f)
                lineToRelative(-22.3f, 23.9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.79f, 167.37f)
                lineToRelative(-67.79f, 72.63f)
                lineToRelative(16f, -80f)
                lineToRelative(-64f, -24f)
                lineToRelative(44.21f, -47.37f)
            }
        }.build()

        return _LightningSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LightningSlash: ImageVector? = null
