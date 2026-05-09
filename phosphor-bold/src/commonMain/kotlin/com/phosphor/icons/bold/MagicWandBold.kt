package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.MagicWandBold: ImageVector
    get() {
        if (_MagicWandBold != null) {
            return _MagicWandBold!!
        }
        _MagicWandBold = ImageVector.Builder(
            name = "Bold.MagicWandBold",
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
                moveTo(216f, 128f)
                lineTo(216f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 152f)
                lineTo(240f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 40f)
                lineTo(80f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 64f)
                lineTo(104f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 184f)
                lineTo(168f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 200f)
                lineTo(184f, 200f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 80f)
                lineTo(176f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(42.34f, 181.66f)
                lineTo(181.65f, 42.34f)
                arcTo(8f, 8f, 102.35f, isMoreThanHalf = false, isPositiveArc = true, 192.97f, 42.34f)
                lineTo(213.65f, 63.02f)
                arcTo(8f, 8f, 86.81f, isMoreThanHalf = false, isPositiveArc = true, 213.65f, 74.34f)
                lineTo(74.34f, 213.65f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.02f, 213.65f)
                lineTo(42.34f, 192.97f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42.34f, 181.66f)
                close()
            }
        }.build()

        return _MagicWandBold!!
    }

@Suppress("ObjectPropertyName")
private var _MagicWandBold: ImageVector? = null
