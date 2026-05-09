package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.TipJarBold: ImageVector
    get() {
        if (_TipJarBold != null) {
            return _TipJarBold!!
        }
        _TipJarBold = ImageVector.Builder(
            name = "Bold.TipJarBold",
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
                moveTo(80f, 60f)
                lineTo(176f, 60f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 92f)
                lineTo(208f, 200f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                lineTo(80f, 232f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                lineTo(48f, 92f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 60f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 60f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(60f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 60f)
                lineTo(128f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 108f)
                lineTo(128f, 96f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 196f)
                lineTo(128f, 180f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108f, 180f)
                horizontalLineToRelative(30f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -36f)
                horizontalLineTo(118f)
                arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -36f)
                horizontalLineToRelative(30f)
            }
        }.build()

        return _TipJarBold!!
    }

@Suppress("ObjectPropertyName")
private var _TipJarBold: ImageVector? = null
