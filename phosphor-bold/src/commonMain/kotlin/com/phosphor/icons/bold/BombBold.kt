package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BombBold: ImageVector
    get() {
        if (_BombBold != null) {
            return _BombBold!!
        }
        _BombBold = ImageVector.Builder(
            name = "Bold.BombBold",
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
                moveTo(88f, 64f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(86.66f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
                verticalLineTo(72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112f, 64f)
                reflectiveCurveToRelative(0f, -40f, 32f, -40f)
                reflectiveCurveToRelative(36f, 56f, 68f, 56f)
                reflectiveCurveToRelative(32f, -40f, 32f, -40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(100f, 198.17f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 160f)
            }
        }.build()

        return _BombBold!!
    }

@Suppress("ObjectPropertyName")
private var _BombBold: ImageVector? = null
