package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.LightningSlashBold: ImageVector
    get() {
        if (_LightningSlashBold != null) {
            return _LightningSlashBold!!
        }
        _LightningSlashBold = ImageVector.Builder(
            name = "Bold.LightningSlashBold",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(119.59f, 59.29f)
                lineToRelative(40.41f, -43.29f)
                lineToRelative(-12f, 80f)
                lineToRelative(60f, 24f)
                lineToRelative(-16.83f, 18.03f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.79f, 167.37f)
                lineToRelative(-67.79f, 72.63f)
                lineToRelative(12f, -80f)
                lineToRelative(-60f, -24f)
                lineToRelative(44.21f, -47.37f)
            }
        }.build()

        return _LightningSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _LightningSlashBold: ImageVector? = null
