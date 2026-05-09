package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.FingerprintSimple: ImageVector
    get() {
        if (_FingerprintSimple != null) {
            return _FingerprintSimple!!
        }
        _FingerprintSimple = ImageVector.Builder(
            name = "Regular.FingerprintSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 128f)
                arcToRelative(239.33f, 239.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.94f, 91.2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.78f, 96f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 128f)
                arcToRelative(143.41f, 143.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18f, 69.73f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 37.46f)
                arcTo(96.07f, 96.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                arcToRelative(288.93f, 288.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.14f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23.3f, 168f)
                arcTo(95.66f, 95.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 128f)
                arcTo(95.78f, 95.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 56.45f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(110.58f, 208f)
                quadToRelative(-3f, 6.63f, -6.56f, 13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                arcToRelative(192.77f, 192.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 48f)
            }
        }.build()

        return _FingerprintSimple!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintSimple: ImageVector? = null
