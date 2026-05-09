package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FileCSharpBold: ImageVector
    get() {
        if (_FileCSharpBold != null) {
            return _FileCSharpBold!!
        }
        _FileCSharpBold = ImageVector.Builder(
            name = "Bold.FileCSharpBold",
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
                moveTo(148f, 32f)
                lineToRelative(0f, 60f)
                lineToRelative(60f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 224f)
                verticalLineTo(88f)
                lineTo(152f, 32f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(68f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(68f, 200.87f)
                arcTo(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 208f)
                curveToRelative(-13.26f, 0f, -24f, -12.54f, -24f, -28f)
                reflectiveCurveToRelative(10.74f, -28f, 24f, -28f)
                arcToRelative(22.12f, 22.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 7.13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 160f)
                lineTo(172f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 196f)
                lineTo(172f, 196f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 144f)
                lineTo(120f, 212f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 144f)
                lineTo(156f, 212f)
            }
        }.build()

        return _FileCSharpBold!!
    }

@Suppress("ObjectPropertyName")
private var _FileCSharpBold: ImageVector? = null
