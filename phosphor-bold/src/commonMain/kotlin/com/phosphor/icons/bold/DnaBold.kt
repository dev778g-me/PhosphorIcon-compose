package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DnaBold: ImageVector
    get() {
        if (_DnaBold != null) {
            return _DnaBold!!
        }
        _DnaBold = ImageVector.Builder(
            name = "Bold.DnaBold",
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
                moveTo(104f, 40f)
                lineTo(192f, 40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 24f)
                verticalLineTo(51.5f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.8f, 64.4f)
                lineToRelative(48.4f, 24.2f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 204.5f)
                verticalLineTo(232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 216f)
                lineTo(152f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(69.88f, 176f)
                lineTo(134.56f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(86.67f, 152.05f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 204.5f)
                verticalLineTo(232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 24f)
                verticalLineTo(51.5f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 169.33f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(121.44f, 80f)
                lineTo(186.12f, 80f)
            }
        }.build()

        return _DnaBold!!
    }

@Suppress("ObjectPropertyName")
private var _DnaBold: ImageVector? = null
