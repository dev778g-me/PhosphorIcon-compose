package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MotorcycleBold: ImageVector
    get() {
        if (_MotorcycleBold != null) {
            return _MotorcycleBold!!
        }
        _MotorcycleBold = ImageVector.Builder(
            name = "Bold.MotorcycleBold",
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
                moveTo(48f, 160f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 160f)
                moveToRelative(-36f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, 72f, 0f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 52f)
                lineToRelative(32f, 0f)
                lineToRelative(32f, 108f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 72f)
                reflectiveCurveToRelative(43.31f, 18.34f, 68.56f, 29.81f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.16f, -3.18f)
                curveTo(121.64f, 92.09f, 134.4f, 88f, 152f, 88f)
                horizontalLineToRelative(56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 160f)
                horizontalLineToRelative(88f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, -72f)
            }
        }.build()

        return _MotorcycleBold!!
    }

@Suppress("ObjectPropertyName")
private var _MotorcycleBold: ImageVector? = null
