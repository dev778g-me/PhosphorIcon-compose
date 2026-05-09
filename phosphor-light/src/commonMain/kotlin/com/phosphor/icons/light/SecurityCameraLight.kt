package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.SecurityCameraLight: ImageVector
    get() {
        if (_SecurityCameraLight != null) {
            return _SecurityCameraLight!!
        }
        _SecurityCameraLight = ImageVector.Builder(
            name = "Light.SecurityCameraLight",
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
                moveTo(248f, 144f)
                lineTo(248f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 36.69f)
                lineTo(52.69f, 168f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.59f, 164.59f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 168f)
                horizontalLineTo(52.69f)
                lineToRelative(37.65f, 37.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineToRelative(120f, -120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.32f)
                lineToRelative(-56f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(165.66f, 141.66f)
                lineToRelative(24f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.65f, 2.34f)
                horizontalLineTo(248f)
            }
        }.build()

        return _SecurityCameraLight!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityCameraLight: ImageVector? = null
