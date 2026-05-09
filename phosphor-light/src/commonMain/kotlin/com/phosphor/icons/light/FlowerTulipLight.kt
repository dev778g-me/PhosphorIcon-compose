package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FlowerTulipLight: ImageVector
    get() {
        if (_FlowerTulipLight != null) {
            return _FlowerTulipLight!!
        }
        _FlowerTulipLight = ImageVector.Builder(
            name = "Light.FlowerTulipLight",
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
                moveTo(128f, 232f)
                lineTo(128f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 56f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                verticalLineToRelative(40f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                horizontalLineToRelative(0f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 96f)
                verticalLineTo(56f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 176f)
                lineToRelative(-0f, -0f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineTo(128f, 136f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -80f)
                lineToRelative(-0f, -0f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineTo(208f, 96f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 208f)
                lineToRelative(48f, 24f)
                lineToRelative(48f, -24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(86.77f, 66f)
                curveTo(100f, 38f, 128f, 24f, 128f, 24f)
                reflectiveCurveToRelative(28f, 14f, 41.23f, 42f)
            }
        }.build()

        return _FlowerTulipLight!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerTulipLight: ImageVector? = null
