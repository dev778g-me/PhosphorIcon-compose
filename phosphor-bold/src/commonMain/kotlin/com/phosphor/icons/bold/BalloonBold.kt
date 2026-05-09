package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BalloonBold: ImageVector
    get() {
        if (_BalloonBold != null) {
            return _BalloonBold!!
        }
        _BalloonBold = ImageVector.Builder(
            name = "Bold.BalloonBold",
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
                moveTo(208f, 104f)
                curveToRelative(0f, 44.18f, -35.82f, 92f, -80f, 92f)
                reflectiveCurveToRelative(-80f, -47.82f, -80f, -92f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(143.7f, 193.97f)
                lineToRelative(16.3f, 38.03f)
                lineToRelative(-64f, 0f)
                lineToRelative(16.3f, -38.03f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 65.84f)
                arcTo(40.1f, 40.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 167.8f, 100f)
            }
        }.build()

        return _BalloonBold!!
    }

@Suppress("ObjectPropertyName")
private var _BalloonBold: ImageVector? = null
