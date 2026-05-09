package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FingerprintSimpleBold: ImageVector
    get() {
        if (_FingerprintSimpleBold != null) {
            return _FingerprintSimpleBold!!
        }
        _FingerprintSimpleBold = ImageVector.Builder(
            name = "Bold.FingerprintSimpleBold",
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
                moveTo(159.73f, 92f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 128f)
                arcToRelative(143.41f, 143.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18f, 69.73f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 132f)
                arcToRelative(239.17f, 239.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.91f, 87.21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(108.68f, 212f)
                quadToRelative(-2.22f, 4.56f, -4.68f, 9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                arcToRelative(192.72f, 192.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.07f, 44f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(100f, 36.15f)
                arcTo(96.07f, 96.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                arcToRelative(288.93f, 288.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.14f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23.28f, 168f)
                arcTo(95.66f, 95.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 128f)
                arcTo(95.71f, 95.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 60.23f)
            }
        }.build()

        return _FingerprintSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintSimpleBold: ImageVector? = null
