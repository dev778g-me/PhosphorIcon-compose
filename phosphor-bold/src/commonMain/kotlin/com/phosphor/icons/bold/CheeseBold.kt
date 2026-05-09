package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CheeseBold: ImageVector
    get() {
        if (_CheeseBold != null) {
            return _CheeseBold!!
        }
        _CheeseBold = ImageVector.Builder(
            name = "Bold.CheeseBold",
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
                moveTo(24f, 160f)
                horizontalLineToRelative(7.46f)
                curveToRelative(13.45f, 0f, 24.79f, -11f, 24.54f, -24.46f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 112f)
                horizontalLineTo(24f)
                verticalLineTo(88f)
                horizontalLineTo(232f)
                verticalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(24f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 88f)
                lineTo(184f, 40f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 88f)
                verticalLineToRelative(16f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 0f)
                verticalLineTo(88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84f, 192f)
                verticalLineTo(180f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 0f)
                verticalLineToRelative(12f)
            }
        }.build()

        return _CheeseBold!!
    }

@Suppress("ObjectPropertyName")
private var _CheeseBold: ImageVector? = null
