package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FingerprintBold: ImageVector
    get() {
        if (_FingerprintBold != null) {
            return _FingerprintBold!!
        }
        _FingerprintBold = ImageVector.Builder(
            name = "Bold.FingerprintBold",
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
                moveTo(108f, 128f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                arcToRelative(211.13f, 211.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25f, 99.88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 68f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 60f)
                quadToRelative(0f, 12.13f, -1.12f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(51.35f, 192.22f)
                arcTo(131.39f, 131.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 68f, 128f)
                arcTo(59.85f, 59.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 83.29f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(103.32f, 168f)
                arcTo(171f, 171f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83f, 217.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(179.8f, 192f)
                arcToRelative(250.79f, 250.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.4f, 26.12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.28f, 160f)
                arcTo(92f, 92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 128f)
                horizontalLineToRelative(0f)
                arcToRelative(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(293.41f, 293.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 64f)
            }
        }.build()

        return _FingerprintBold!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintBold: ImageVector? = null
