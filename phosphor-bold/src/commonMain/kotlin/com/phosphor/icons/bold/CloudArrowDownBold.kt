package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.CloudArrowDownBold: ImageVector
    get() {
        if (_CloudArrowDownBold != null) {
            return _CloudArrowDownBold!!
        }
        _CloudArrowDownBold = ImageVector.Builder(
            name = "Bold.CloudArrowDownBold",
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
                moveTo(84f, 208f)
                horizontalLineTo(72f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.92f, 97.74f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 176f)
                lineToRelative(32f, 32f)
                lineToRelative(32f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 128f)
                lineTo(152f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 128f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 151.46f, 36f)
            }
        }.build()

        return _CloudArrowDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowDownBold: ImageVector? = null
