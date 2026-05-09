package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.FingerprintLight: ImageVector
    get() {
        if (_FingerprintLight != null) {
            return _FingerprintLight!!
        }
        _FingerprintLight = ImageVector.Builder(
            name = "Light.FingerprintLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(50.69f, 184.92f)
                arcTo(127.52f, 127.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 128f)
                arcToRelative(63.85f, 63.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -50f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                arcToRelative(191.11f, 191.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 93f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                arcToRelative(223.12f, 223.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.28f, 95.41f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(218.56f, 184f)
                arcTo(289.45f, 289.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 128f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -192f, 0f)
                arcToRelative(95.8f, 95.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.47f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92.81f, 160f)
                arcToRelative(158.92f, 158.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18.12f, 47.84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 64.5f)
                arcToRelative(66f, 66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -0.49f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                arcToRelative(259.86f, 259.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(183.94f, 192f)
                quadToRelative(-2.28f, 8.88f, -5.18f, 17.5f)
            }
        }.build()

        return _FingerprintLight!!
    }

@Suppress("ObjectPropertyName")
private var _FingerprintLight: ImageVector? = null
