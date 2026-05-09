package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MosqueBold: ImageVector
    get() {
        if (_MosqueBold != null) {
            return _MosqueBold!!
        }
        _MosqueBold = ImageVector.Builder(
            name = "Bold.MosqueBold",
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
                moveTo(200f, 128f)
                lineTo(56f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 156f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                verticalLineToRelative(52f)
                horizontalLineTo(200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 208f)
                horizontalLineTo(16f)
                verticalLineTo(156f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, -20f)
                horizontalLineToRelative(0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 208f)
                verticalLineTo(128f)
                curveToRelative(0f, -64f, 72f, -72f, 72f, -104f)
                curveToRelative(0f, 32f, 72f, 40f, 72f, 104f)
                verticalLineToRelative(80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 208f)
                lineTo(104f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 208f)
                lineTo(152f, 168f)
            }
        }.build()

        return _MosqueBold!!
    }

@Suppress("ObjectPropertyName")
private var _MosqueBold: ImageVector? = null
