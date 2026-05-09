package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FileJsBold: ImageVector
    get() {
        if (_FileJsBold != null) {
            return _FileJsBold!!
        }
        _FileJsBold = ImageVector.Builder(
            name = "Bold.FileJsBold",
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
                moveTo(180f, 224f)
                horizontalLineToRelative(20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
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
                moveTo(139.9f, 153.6f)
                reflectiveCurveToRelative(-29.43f, -7.78f, -31.8f, 11f)
                reflectiveCurveToRelative(38.43f, 10.12f, 35.78f, 30.72f)
                curveToRelative(-2.47f, 19.16f, -31.78f, 11f, -31.78f, 11f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(36f, 190f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 0f)
                verticalLineTo(152f)
            }
        }.build()

        return _FileJsBold!!
    }

@Suppress("ObjectPropertyName")
private var _FileJsBold: ImageVector? = null
